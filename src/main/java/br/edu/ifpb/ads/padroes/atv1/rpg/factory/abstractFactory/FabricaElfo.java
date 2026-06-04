package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

/**
 * Fábrica Concreta para criação de personagens Elfos.
 * Implementa a interface FabricaPersonagem e cria personagens
 * com características específicas de Elfos.
 * 
 * Elfos são ágeis e conectados à magia, com altos valores de
 * inteligência e agilidade, mas força mais baixa.
 */
public class FabricaElfo implements FabricaPersonagem {

    @Override
    public Personagem criarGuerreiro(String nome) {
        Personagem guerreiro = new Personagem();
        guerreiro.setNome(nome);
        guerreiro.setRaca("Elfo");
        guerreiro.setClasse("Guerreiro");
        
        // Atributos de elfo: alta agilidade e inteligência, força moderada
        guerreiro.setForca(15);
        guerreiro.setInteligencia(15);
        guerreiro.setAgilidade(19);
        
        // Vida e Mana balanceados
        guerreiro.setVida(85);
        guerreiro.setMana(45);
        
        // Arma e Armadura
        Arma espadadoada = new Arma();
        espadadoada.setNome("Espada Éter");
        espadadoada.setDano(14);
        espadadoada.setTipo("Espada Leve");
        guerreiro.setArma(espadadoada);
        
        Armadura armaduraElfo = new Armadura();
        armaduraElfo.setNome("Armadura de Mithril");
        armaduraElfo.setDano(9);
        armaduraElfo.setTipo("Média");
        guerreiro.setArmadura(armaduraElfo);
        
        // Habilidades específicas
        guerreiro.setHabilidades(new String[]{"Dança das Folhas", "Salto Acrobático", "Golpe Preciso"});
        
        return guerreiro;
    }

    @Override
    public Personagem criarMago(String nome) {
        Personagem mago = new Personagem();
        mago.setNome(nome);
        mago.setRaca("Elfo");
        mago.setClasse("Mago");
        
        // Atributos de elfo: inteligência e agilidade muito altas
        mago.setForca(8);
        mago.setInteligencia(20);
        mago.setAgilidade(17);
        
        // Mana muito elevada
        mago.setVida(55);
        mago.setMana(150);
        
        // Arma e Armadura
        Arma cajadoMagico = new Arma();
        cajadoMagico.setNome("Cajado Arcano");
        cajadoMagico.setDano(10);
        cajadoMagico.setTipo("Cajado Mágico");
        mago.setArma(cajadoMagico);
        
        Armadura robeElfa = new Armadura();
        robeElfa.setNome("Robe de Seda Mágica");
        robeElfa.setDano(4);
        robeElfa.setTipo("Leve");
        mago.setArmadura(robeElfa);
        
        // Habilidades específicas
        mago.setHabilidades(new String[]{"Encantamento", "Raio Arcano", "Cura Mágica"});
        
        return mago;
    }

    @Override
    public Personagem criarArqueiro(String nome) {
        Personagem arqueiro = new Personagem();
        arqueiro.setNome(nome);
        arqueiro.setRaca("Elfo");
        arqueiro.setClasse("Arqueiro");
        
        // Atributos de elfo: agilidade muito alta
        arqueiro.setForca(13);
        arqueiro.setInteligencia(15);
        arqueiro.setAgilidade(20);
        
        // Vida moderada, mana elevada (natureza)
        arqueiro.setVida(75);
        arqueiro.setMana(70);
        
        // Arma e Armadura
        Arma arcoElfico = new Arma();
        arcoElfico.setNome("Arco de Teixo");
        arcoElfico.setDano(13);
        arcoElfico.setTipo("Arco Longo");
        arqueiro.setArma(arcoElfico);
        
        Armadura armaduraArqueiro = new Armadura();
        armaduraArqueiro.setNome("Armadura de Folhas Encantadas");
        armaduraArqueiro.setDano(6);
        armaduraArqueiro.setTipo("Leve");
        arqueiro.setArmadura(armaduraArqueiro);
        
        // Habilidades específicas
        arqueiro.setHabilidades(new String[]{"Chuva de Flechas", "Ataque Rápido", "Flecha de Gelo"});
        
        return arqueiro;
    }
}
