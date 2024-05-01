package br.com.my.church.mychurch.infrastructure.controllers.user;

import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.controllers.user.request.CreateUserRequest;
import br.com.my.church.mychurch.infrastructure.controllers.user.response.CreateUserResponse;

public class UserDTOMapper {

   public CreateUserResponse toResponse(User userDomainObj) {
        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.setId(userDomainObj.getId());
        createUserResponse.setBirthday(userDomainObj.getBirthday());
        createUserResponse.setName(userDomainObj.getName());
        createUserResponse.setPhone(userDomainObj.getPhone());
        createUserResponse.setActive(userDomainObj.getActive());
        createUserResponse.setProfile(userDomainObj.getProfile());
        createUserResponse.setEmail(userDomainObj.getEmail());
        createUserResponse.setRegisterDate(userDomainObj.getRegisterDate());
        return createUserResponse;
    }

    public User toEntity(CreateUserRequest request) {
        User userDomainObj = new User();
        userDomainObj.setId(request.getId());
        userDomainObj.setBirthday(request.getBirthday());
        userDomainObj.setName(request.getName());
        userDomainObj.setPhone(request.getPhone());
        userDomainObj.setActive(request.getActive());
        userDomainObj.setProfile(request.getProfile());
        userDomainObj.setEmail(request.getEmail());
        userDomainObj.setEmail(request.getEmail());
        userDomainObj.setPassword(request.getPassword());
        userDomainObj.setChurch(request.getChurch());
        return userDomainObj;
    }

}
