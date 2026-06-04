package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

/**
 * Fábrica Concreta para criação de personagens Orcs.
 * Implementa a interface FabricaPersonagem e cria personagens
 * com características específicas de Orcs.
 * 
 * Orcs são fortes e resistentes, com alta força e vida,
 * mas inteligência e agilidade mais baixas.
 */
public class FabricaOrc implements FabricaPersonagem {

    @Override
    public Personagem criarGuerreiro(String nome) {
        Personagem guerreiro = new Personagem();
        guerreiro.setNome(nome);
        guerreiro.setRaca("Orc");
        guerreiro.setClasse("Guerreiro");
        
        // Atributos de orc: força muito alta
        guerreiro.setForca(20);
        guerreiro.setInteligencia(10);
        guerreiro.setAgilidade(12);
        
        // Vida muito elevada
        guerreiro.setVida(130);
        guerreiro.setMana(20);
        
        // Arma e Armadura
        Arma machado = new Arma();
        machado.setNome("Machado de Mina");
        machado.setDano(18);
        machado.setTipo("Machado");
        guerreiro.setArma(machado);
        
        Armadura armaduraOrc = new Armadura();
        armaduraOrc.setNome("Armadura de Ferro Pesado");
        armaduraOrc.setDano(12);
        armaduraOrc.setTipo("Muito Pesada");
        guerreiro.setArmadura(armaduraOrc);
        
        // Habilidades específicas
        guerreiro.setHabilidades(new String[]{"Ataque Brutal", "Fúria Orca", "Golpe Devastador"});
        
        return guerreiro;
    }

    @Override
    public Personagem criarMago(String nome) {
        Personagem mago = new Personagem();
        mago.setNome(nome);
        mago.setRaca("Orc");
        mago.setClasse("Mago");
        
        // Atributos de orc: força moderada, inteligência adequada
        mago.setForca(14);
        mago.setInteligencia(16);
        mago.setAgilidade(11);
        
        // Vida moderada, mana bem elevada (magia escura)
        mago.setVida(75);
        mago.setMana(110);
        
        // Arma e Armadura
        Arma varinhaSombria = new Arma();
        varinhaSombria.setNome("Varinha de Obsidiana");
        varinhaSombria.setDano(11);
        varinhaSombria.setTipo("Varinha Mágica");
        mago.setArma(varinhaSombria);
        
        Armadura robeOrc = new Armadura();
        robeOrc.setNome("Robe de Osso");
        robeOrc.setDano(7);
        robeOrc.setTipo("Média");
        mago.setArmadura(robeOrc);
        
        // Habilidades específicas
        mago.setHabilidades(new String[]{"Magia Escura", "Maldição", "Ataque de Energia"});
        
        return mago;
    }

    @Override
    public Personagem criarArqueiro(String nome) {
        Personagem arqueiro = new Personagem();
        arqueiro.setNome(nome);
        arqueiro.setRaca("Orc");
        arqueiro.setClasse("Arqueiro");
        
        // Atributos de orc: força alta, agilidade moderada
        arqueiro.setForca(17);
        arqueiro.setInteligencia(11);
        arqueiro.setAgilidade(15);
        
        // Vida elevada
        arqueiro.setVida(100);
        arqueiro.setMana(40);
        
        // Arma e Armadura
        Arma arcoPesado = new Arma();
        arcoPesado.setNome("Arco de Guerra");
        arcoPesado.setDano(15);
        arcoPesado.setTipo("Arco Curto");
        arqueiro.setArma(arcoPesado);
        
        Armadura armaduraArqueiro = new Armadura();
        armaduraArqueiro.setNome("Armadura de Couro Reforçado");
        armaduraArqueiro.setDano(8);
        armaduraArqueiro.setTipo("Média");
        arqueiro.setArmadura(armaduraArqueiro);
        
        // Habilidades específicas
        arqueiro.setHabilidades(new String[]{"Tiro Poderoso", "Salva de Flechas", "Flecha de Chamas"});
        
        return arqueiro;
    }
}
