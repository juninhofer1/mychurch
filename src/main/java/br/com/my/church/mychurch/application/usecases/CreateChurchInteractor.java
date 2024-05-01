package br.com.my.church.mychurch.application.usecases;
import br.com.my.church.mychurch.application.getways.ChurchGatway;
import br.com.my.church.mychurch.domain.entity.Church;

public class CreateChurchInteractor {

    private ChurchGatway churchGatway;

    public CreateChurchInteractor(ChurchGatway churchGatway) {
        this.churchGatway = churchGatway;
    }

    public Church createChurch(Church church) {
        return churchGatway.createChurch(church);
    }

    public Church loadByTk(String tk) {
        return churchGatway.loadChurch(tk);
    }

    public Church loadById(Long id) {
        return churchGatway.loadChurch(id);
    }
}
