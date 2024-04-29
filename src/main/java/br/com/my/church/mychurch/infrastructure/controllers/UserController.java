package br.com.my.church.mychurch.infrastructure.controllers;

import br.com.my.church.mychurch.application.usecases.CreateUserInteractor;
import br.com.my.church.mychurch.domain.entity.User;
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

    public UserController(CreateUserInteractor userInteractor, UserDTOMapper userDTOMapper) {
        this.userInteractor = userInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @ApiOperation(value = "Busca a lista de usuários cadastrados")
    @PostMapping("/criar-usuario")
    CreateUserResponse create(@RequestBody CreateUserRequest request) {
        User userDomainObj = userDTOMapper.toEntity(request);
        User userSaved = userInteractor.createUser(userDomainObj);
        return userDTOMapper.toResponse(userSaved);
    }
}
