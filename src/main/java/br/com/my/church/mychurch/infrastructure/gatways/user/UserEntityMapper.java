package br.com.my.church.mychurch.infrastructure.gatways.user;

import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObj) {

        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userDomainObj.getEmail());
        userEntity.setFone(userDomainObj.getFone());
        userEntity.setNome(userDomainObj.getNome());
        userEntity.setNascimento(userDomainObj.getNascimento());
        userEntity.setPerfil(userDomainObj.getPerfil());
//        userEntity.setIgreja(new ChurchEntity());

        return userEntity;
    }

    User toDomainObj(UserEntity userEntity) {

        User userDomainObj = new User();
        userDomainObj.setEmail(userEntity.getEmail());
        userDomainObj.setFone(userEntity.getFone());
        userDomainObj.setNome(userEntity.getNome());
        userDomainObj.setNascimento(userEntity.getNascimento());
        userDomainObj.setPerfil(userEntity.getPerfil());
//        userDomainObj.setIgreja(new Church());

        return userDomainObj;
    }

}
