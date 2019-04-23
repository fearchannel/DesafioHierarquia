package br.com.fearchannel.exercicio.formas;

public class Forma {

    private String nome;
    private double largura;
    private double altura;
    private double raio;
    private double aresta;
    static final double PI_VALOR = 3.14159265359;

    String getNome() {
        return nome;
    }

    public double getLargura() {
        return largura;
    }

    public double getAresta() {
        return aresta;
    }

    public double getAltura() {
        return altura;
    }

    double getRaio() {
        return raio;
    }

    public Forma(String nome, double largura, double altura) { //Formas Bidimensionais
        this.nome = nome;
        this.largura = largura;
        this.altura = altura;
    }

    public Forma(String nome, double raioOuAresta, boolean temRaio) { // Formas Tridimensionais
        this.nome = nome;
        if (temRaio)
            this.raio = raioOuAresta;
        else
            this.aresta = raioOuAresta;
    }
}