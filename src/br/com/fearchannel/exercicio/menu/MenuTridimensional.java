package br.com.fearchannel.exercicio.menu;

import br.com.fearchannel.exercicio.formas.FormaTridimensional;
import br.com.fearchannel.exercicio.tridimensionais.Cubo;
import br.com.fearchannel.exercicio.tridimensionais.Esfera;
import br.com.fearchannel.exercicio.tridimensionais.Tetraedro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuTridimensional implements Menu {

    private Scanner scan;
    private List<FormaTridimensional> listaDeFormas;

    MenuTridimensional() {
        this.scan = new Scanner(System.in);
        this.listaDeFormas = new ArrayList<>();
    }

    @Override
    public void menu() {
        int tempOpt = 0;
        do {
            System.out.println("Qual forma tridimensional você deseja cadastrar?");
            System.out.println("1 - Esfera\n2 - Cubo\n3 - Tetraedro\n4 - Imprimir lista de tridimensionais\n5 - Retornar");
            tempOpt = scan.nextInt();

            switch (tempOpt) {
                case 1:
                    cadastrarEsfera();
                    MenuGeral.pausa();
                    break;

                case 2:
                    cadastrarCubo();
                    MenuGeral.pausa();
                    break;

                case 3:
                    cadastrarTetraedro();
                    MenuGeral.pausa();
                    break;

                case 4:
                    imprimirLista();
                    MenuGeral.pausa();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    MenuGeral.pausa();
                    break;
            }

        } while (tempOpt != 5);
    }

    @Override
    public void imprimirLista() {
        listaDeFormas.forEach(formaTridimensional -> {
            if (formaTridimensional instanceof Esfera)
                System.out.println("[Esfera] " + formaTridimensional.obterNome() + " com área " + formaTridimensional.obterArea());
            else if (formaTridimensional instanceof Cubo) {
                System.out.println("[Cubo] " + formaTridimensional.obterNome() + " com área " + formaTridimensional.obterArea(false));
            } else {
                System.out.println("[Tetraedro] " + formaTridimensional.obterNome() + " com área " + formaTridimensional.obterArea(true));
            }
        });

    }

    private void cadastrarEsfera() {
        System.out.println("Digite o nome da sua esfera: ");
        String nomeDaEsfera = scan.next();

        System.out.println("Qual o raio da sua esfera?");
        double raio = scan.nextDouble();

        FormaTridimensional esfera = new Esfera(nomeDaEsfera, raio);
        System.out.println("Esfera " + esfera.obterNome() + " com área " + esfera.obterArea() + " e volume " + esfera.obterVolume() + " cadastrada!");
        listaDeFormas.add(esfera);
    }

    private void cadastrarCubo() {
        System.out.println("Digite o nome do seu cubo:");
        String nomeDoCubo = scan.next();

        System.out.println("Qual o tamanho da aresta do seu cubo?");
        double aresta = scan.nextDouble();

        FormaTridimensional cubo = new Cubo(nomeDoCubo, aresta);
        System.out.println("Cubo " + cubo.obterNome() + " com área " + cubo.obterArea(false) + " e volume " + cubo.obterVolume(false) + " cadastrado!");
        listaDeFormas.add(cubo);
    }

    private void cadastrarTetraedro() {
        System.out.println("Digite o nome do seu tetraedro regular:");
        String nomeDoTetraedro = scan.next();

        System.out.println("Qual a aresta do seu tetraedro?");
        double arestaDoTetraedro = scan.nextDouble();

        FormaTridimensional tetraedro = new Tetraedro(nomeDoTetraedro, arestaDoTetraedro);
        System.out.println("Tetraedro " + tetraedro.obterNome() + " com área " + tetraedro.obterArea(true) + " e volume " + tetraedro.obterVolume(true) + " cadastrado!");
        listaDeFormas.add(tetraedro);

    }

    ;

}
