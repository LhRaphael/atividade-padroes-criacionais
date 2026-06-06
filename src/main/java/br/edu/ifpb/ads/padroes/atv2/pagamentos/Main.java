import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.config.PixConfig;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.container.MiniPicoContainer;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.service.PagamentoService;

public class Main {

    public static void main(String[] args) {

        //Exemplo de configuração para Pix, só mudar a linha de configuração para testar outro cenário

        MiniPicoContainer container =
            new MiniPicoContainer();

        PixConfig.configurar(container);

        PagamentoService servico =
            container.getComponent(
                PagamentoService.class
            );

        servico.pagar(
            100.0,
            "cliente@pagar.com"
        );
    }
        
}