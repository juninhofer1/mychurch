package br.com.my.church.mychurch.infrastructure.controllers.user;

import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.controllers.user.request.CreateUserRequest;
import br.com.my.church.mychurch.infrastructure.controllers.user.response.CreateUserResponse;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchEntity;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserEntity;

public class UserDTOMapper {

   public CreateUserResponse toResponse(User userDomainObj) {
        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.setEmail(userDomainObj.getEmail());
        createUserResponse.setFone(userDomainObj.getFone());
        createUserResponse.setNome(userDomainObj.getNome());
        createUserResponse.setNascimento(userDomainObj.getNascimento());
        createUserResponse.setPerfil(userDomainObj.getPerfil());
//        createUserResponse.setIgreja(new ChurchEntity());
        return createUserResponse;
    }

    public User toEntity(CreateUserRequest request) {
        User userDomainObj = new User();
        userDomainObj.setEmail(request.getEmail());
        userDomainObj.setFone(request.getFone());
        userDomainObj.setNome(request.getNome());
        userDomainObj.setNascimento(request.getNascimento());
        userDomainObj.setPerfil(request.getPerfil());
        userDomainObj.setIgreja(new Church());
        return userDomainObj;
    }

}
