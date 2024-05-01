package br.com.my.church.mychurch.application.getways;

import br.com.my.church.mychurch.domain.entity.Church;
import br.com.my.church.mychurch.domain.entity.User;

public interface ChurchGatway {
    Church createChurch(Church church);
    Church loadChurch(String token);
    Church loadChurch(Long id);
}
