package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway;

public interface PagamentoGateway {
    void processarPagamento(double valor, String destinoOuToken);
}