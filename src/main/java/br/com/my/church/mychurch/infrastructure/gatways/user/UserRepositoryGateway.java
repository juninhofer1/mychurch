package br.com.my.church.mychurch.infrastructure.gatways.user;

import br.com.my.church.mychurch.application.getways.UserGatway;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserEntity;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserRepository;

public class UserRepositoryGateway implements UserGatway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository usuarioRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = usuarioRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity userEntityResult = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(userEntityResult);
    }
}
