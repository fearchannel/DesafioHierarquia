package br.com.fearchannel.exercicio.formas;

public class FormaTridimensional extends Forma {

    public FormaTridimensional(String nome, double raio, boolean temRaio) {
        super(nome, raio, temRaio);
    }

    public double obterArea() { //area da esfera
        return (4 * PI_VALOR) * Math.pow(getRaio(),2);
    }

    public double obterArea(boolean eTetraedro) {
        return (eTetraedro) ? ((Math.pow(getAresta(),2)*(Math.sqrt(3)))/4)*4: 6 * (Math.pow(getAresta(), 2));
    }

    public double obterVolume() {
        return (4 * PI_VALOR * (Math.pow(getRaio(), 3))) / 3;
    }

    public double obterVolume(boolean eTetraedro) {
        return (eTetraedro) ? (Math.pow(getAresta(), 3) * Math.sqrt(2)) / 12 : (Math.pow(getAresta(), 3));
    }

    public String obterNome() {
        return getNome();
    }
}
