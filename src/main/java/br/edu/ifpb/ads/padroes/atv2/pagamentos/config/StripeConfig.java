package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.config;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.container.MiniPicoContainer;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.stripe.StripeSDK;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.stripe.StripeGatewayAdapter;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.service.PagamentoService;

public class StripeConfig {

    public static void configurar(MiniPicoContainer container) {

        container.register(StripeSDK.class);

        container.register(
            PagamentoGateway.class,
            StripeGatewayAdapter.class
        );

        container.register(
            PagamentoService.class
        );
    }
}