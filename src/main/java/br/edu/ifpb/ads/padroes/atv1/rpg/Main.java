package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.methodFactory.ElfoCreator;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.methodFactory.FabricaPersonagemCreator;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.methodFactory.HumanoCreator;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.methodFactory.OrcCreator;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.RegistroPrototipos;

public class Main {

    public static void main(String[] args) {
        mostrarAbstractFactory();
        mostrarFactoryMethod();
        mostrarSingleton();
        mostrarPrototype();
        mostrarBuilder();
    }

    private static void mostrarAbstractFactory() {
        FabricaPersonagem fabricaHumano = new FabricaHumano();
        FabricaPersonagem fabricaElfo = new FabricaElfo();
        FabricaPersonagem fabricaOrc = new FabricaOrc();

        System.out.println("-- Abstract Factory: Humanos --");
        imprimirPersonagem(fabricaHumano.criarGuerreiro("Aragorn"));
        imprimirPersonagem(fabricaHumano.criarMago("Merlin"));
        imprimirPersonagem(fabricaHumano.criarArqueiro("Robin"));

        System.out.println("-- Abstract Factory: Elfos --");
        imprimirPersonagem(fabricaElfo.criarGuerreiro("Legolas"));
        imprimirPersonagem(fabricaElfo.criarMago("Elrond"));
        imprimirPersonagem(fabricaElfo.criarArqueiro("Tauriel"));

        System.out.println("-- Abstract Factory: Orcs --");
        imprimirPersonagem(fabricaOrc.criarGuerreiro("Durotan"));
        imprimirPersonagem(fabricaOrc.criarMago("Gul'dan"));
        imprimirPersonagem(fabricaOrc.criarArqueiro("Garona"));
    }

    private static void mostrarFactoryMethod() {
        FabricaPersonagemCreator humanoCreator = new HumanoCreator();
        FabricaPersonagemCreator elfoCreator = new ElfoCreator();
        FabricaPersonagemCreator orcCreator = new OrcCreator();

        System.out.println("-- Factory Method: criando fábricas --");
        FabricaPersonagem fabricaHumano = humanoCreator.criarFabrica();
        FabricaPersonagem fabricaElfo = elfoCreator.criarFabrica();
        FabricaPersonagem fabricaOrc = orcCreator.criarFabrica();

        imprimirPersonagem(fabricaHumano.criarArqueiro("Robin Hood"));
        imprimirPersonagem(fabricaElfo.criarMago("Gandalf"));
        imprimirPersonagem(fabricaOrc.criarGuerreiro("Thrall"));
    }

    private static void mostrarSingleton() {
        ConfiguracaoJogo primeiraInstancia = ConfiguracaoJogo.getInstancia();
        primeiraInstancia.setNivelDificuldade(3);

        ConfiguracaoJogo segundaInstancia = ConfiguracaoJogo.getInstancia();

        System.out.println("-- Singleton: configuração do jogo --");
        System.out.println("Instância 1 dificuldade: " + primeiraInstancia.getNivelDificuldade());
        System.out.println("Instância 2 dificuldade: " + segundaInstancia.getNivelDificuldade());
        System.out.println("Mesma instância: " + (primeiraInstancia == segundaInstancia));
        System.out.println();
    }

    private static void mostrarPrototype() {
        FabricaPersonagem fabricaHumano = new FabricaHumano();
        FabricaPersonagem fabricaElfo = new FabricaElfo();
        FabricaPersonagem fabricaOrc = new FabricaOrc();

        RegistroPrototipos registro = new RegistroPrototipos();
        registro.adicionarPrototipo("guerreiroHumano", fabricaHumano.criarGuerreiro("Prototipo Humano"));
        registro.adicionarPrototipo("magoElfo", fabricaElfo.criarMago("Prototipo Elfo"));
        registro.adicionarPrototipo("arqueiroOrc", fabricaOrc.criarArqueiro("Prototipo Orc"));

        System.out.println("-- Prototype: clonando personagens --");
        Personagem cloneHumano = registro.criarPersonagem("guerreiroHumano");
        cloneHumano.setNome("Aragorn Clone");
        cloneHumano.getArma().setNome("Espada Clone");
        imprimirPersonagem(cloneHumano);

        Personagem cloneElfo = registro.criarPersonagem("magoElfo");
        cloneElfo.setNome("Elrond Clone");
        cloneElfo.getArmadura().setNome("Robe Clone");
        imprimirPersonagem(cloneElfo);

        Personagem cloneOrc = registro.criarPersonagem("arqueiroOrc");
        cloneOrc.setNome("Garona Clone");
        cloneOrc.getArma().setDano(17);
        imprimirPersonagem(cloneOrc);
    }

    private static void mostrarBuilder() {
        System.out.println("-- Builder: personagem personalizado --");
        Personagem customizado = new PersonagemBuilder()
                .nome("Ariane")
                .raca("Humana")
                .classe("Assassina")
                .forca(12)
                .inteligencia(14)
                .agilidade(20)
                .vida(75)
                .mana(45)
                .arma(criarArma("Adaga Sombria", 11, "Adaga"))
                .armadura(criarArmadura("Manto das Sombras", 5, "Leve"))
                .habilidades(new String[]{"Ataque Surpresa", "Desaparecer", "Golpe Fatal"})
                .build();

        imprimirPersonagem(customizado);
    }

    private static void imprimirPersonagem(Personagem personagem) {
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Raça: " + personagem.getRaca());
        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Força: " + personagem.getForca());
        System.out.println("Inteligência: " + personagem.getInteligencia());
        System.out.println("Agilidade: " + personagem.getAgilidade());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("Mana: " + personagem.getMana());
        System.out.println("Arma: " + personagem.getArma().getNome() + " (" + personagem.getArma().getTipo() + ", dano=" + personagem.getArma().getDano() + ")");
        System.out.println("Armadura: " + personagem.getArmadura().getNome() + " (" + personagem.getArmadura().getTipo() + ", defesa=" + personagem.getArmadura().getDano() + ")");
        String[] habilidades = personagem.getHabilidades();
        if (habilidades != null && habilidades.length > 0) {
            System.out.print("Habilidades: ");
            for (int i = 0; i < habilidades.length; i++) {
                System.out.print(habilidades[i]);
                if (i < habilidades.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static Arma criarArma(String nome, int dano, String tipo) {
        Arma arma = new Arma();
        arma.setNome(nome);
        arma.setDano(dano);
        arma.setTipo(tipo);
        return arma;
    }

    private static Armadura criarArmadura(String nome, int defesa, String tipo) {
        Armadura armadura = new Armadura();
        armadura.setNome(nome);
        armadura.setDano(defesa);
        armadura.setTipo(tipo);
        return armadura;
    }
}