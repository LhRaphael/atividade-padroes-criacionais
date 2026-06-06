package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.container;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class MiniPicoContainer {
    private final Map<Class<?>, Object> instancias = new HashMap<>();
    private final Map<Class<?>, Class<?>> mapeamentos = new HashMap<>();

    // Registra uma classe concreta diretamente (ex: SDKs)
    public void register(Class<?> classeConcreta) {
        mapeamentos.put(classeConcreta, classeConcreta);
    }

    // Registra uma implementação para uma interface/abstração (ex: Gateway -> Adaptador)
    public <T> void register(Class<T> servico, Class<? extends T> implementacao) {
        mapeamentos.put(servico, implementacao);
    }

    // Resolve e constrói as dependências recursivamente de forma automática
    @SuppressWarnings("unchecked")
    public <T> T getComponent(Class<T> classeAlvo) {
        // Se já tiver uma instância pré-construída, retorna ela
        if (instancias.containsKey(classeAlvo)) {
            return (T) instancias.get(classeAlvo);
        }

        // Descobre qual classe concreta usar (mapeada ou a própria classe alvo)
        Class<?> implementacao = mapeamentos.getOrDefault(classeAlvo, classeAlvo);

        try {
            // Busca o primeiro construtor disponível
            Constructor<?>[] construtores = implementacao.getDeclaredConstructors();
            if (construtores.length == 0) {
                construtores = implementacao.getConstructors();
            }
            
            Constructor<?> construtor = construtores[0];
            Class<?>[] tiposParametros = construtor.getParameterTypes();
            Object[] argumentos = new Object[tiposParametros.length];

            // Resolve recursivamente cada dependência necessária do construtor
            for (int i = 0; i < tiposParametros.length; i++) {
                argumentos[i] = getComponent(tiposParametros[i]);
            }

            // Instancia a classe usando os argumentos injetados
            T novaInstancia = (T) construtor.newInstance(argumentos);
            instancias.put(implementacao, novaInstancia);
            return novaInstancia;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao injetar dependência para: " + implementacao.getName(), e);
        }
    }

    // Limpa o container para reconfiguração com outros cenários
    public void clear() {
        instancias.clear();
        mapeamentos.clear();
    }
}