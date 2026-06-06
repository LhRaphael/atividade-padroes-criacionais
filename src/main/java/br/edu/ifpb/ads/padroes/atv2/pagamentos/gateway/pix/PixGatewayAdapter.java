package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pix;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pix.PixSDK;

public class PixGatewayAdapter implements PagamentoGateway {
    private final PixSDK pixSDK;

    public PixGatewayAdapter(PixSDK pixSDK) {
        this.pixSDK = pixSDK;
    }

    @Override
    public void processarPagamento(double valor, String destinoOuToken) {
        pixSDK.transferirViaChavePix(destinoOuToken, valor);
    }
}