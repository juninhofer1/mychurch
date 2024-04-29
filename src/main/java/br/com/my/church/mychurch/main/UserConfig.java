package br.com.my.church.mychurch.main;

import br.com.my.church.mychurch.application.getways.UserGatway;
import br.com.my.church.mychurch.application.usecases.CreateUserInteractor;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.controllers.user.UserDTOMapper;
import br.com.my.church.mychurch.infrastructure.gatways.user.UserEntityMapper;
import br.com.my.church.mychurch.infrastructure.gatways.user.UserRepositoryGateway;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGatway userGatway) {
        return new CreateUserInteractor(userGatway);
    }

    @Bean
    UserGatway userGatway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }


}