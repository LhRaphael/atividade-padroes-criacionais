package br.edu.ifpb.ads.padroes.atv1.rpg.prototype;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;
import java.util.HashMap;
import java.util.Map;

public class RegistroPrototipos {

    private final Map<String, Personagem> prototipos = new HashMap<>();

    public void adicionarPrototipo(String chave, Personagem personagem) {
        prototipos.put(chave, personagem);
    }

    public Personagem criarPersonagem(String chave) {
        Personagem prototipo = prototipos.get(chave);
        return prototipo != null ? prototipo.clonar() : null;
    }
}
