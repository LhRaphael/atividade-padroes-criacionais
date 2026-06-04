package br.edu.ifpb.ads.padroes.atv1.rpg.factory.methodFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaPersonagem;

public class ElfoCreator extends FabricaPersonagemCreator {

    @Override
    public FabricaPersonagem criarFabrica() {
        return new FabricaElfo();
    }
}