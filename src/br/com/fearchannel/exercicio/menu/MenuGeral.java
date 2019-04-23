package br.com.fearchannel.exercicio.menu;

import br.com.fearchannel.exercicio.util.Utilitarios;

import java.util.Scanner;

public class MenuGeral {

    private int opt = 0;
    private Scanner scan;
    private MenuBidimensional menuBidimensional;
    private MenuTridimensional menuTridimensional;

    public MenuGeral() {
        this.scan= new Scanner(System.in);
        this.menuBidimensional  = new MenuBidimensional();
        this.menuTridimensional = new MenuTridimensional();
    }

    public void menuGeral() {
        System.out.println("**************************EXERCICIO SOBRE HERANÇA**************************\n\n\n");
        System.out.println("Autor: Leonardo Lourenço Gomes");
        System.out.println("GitHub: https://github.com/fearchannel\n\n\n");
        System.out.println("***************************************************************************");
        do {
            System.out.println("Menu de formas bidimensionais: Digite 0");
            System.out.println("Menu de formas tridimensionais: Digite 1");
            System.out.println("Finalizar software: Digite 9");
            opt = scan.nextInt();

            switch (opt) {
                case 0:
                    menuBidimensional.menu();
                    break;

                case 1:
                    menuTridimensional.menu();
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opção não encontrada!");
                    Utilitarios.pausa();
                    break;
            }
        } while (opt!=9);
    }

}
