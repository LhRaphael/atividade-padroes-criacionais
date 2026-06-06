package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.config;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.container.MiniPicoContainer;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.paypal.PayPalSDK;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.paypal.PayPalGatewayAdapter;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.service.PagamentoService;

public class PayPalConfig {

    public static void configurar(MiniPicoContainer container) {

        container.register(PayPalSDK.class);

        container.register(
            PagamentoGateway.class,
            PayPalGatewayAdapter.class
        );

        container.register(
            PagamentoService.class
        );
    }
}