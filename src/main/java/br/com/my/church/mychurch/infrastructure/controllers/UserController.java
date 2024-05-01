package br.com.my.church.mychurch.infrastructure.controllers;

import br.com.my.church.mychurch.application.usecases.CreateChurchInteractor;
import br.com.my.church.mychurch.application.usecases.CreateUserInteractor;
import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.domain.entity.ValidatedField;
import br.com.my.church.mychurch.infrastructure.controllers.user.UserDTOMapper;
import br.com.my.church.mychurch.infrastructure.controllers.user.request.CreateUserRequest;
import br.com.my.church.mychurch.infrastructure.controllers.user.response.CreateUserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Usuario")
public class UserController {
    private final CreateUserInteractor userInteractor;
    private final UserDTOMapper userDTOMapper;
    private final CreateChurchInteractor createChurchInteractor;

    public UserController(CreateUserInteractor userInteractor, UserDTOMapper userDTOMapper, CreateChurchInteractor createChurchInteractor) {
        this.userInteractor = userInteractor;
        this.userDTOMapper = userDTOMapper;
        this.createChurchInteractor = createChurchInteractor;
    }

    @ApiOperation(value = "Busca a lista de usuários cadastrados")
    @PostMapping("/criar-usuario")
    BaseResponse<CreateUserResponse> create(@RequestBody CreateUserRequest request) {
        User userDomainObj = userDTOMapper.toEntity(request);
        Church church = createChurchInteractor.loadByTk(request.getChurch());
        if(church == null) {
            return new BaseResponse<>(false, "Igreja não encontrada, entre em contado com o suporte para continuar seu cadastro", 0);
        }

        if (userInteractor.loadByEmail(request.getEmail()) != null) {
            return new BaseResponse<>(false, "Utilize outro email para criar seu cadastro", 0);
        }

        BaseResponse baseResponse;
        ValidatedField result = userDomainObj.validarCampos();
        if (result.getSuccess()) {
            User userSaved = userInteractor.createUser(userDomainObj);
            CreateUserResponse response = userDTOMapper.toResponse(userSaved);
            baseResponse = new BaseResponse<>(response, "Cadastro usuário realizado com sucesso", 0);
        } else {
            baseResponse = new BaseResponse<CreateUserResponse>(false, result.getMsm(), 0);
        }
        return baseResponse;
    }
}
