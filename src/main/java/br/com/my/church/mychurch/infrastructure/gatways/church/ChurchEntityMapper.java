package br.com.my.church.mychurch.infrastructure.gatways.church;

import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchEntity;

public class ChurchEntityMapper {
    ChurchEntity toEntity(Church churchDomainObj) {
        return new ChurchEntity(churchDomainObj.getName(),
                churchDomainObj.getPhone(),
                churchDomainObj.getToken());
    }

    Church toDomainObj(ChurchEntity churchEntity) {
        Church churchDomainObj = new Church();
        churchDomainObj.setName(churchEntity.getName());
        churchDomainObj.setName(churchEntity.getToken());
        churchDomainObj.setPhone(churchEntity.getPhone());
        churchDomainObj.setId(churchEntity.getId());
        return churchDomainObj;
    }
}
