package br.com.fearchannel.exercicio.menu;

import br.com.fearchannel.exercicio.bidimensionais.Circulo;
import br.com.fearchannel.exercicio.bidimensionais.Quadrado;
import br.com.fearchannel.exercicio.bidimensionais.Triangulo;
import br.com.fearchannel.exercicio.formas.FormaBidimensional;

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
        int tempOpt = 0;
        do {
            System.out.println("Qual forma bidimensional você deseja cadastrar?");
            System.out.println("1 - Círculo\n2 - Quadrado\n3 - Triângulo\n4 - Imprimir lista de bidimensionais\n5 - Retornar");
            tempOpt = scan.nextInt();

            switch (tempOpt) {
                case 1:
                    cadastrarCirculo();
                    MenuGeral.pausa();
                    break;

                case 2:
                    cadastrarQuadrado();
                    MenuGeral.pausa();
                    break;

                case 3:
                    cadastrarTriangulo();
                    MenuGeral.pausa();
                    break;

                case 4:
                    imprimirLista();
                    MenuGeral.pausa();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }
        } while (tempOpt != 5);
    }

    @Override
    public void imprimirLista() {
        listaDeFormas.forEach(formaBidimensional -> {
            if (formaBidimensional instanceof Circulo)
                System.out.println("[Círculo] " + formaBidimensional.obterNome() + " com área " + formaBidimensional.obterArea());
            else if (formaBidimensional instanceof Quadrado) {
                System.out.println("[Quadrado] " + formaBidimensional.obterNome() + " com área " + formaBidimensional.obterArea(false));
            } else {
                System.out.println("[Triângulo] " + formaBidimensional.obterNome() + " com área " + formaBidimensional.obterArea(true));
            }
        });
    }

    private void cadastrarCirculo() {
        System.out.println("Digite o nome do seu novo círculo: ");
        String nomeDoCirculo = scan.next();
        System.out.println("Digite agora o raio do seu círculo: ");
        double raio = scan.nextDouble();
        FormaBidimensional circulo = new Circulo(nomeDoCirculo, raio);
        System.out.println("Círculo " + circulo.obterNome() + " com área " + circulo.obterArea() + " cadastrado!");
        listaDeFormas.add(circulo);
    }

    private void cadastrarQuadrado() {
        System.out.println("Digite o nome do seu novo quadrado: ");
        String nomeDoQuadrado = scan.next();

        System.out.println("Digite agora a aresta do seu quadrado: ");
        double arestaDoQuadrado = scan.nextDouble();

        FormaBidimensional quadrado = new Quadrado(nomeDoQuadrado, arestaDoQuadrado);
        System.out.println("Quadrado " + quadrado.obterNome() + " com área " + quadrado.obterArea(false) + " cadastrado!");
        listaDeFormas.add(quadrado);
    }

    private void cadastrarTriangulo() {
        System.out.println("Digite o nome do seu novo triangulo: ");
        String nomeDoTriangulo = scan.next();
        System.out.println("Digite agora a base do seu triangulo: ");
        double baseDoTriangulo = scan.nextDouble();
        System.out.println("Digite agora a altura do seu triangulo: ");
        double alturaDoTriangulo = scan.nextDouble();
        FormaBidimensional triangulo = new Triangulo(nomeDoTriangulo, baseDoTriangulo, alturaDoTriangulo);
        System.out.println("Quadrado " + triangulo.obterNome() + " com área " + triangulo.obterArea(true) + " cadastrado!");
        listaDeFormas.add(triangulo);
    }
}


