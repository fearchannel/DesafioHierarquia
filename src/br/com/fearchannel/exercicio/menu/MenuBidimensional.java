package br.com.fearchannel.exercicio.menu;

import br.com.fearchannel.exercicio.bidimensionais.Circulo;
import br.com.fearchannel.exercicio.bidimensionais.Quadrado;
import br.com.fearchannel.exercicio.bidimensionais.Triangulo;
import br.com.fearchannel.exercicio.formas.FormaBidimensional;
import br.com.fearchannel.exercicio.util.Utilitarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuBidimensional implements Menu {

    private Scanner scan;
    private List<FormaBidimensional> listaDeFormas;

    MenuBidimensional() {
        this.scan = new Scanner(System.in);
        this.listaDeFormas = new ArrayList<>();
    }

    @Override
    public void menu() {
        int tempOpt;
        do {
            System.out.println("Qual forma bidimensional você deseja cadastrar?");
            System.out.println("1 - Círculo\n2 - Quadrado\n3 - Triângulo\n4 - Imprimir lista de bidimensionais\n5 - Pesquisar por nome\n9 - Retornar");
            tempOpt = scan.nextInt();

            switch (tempOpt) {
                case 1:
                    cadastrarCirculo();
                    Utilitarios.pausa();
                    break;

                case 2:
                    cadastrarQuadrado();
                    Utilitarios.pausa();
                    break;

                case 3:
                    cadastrarTriangulo();
                    Utilitarios.pausa();
                    break;

                case 4:
                    imprimirLista();
                    Utilitarios.pausa();
                    break;

                case 5:
                    pesquisarPorNome();
                    Utilitarios.pausa();
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }
        } while (tempOpt != 9);
    }

    @Override
    public void imprimirLista() {
        listaDeFormas.forEach(Utilitarios::printerBidimensional);
    }

    private void cadastrarCirculo() {
        System.out.println("Digite o nome do seu novo círculo: ");
        String nomeDoCirculo = scan.next();

        System.out.println("Digite agora o raio do seu círculo: ");
        double raio = scan.nextDouble();

        FormaBidimensional circulo = new Circulo(nomeDoCirculo, raio);
        listaDeFormas.add(circulo);
        Utilitarios.printerBidimensional(circulo);
    }

    private void cadastrarQuadrado() {
        System.out.println("Digite o nome do seu novo quadrado: ");
        String nomeDoQuadrado = scan.next();

        System.out.println("Digite agora a aresta do seu quadrado: ");
        double arestaDoQuadrado = scan.nextDouble();

        FormaBidimensional quadrado = new Quadrado(nomeDoQuadrado, arestaDoQuadrado);
        listaDeFormas.add(quadrado);
        Utilitarios.printerBidimensional(quadrado);
    }

    private void cadastrarTriangulo() {
        System.out.println("Digite o nome do seu novo triangulo: ");
        String nomeDoTriangulo = scan.next();

        System.out.println("Digite agora a base do seu triangulo: ");
        double baseDoTriangulo = scan.nextDouble();

        System.out.println("Digite agora a altura do seu triangulo: ");
        double alturaDoTriangulo = scan.nextDouble();

        FormaBidimensional triangulo = new Triangulo(nomeDoTriangulo, baseDoTriangulo, alturaDoTriangulo);
        Utilitarios.printerBidimensional(triangulo);
        listaDeFormas.add(triangulo);
    }

    private void pesquisarPorNome(){
        System.out.println("Digite o nome do objeto a ser pesquisado");
        String temp = scan.next();
        Utilitarios.pesquisaBidimensional(listaDeFormas, temp);
    }
}


