package com.bootcamp.basejava;

import java.util.Scanner;

public class Desafio {
    Scanner teclado = new Scanner(System.in);
    private double salario;
    private double beneficios;
    private double imposto;
    private double salarioAlterado;
    private double salarioFinal;

    public void infoSalario(){
        System.out.println("Informe seu salario: ");
        salario = teclado.nextDouble();
    }
    public void infoBeneficios(){
        System.out.println("Informe seu adicional de beneficios: ");
        beneficios = teclado.nextDouble();
    }
    public void calculaSalario(){
        System.out.println("calculando o seu salario final ...");
        if(salario >= 0.0 && salario <= 1100.0){
            imposto = 0.05;
            salarioAlterado = salario * imposto;
            salarioFinal = (salario - salarioAlterado) + beneficios;
            System.out.println("Salario final: " + salarioFinal);
        } else if(salario >= 1100.1 && salario <= 2500.0) {
            imposto = 0.10;
            salarioAlterado = salario * imposto;
            salarioFinal = (salario - salarioAlterado) + beneficios;
            System.out.println("Salario final: " + salarioFinal);
        } else{
            imposto = 0.15;
            salarioAlterado = salario * imposto;
            salarioFinal = (salario - salarioAlterado) + beneficios;
            System.out.println("Salario final: " + salarioFinal);
        }
    }

    public static void main(String[] args) {
        Desafio desafio = new Desafio();
        desafio.infoSalario();
        desafio.infoBeneficios();
        desafio.calculaSalario();
    }
}
