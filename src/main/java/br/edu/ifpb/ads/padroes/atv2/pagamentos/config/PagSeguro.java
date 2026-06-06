package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.config;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.container.MiniPicoContainer;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pagseguro.PagSeguroSDK;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pagseguro.PagSeguroGatewayAdapter;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.service.PagamentoService;

public class PagSeguro {
    public static void configurar(MiniPicoContainer container) {

        container.register(PagSeguroSDK.class);

        container.register(
            PagamentoGateway.class,
            PagSeguroGatewayAdapter.class
        );

        container.register(
            PagamentoService.class
        );
    }
}
