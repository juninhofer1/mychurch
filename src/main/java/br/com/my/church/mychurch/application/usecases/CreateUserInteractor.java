package br.com.my.church.mychurch.application.usecases;

import br.com.my.church.mychurch.application.getways.UserGatway;
import br.com.my.church.mychurch.domain.entity.User;

public class CreateUserInteractor {

    private UserGatway userGatway;

    public CreateUserInteractor(UserGatway userGatway) {
        this.userGatway = userGatway;
    }

    public User createUser(User usuario) {
        return userGatway.createUser(usuario);
    }

    public User loadByEmail(String email) {
        return userGatway.loadByEmail(email);
    }
}
