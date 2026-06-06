package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.config;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.container.MiniPicoContainer;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pix.PixSDK;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pix.PixGatewayAdapter;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.service.PagamentoService;

public class PixConfig {
    public static void configurar(MiniPicoContainer container){
        container.register(PixSDK.class);

        container.register(
            PagamentoGateway.class,
            PixGatewayAdapter.class
        );

        container.register(
            PagamentoService.class
        );
    }
}
