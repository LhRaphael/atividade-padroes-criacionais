package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pagseguro;

public class PagSeguroSDK {
    public void iniciarFluxoPagamento(String tokenVendedor, double valor) {
        System.out.println("[PagSeguro SDK API] Transação iniciada com sucesso!");
        System.out.println("                    Token Vendedor: " + tokenVendedor);
        System.out.println("                    Valor: R$ " + valor);
    }
}
