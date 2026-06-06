package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pagseguro;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pagseguro.PagSeguroSDK;

public class PagSeguroGatewayAdapter implements PagamentoGateway {
    private final PagSeguroSDK pagSeguroSDK;

    // Injetado automaticamente pelo container de DI
    public PagSeguroGatewayAdapter(PagSeguroSDK pagSeguroSDK) {
        this.pagSeguroSDK = pagSeguroSDK;
    }

    @Override
    public void processarPagamento(double valor, String destinoOuToken) {
        // Adapta para o fluxo do PagSeguro
        pagSeguroSDK.iniciarFluxoPagamento(destinoOuToken, valor);
    }
}