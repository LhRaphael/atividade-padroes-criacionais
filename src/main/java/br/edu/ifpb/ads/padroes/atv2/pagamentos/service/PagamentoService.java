package main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.service;

import main.java.br.edu.ifpb.ads.padroes.atv2.pagamentos.gateway.PagamentoGateway;

public class PagamentoService {
    private final PagamentoGateway gateway;

    // O gateway concreto é injetado pelo Container de DI (Injeção por Construtor)
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(double valor, String destinoOuToken) {
        System.out.println("\n--- Iniciando Processamento de Pagamento ---");
        System.out.println("Preparando envio de transação no valor de: " + valor);
        
        // Delega a execução para a abstração injetada
        gateway.processarPagamento(valor, destinoOuToken);
        
        System.out.println("--- Pagamento Concluído com Sucesso ---\n");
    }
}