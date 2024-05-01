package br.com.my.church.mychurch.infrastructure.gatways.user;

import br.com.my.church.mychurch.application.getways.UserGatway;
import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.gatways.church.ChurchEntityMapper;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchEntity;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchRepository;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserEntity;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserRepository;

public class UserRepositoryGateway implements UserGatway {

    private final UserRepository userRepository;

    private final ChurchRepository churchRepository;

    private final UserEntityMapper userEntityMapper;

    private final ChurchEntityMapper churchEntityMapper;

    public UserRepositoryGateway(UserRepository usuarioRepository, UserEntityMapper userEntityMapper, ChurchRepository churchRepository, ChurchEntityMapper churchEntityMapper) {
        this.userRepository = usuarioRepository;
        this.userEntityMapper = userEntityMapper;
        this.churchRepository = churchRepository;
        this.churchEntityMapper = churchEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        ChurchEntity churchEntity = churchRepository.findByToken(userDomainObj.getChurch());
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        userEntity.setChurch(churchEntity);
        UserEntity userEntityResult = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(userEntityResult);
    }

    @Override
    public User loadByEmail(String email) {
        UserEntity userEntityResult = userRepository.findByEmail(email);
        if (userEntityResult != null)
            return userEntityMapper.toDomainObj(userEntityResult);
        return null;
    }
}
