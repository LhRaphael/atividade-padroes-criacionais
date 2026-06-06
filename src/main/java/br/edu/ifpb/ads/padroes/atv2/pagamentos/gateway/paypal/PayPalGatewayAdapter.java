package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.paypal;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.paypal.PayPalSDK;

public class PayPalGatewayAdapter implements PagamentoGateway {
    private final PayPalSDK payPalSDK;

    // Injetado automaticamente pelo container de DI
    public PayPalGatewayAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void processarPagamento(double valor, String destinoOuToken) {
        // Adapta o fluxo comum para a chamada específica do PayPal
        payPalSDK.sendPayment(destinoOuToken, valor);
    }
}