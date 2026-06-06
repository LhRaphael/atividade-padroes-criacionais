package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.stripe;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;
import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.stripe.StripeSDK;

public class StripeGatewayAdapter implements PagamentoGateway {
    private final StripeSDK stripeSDK;

    // Injetado automaticamente pelo container de DI
    public StripeGatewayAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void processarPagamento(double valor, String destinoOuToken) {
        // Stripe trabalha com centavos (inteiro), então fazemos a conversão
        int valorEmCentavos = (int) (valor * 100);
        stripeSDK.chargeCard(destinoOuToken, valorEmCentavos);
    }
}