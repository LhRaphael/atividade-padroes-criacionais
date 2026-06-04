package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Personagem implements Cloneable, Prototipo<Personagem> {
    private String nome;
    private String raca;
    private String classe;

    private int forca;
    private int inteligencia;
    private int agilidade;

    private int vida;
    private int mana;

    private Arma arma;
    private Armadura armadura;

    private String[] habilidades;

    // Construtor padrão
    public Personagem() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public Personagem clone() {
        Personagem clone = new Personagem();

        clone.setNome(this.nome);
        clone.setRaca(this.raca);
        clone.setClasse(this.classe);

        clone.setForca(this.forca);
        clone.setInteligencia(this.inteligencia);
        clone.setAgilidade(this.agilidade);

        clone.setVida(this.vida);
        clone.setMana(this.mana);

        if (this.arma != null) {
            clone.setArma(this.arma.clonar());
        }
        if (this.armadura != null) {
            clone.setArmadura(this.armadura.clonar());
        }

        if (this.habilidades != null) {
            clone.setHabilidades(this.habilidades.clone());
        }

        return clone;
    }

    @Override
    public Personagem clonar() {
        return clone();
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", classe='" + classe + '\'' +
                ", forca=" + forca +
                ", inteligencia=" + inteligencia +
                ", agilidade=" + agilidade +
                ", vida=" + vida +
                ", mana=" + mana +
                ", arma=" + arma +
                ", armadura=" + armadura +
                '}';
    }
}