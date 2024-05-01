package br.com.my.church.mychurch.infrastructure.controllers.church;

import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.controllers.church.request.CreateChurchRequest;
import br.com.my.church.mychurch.infrastructure.controllers.church.response.CreateChurchResponse;
import br.com.my.church.mychurch.infrastructure.controllers.user.request.CreateUserRequest;
import br.com.my.church.mychurch.infrastructure.controllers.user.response.CreateUserResponse;

public class ChurchDTOMapper {

    public CreateChurchResponse toResponse(Church churchDomainObj) {
        CreateChurchResponse createChurchResponse = new CreateChurchResponse();
        return createChurchResponse;
    }

    public Church toEntity(CreateChurchRequest request) {
        Church userDomainObj = new Church();
        return userDomainObj;
    }
}
