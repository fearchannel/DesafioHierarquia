package br.com.fearchannel.exercicio.menu;

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
                    pausa();
                    break;
            }
        } while (opt!=9);
    }

    public static void pausa(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
