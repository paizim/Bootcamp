package com.bootcamp.basejava;

import java.util.Scanner;

public class AplicacaoMetodo {
    private int volume = 5, volumeAumentado, volumeDiminuido;
    private int canal = 1;
    boolean ligada;

    public void ligarTv (boolean ligada) {
       if (ligada == true) {
           System.out.println(" Tv ligada");
       } else {
           System.out.println("Tv desligado");
       }
    }


    public void aumentarVolume() {
        volume++;
        System.out.println("Volume " + volume);
    }
    public void abaixarVolume() {
        volume--;
        System.out.println("Volume " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("canal: " + canal);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        AplicacaoMetodo start = new AplicacaoMetodo();
        start.ligarTv(start.ligada = true);
        start.aumentarVolume();
        start.abaixarVolume();
        start.aumentarCanal();
        System.out.println("qual seu nome: ");
        String nome = teclado.nextLine();
    }
}
