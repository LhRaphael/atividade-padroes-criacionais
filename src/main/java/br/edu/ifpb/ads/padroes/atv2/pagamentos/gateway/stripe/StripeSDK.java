package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.stripe;

public class StripeSDK {
    public void chargeCard(String cardToken, int amountInCents) {
        System.out.println("[Stripe SDK API] Cobrança realizada com sucesso!");
        System.out.println("                 Token do Cartão: " + cardToken);
        System.out.println("                 Valor: " + amountInCents + " centavos (USD)");
    }
}