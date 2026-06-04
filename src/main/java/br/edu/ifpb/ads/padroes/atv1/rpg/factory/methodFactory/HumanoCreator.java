package br.edu.ifpb.ads.padroes.atv1.rpg.factory.methodFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaPersonagem;

public class HumanoCreator extends FabricaPersonagemCreator {

    @Override
    public FabricaPersonagem criarFabrica() {
        return new FabricaHumano();
    }
}