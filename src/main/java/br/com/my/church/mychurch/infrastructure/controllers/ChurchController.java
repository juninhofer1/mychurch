package br.com.my.church.mychurch.infrastructure.controllers;

import br.com.my.church.mychurch.application.usecases.CreateUserInteractor;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.domain.entity.ValidatedField;
import br.com.my.church.mychurch.infrastructure.controllers.church.response.CreateChurchResponse;
import br.com.my.church.mychurch.infrastructure.controllers.user.UserDTOMapper;
import br.com.my.church.mychurch.infrastructure.controllers.user.request.CreateUserRequest;
import br.com.my.church.mychurch.infrastructure.controllers.user.response.CreateUserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Igreja")
public class ChurchController {
    private final CreateUserInteractor userInteractor;
    private final UserDTOMapper userDTOMapper;

    public ChurchController(CreateUserInteractor userInteractor, UserDTOMapper userDTOMapper) {
        this.userInteractor = userInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @ApiOperation(value = "Busca a lista de usuários cadastrados")
    @PostMapping("/criar-igreja")
    BaseResponse<CreateChurchResponse> create(@RequestBody CreateUserRequest request) {
//        User userDomainObj = userDTOMapper.toEntity(request);
//        BaseResponse baseResponse;
//        ValidatedField result = userDomainObj.validarCampos();
//        if (result.getSuccess()) {
//            User userSaved = userInteractor.createUser(userDomainObj);
//            CreateUserResponse response = userDTOMapper.toResponse(userSaved);
//            baseResponse = new BaseResponse<>(response, "Cadastro usuário realizado com sucesso", 0);
//            baseResponse.setObject(userSaved);
//        } else {
//            baseResponse = new BaseResponse<CreateUserResponse>(false, result.getMsm(), 0);
//        }
        return new BaseResponse<CreateChurchResponse>(false, "", 0);
    }
}