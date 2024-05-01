package br.com.my.church.mychurch.main;

import br.com.my.church.mychurch.application.getways.ChurchGatway;
import br.com.my.church.mychurch.application.usecases.CreateChurchInteractor;
import br.com.my.church.mychurch.infrastructure.controllers.church.ChurchDTOMapper;
import br.com.my.church.mychurch.infrastructure.gatways.church.ChurchEntityMapper;
import br.com.my.church.mychurch.infrastructure.gatways.church.ChurchRepositoryGatway;
import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChurchConfig {

    @Bean
    CreateChurchInteractor createChurchCase(ChurchGatway churchGatway) {
        return new CreateChurchInteractor(churchGatway);
    }

    @Bean
    ChurchGatway churchGatway(ChurchRepository churchRepository, ChurchEntityMapper churchEntityMapper) {
        return new ChurchRepositoryGatway(churchRepository, churchEntityMapper);
    }

    @Bean
    ChurchEntityMapper churchEntityMapper() {
        return new ChurchEntityMapper();
    }

    @Bean
    ChurchDTOMapper churchDTOMapper() {
        return new ChurchDTOMapper();
    }


}