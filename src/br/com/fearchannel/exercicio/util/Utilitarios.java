package br.com.fearchannel.exercicio.util;

import br.com.fearchannel.exercicio.bidimensionais.Circulo;
import br.com.fearchannel.exercicio.bidimensionais.Quadrado;
import br.com.fearchannel.exercicio.formas.FormaBidimensional;
import br.com.fearchannel.exercicio.formas.FormaTridimensional;
import br.com.fearchannel.exercicio.tridimensionais.Cubo;
import br.com.fearchannel.exercicio.tridimensionais.Esfera;

import java.util.List;

public class Utilitarios {

    private final static String AREA = " com área ";

    public static void pesquisaBidimensional(List<FormaBidimensional> listaDeFormas, String nome) {
        listaDeFormas.forEach(formaBidimensional -> {
            if (formaBidimensional.obterNome().equals(nome)) {
                printerBidimensional(formaBidimensional);
            }
        });
    }

    public static void pesquisaTridimensional(List<FormaTridimensional> listaDeFormas, String nome) {
        listaDeFormas.forEach(formaTridimensional -> {
            if (formaTridimensional.obterNome().equals(nome)) {
                printerTridimensional(formaTridimensional);
            }
        });
    }

    public static void printerBidimensional(FormaBidimensional formaBidimensional) {
        if (formaBidimensional instanceof Circulo)
            System.out.println("[Círculo] " + formaBidimensional.obterNome() + AREA + formaBidimensional.obterArea());
        else if (formaBidimensional instanceof Quadrado) {
            System.out.println("[Quadrado] " + formaBidimensional.obterNome() + AREA + formaBidimensional.obterArea(false));
        } else {
            System.out.println("[Triângulo] " + formaBidimensional.obterNome() + AREA + formaBidimensional.obterArea(true));
        }
    }

    public static void printerTridimensional(FormaTridimensional formaTridimensional) {
        if (formaTridimensional instanceof Esfera)
            System.out.println("[Esfera] " + formaTridimensional.obterNome() + AREA + formaTridimensional.obterArea());
        else if (formaTridimensional instanceof Cubo) {
            System.out.println("[Cubo] " + formaTridimensional.obterNome() + AREA + formaTridimensional.obterArea(false));
        } else {
            System.out.println("[Tetraedro] " + formaTridimensional.obterNome() + AREA + formaTridimensional.obterArea(true));
        }
    }

    public static void pausa(){
        try {
            System.out.println("=====================================================================");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
