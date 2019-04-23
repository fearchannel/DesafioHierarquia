package br.com.fearchannel.exercicio.menu;

import br.com.fearchannel.exercicio.formas.FormaTridimensional;
import br.com.fearchannel.exercicio.tridimensionais.Cubo;
import br.com.fearchannel.exercicio.tridimensionais.Esfera;
import br.com.fearchannel.exercicio.tridimensionais.Tetraedro;
import br.com.fearchannel.exercicio.util.Utilitarios;

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
        int tempOpt;
        do {
            System.out.println("Qual forma tridimensional você deseja cadastrar?");
            System.out.println("1 - Esfera\n2 - Cubo\n3 - Tetraedro\n4 - Imprimir lista de tridimensionais\n5 - Pesquisar por nome\n9 - Retornar");
            tempOpt = scan.nextInt();

            switch (tempOpt) {
                case 1:
                    cadastrarEsfera();
                    Utilitarios.pausa();
                    break;

                case 2:
                    cadastrarCubo();
                    Utilitarios.pausa();
                    break;

                case 3:
                    cadastrarTetraedro();
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
                    System.out.println("Opção inválida!");
                    Utilitarios.pausa();
                    break;
            }

        } while (tempOpt != 9);
    }

    @Override
    public void imprimirLista() {
        listaDeFormas.forEach(Utilitarios::printerTridimensional);

    }

    private void cadastrarEsfera() {
        System.out.println("Digite o nome da sua esfera: ");
        String nomeDaEsfera = scan.next();

        System.out.println("Qual o raio da sua esfera?");
        double raio = scan.nextDouble();

        FormaTridimensional esfera = new Esfera(nomeDaEsfera, raio);
        listaDeFormas.add(esfera);
        Utilitarios.printerTridimensional(esfera);
    }

    private void cadastrarCubo() {
        System.out.println("Digite o nome do seu cubo:");
        String nomeDoCubo = scan.next();

        System.out.println("Qual o tamanho da aresta do seu cubo?");
        double aresta = scan.nextDouble();

        FormaTridimensional cubo = new Cubo(nomeDoCubo, aresta);
        listaDeFormas.add(cubo);
        Utilitarios.printerTridimensional(cubo);
    }

    private void cadastrarTetraedro() {
        System.out.println("Digite o nome do seu tetraedro regular:");
        String nomeDoTetraedro = scan.next();

        System.out.println("Qual a aresta do seu tetraedro?");
        double arestaDoTetraedro = scan.nextDouble();

        FormaTridimensional tetraedro = new Tetraedro(nomeDoTetraedro, arestaDoTetraedro);
        listaDeFormas.add(tetraedro);
        Utilitarios.printerTridimensional(tetraedro);
    }

    private void pesquisarPorNome(){
        System.out.println("Digite o nome do objeto a ser pesquisado: ");
        String temp = scan.next();
        Utilitarios.pesquisaTridimensional(listaDeFormas, temp);
    }

}
