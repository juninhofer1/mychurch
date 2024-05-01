package br.com.my.church.mychurch.infrastructure.gatways.user;

import br.com.my.church.mychurch.domain.entity.User;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserEntity;

import java.util.Date;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObj) {
        UserEntity userEntity = new UserEntity();
        userEntity.setBirthday(userDomainObj.getBirthday());
        userEntity.setName(userDomainObj.getName());
        userEntity.setPhone(userDomainObj.getPhone());
        userEntity.setActive(userDomainObj.getActive());
        userEntity.setProfile(userDomainObj.getProfile());
        userEntity.setEmail(userDomainObj.getEmail());
        userEntity.setEmail(userDomainObj.getEmail());
        userEntity.setPassword(userDomainObj.getPassword());
        userEntity.setRegisterDate(new Date());
        return userEntity;
    }

    User toDomainObj(UserEntity userEntity) {
        User userDomainObj = new User();
        userDomainObj.setBirthday(userEntity.getBirthday());
        userDomainObj.setName(userEntity.getName());
        userDomainObj.setPhone(userEntity.getPhone());
        userDomainObj.setActive(userEntity.getActive());
        userDomainObj.setProfile(userEntity.getProfile());
        userDomainObj.setEmail(userEntity.getEmail());
        userDomainObj.setEmail(userEntity.getEmail());
        userDomainObj.setPassword(userEntity.getPassword());
        userDomainObj.setRegisterDate(userEntity.getRegisterDate());
        userDomainObj.setChurch(userEntity.getChurch().getToken());
        return userDomainObj;
    }

}
