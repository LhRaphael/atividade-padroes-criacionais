package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

/**
 * Fábrica Concreta para criação de personagens Humanos.
 * Implementa a interface FabricaPersonagem e cria personagens
 * com características específicas de Humanos.
 * 
 * Humanos são versáteis, com atributos balanceados.
 */
public class FabricaHumano implements FabricaPersonagem {

    @Override
    public Personagem criarGuerreiro(String nome) {
        Personagem guerreiro = new Personagem();
        guerreiro.setNome(nome);
        guerreiro.setRaca("Humano");
        guerreiro.setClasse("Guerreiro");
        
        // Atributos balanceados com ênfase em força
        guerreiro.setForca(18);
        guerreiro.setInteligencia(12);
        guerreiro.setAgilidade(14);
        
        // Vida e Mana padrão
        guerreiro.setVida(100);
        guerreiro.setMana(30);
        
        // Arma e Armadura
        Arma espada = new Arma();
        espada.setNome("Espada de Aço");
        espada.setDano(15);
        espada.setTipo("Espada");
        guerreiro.setArma(espada);
        
        Armadura armaduraGuerreiro = new Armadura();
        armaduraGuerreiro.setNome("Armadura de Placas");
        armaduraGuerreiro.setDano(10);
        armaduraGuerreiro.setTipo("Pesada");
        guerreiro.setArmadura(armaduraGuerreiro);
        
        // Habilidades específicas
        guerreiro.setHabilidades(new String[]{"Golpe de Escudo", "Investida", "Grito de Guerra"});
        
        return guerreiro;
    }

    @Override
    public Personagem criarMago(String nome) {
        Personagem mago = new Personagem();
        mago.setNome(nome);
        mago.setRaca("Humano");
        mago.setClasse("Mago");
        
        // Atributos balanceados com ênfase em inteligência
        mago.setForca(10);
        mago.setInteligencia(18);
        mago.setAgilidade(14);
        
        // Mana elevada, vida padrão
        mago.setVida(60);
        mago.setMana(120);
        
        // Arma e Armadura
        Arma varinha = new Arma();
        varinha.setNome("Varinha de Carvalho");
        varinha.setDano(8);
        varinha.setTipo("Varinha Mágica");
        mago.setArma(varinha);
        
        Armadura armaduraMago = new Armadura();
        armaduraMago.setNome("Robe Arcano");
        armaduraMago.setDano(5);
        armaduraMago.setTipo("Leve");
        mago.setArmadura(armaduraMago);
        
        // Habilidades específicas
        mago.setHabilidades(new String[]{"Bola de Fogo", "Escudo Mágico", "Teleporte"});
        
        return mago;
    }

    @Override
    public Personagem criarArqueiro(String nome) {
        Personagem arqueiro = new Personagem();
        arqueiro.setNome(nome);
        arqueiro.setRaca("Humano");
        arqueiro.setClasse("Arqueiro");
        
        // Atributos balanceados com ênfase em agilidade
        arqueiro.setForca(14);
        arqueiro.setInteligencia(12);
        arqueiro.setAgilidade(18);
        
        // Vida e Mana padrão
        arqueiro.setVida(80);
        arqueiro.setMana(50);
        
        // Arma e Armadura
        Arma arco = new Arma();
        arco.setNome("Arco Longo");
        arco.setDano(12);
        arco.setTipo("Arco");
        arqueiro.setArma(arco);
        
        Armadura armaduraArqueiro = new Armadura();
        armaduraArqueiro.setNome("Couraria de Couro");
        armaduraArqueiro.setDano(7);
        armaduraArqueiro.setTipo("Média");
        arqueiro.setArmadura(armaduraArqueiro);
        
        // Habilidades específicas
        arqueiro.setHabilidades(new String[]{"Tiro Múltiplo", "Precisão Letal", "Flecha de Veneno"});
        
        return arqueiro;
    }
}
