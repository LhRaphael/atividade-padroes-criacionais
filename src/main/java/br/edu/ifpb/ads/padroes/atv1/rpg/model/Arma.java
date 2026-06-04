package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Arma implements Prototipo<Arma> {
    private String nome;
    private int dano;
    private String tipo;

    // Construtor padrão
    public Arma() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Arma clonar() {
        Arma copia = new Arma();
        copia.setNome(this.nome);
        copia.setDano(this.dano);
        copia.setTipo(this.tipo);
        return copia;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", dano=" + dano +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}