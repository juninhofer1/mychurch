package br.com.my.church.mychurch.infrastructure.gatways.church;

import br.com.my.church.mychurch.application.getways.ChurchGatway;
import br.com.my.church.mychurch.application.getways.UserGatway;
import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.infrastructure.gatways.user.UserEntityMapper;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchEntity;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchRepository;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserEntity;
import br.com.my.church.mychurch.infrastructure.persistence.user.UserRepository;

public class ChurchRepositoryGatway implements ChurchGatway {

    private final ChurchRepository churchRepository;
    private final ChurchEntityMapper churchEntityMapper;

    public ChurchRepositoryGatway(ChurchRepository churchRepository, ChurchEntityMapper churchEntityMapper) {
        this.churchRepository = churchRepository;
        this.churchEntityMapper = churchEntityMapper;
    }

    @Override
    public Church createChurch(Church church) {
        ChurchEntity churchEntity = churchEntityMapper.toEntity(church);
        ChurchEntity churchEntityResult = churchRepository.save(churchEntity);
        return churchEntityMapper.toDomainObj(churchEntityResult);
    }

    @Override
    public Church loadChurch(String token) {
        ChurchEntity churchEntityResult = churchRepository.findByToken(token);
        if(churchEntityResult != null)
            return churchEntityMapper.toDomainObj(churchEntityResult);
        return null;
    }

    @Override
    public Church loadChurch(Long id) {
        ChurchEntity churchEntityResult = churchRepository.findById(id.longValue());
        if(churchEntityResult != null)
            return churchEntityMapper.toDomainObj(churchEntityResult);
        return null;
    }
}
