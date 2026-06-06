package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.pix;

public class PixSDK {
    public void transferirViaChavePix(String chave, double valor) {
        System.out.println("[Pix Instantâneo API] Transferência Pix efetuada!");
        System.out.println("                      Chave Pix Destino: " + chave);
        System.out.println("                      Valor enviado: R$ " + valor);
    }
}
