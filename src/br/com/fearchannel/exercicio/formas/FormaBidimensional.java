package br.com.fearchannel.exercicio.formas;

public class FormaBidimensional extends Forma {

    public FormaBidimensional(String nome, double largura, double altura) {
        super(nome, largura, altura);
    }

    public FormaBidimensional(String nome, double raioOuAresta, boolean temRaio) {
        super(nome, raioOuAresta, temRaio);
    }

    public double obterArea() {
        return (getRaio() * getRaio()) * PI_VALOR;
    }

    public double obterArea(boolean eTriangulo){
        return eTriangulo ? (getLargura() * getAltura())/2 : Math.pow(getAresta(),2);
    }

    public String obterNome(){
        return getNome();
    }
}
