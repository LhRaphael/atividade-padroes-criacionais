package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public interface FabricaPersonagem {

    Personagem criarGuerreiro(String nome);

    Personagem criarMago(String nome);

    Personagem criarArqueiro(String nome);
}