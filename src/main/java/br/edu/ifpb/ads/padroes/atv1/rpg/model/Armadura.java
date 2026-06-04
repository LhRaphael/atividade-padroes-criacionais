package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Armadura implements Prototipo<Armadura> {
    private String nome;
    private int dano;
    private String tipo;

    // Construtor padrão
    public Armadura() {
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
    public Armadura clonar() {
        Armadura copia = new Armadura();
        copia.setNome(this.nome);
        copia.setDano(this.dano);
        copia.setTipo(this.tipo);
        return copia;
    }

    @Override
    public String toString() {
        return "Armadura{" +
                "nome='" + nome + '\'' +
                ", dano=" + dano +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}