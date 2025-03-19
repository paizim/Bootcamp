package com.bootcamp.basejava.exercicio;

import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static PetMachine petMachine = new PetMachine(30, 10);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var opcao = -1;
        do {
            System.out.println("escolha uma das nossas opções.");
            System.out.println("1 - dar banho no pet.");
            System.out.println("2 - abastecer a maquina com agua.");
            System.out.println("3 - abastecer a maquina com shampoo.");
            System.out.println("4 - verificar nivel da agua na maquina.");
            System.out.println("5 - verificar nivel de sahmpoo na maquina.");
            System.out.println("6 - verificar se tem pet no banho.");
            System.out.println("7 - colocar pet na agua. ");
            System.out.println("8 - tirar pet do banho. ");
            System.out.println("9 - limpar a maquina.");
            System.out.println("0 - sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> petMachine.petBanho();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.limparMaquina();
                default -> System.out.println("opção invalida.");
            }
        } while (opcao != 0);
    }
    public static void setAgua(){
        petMachine.adcionarAgua();
    }
    public static void setShampoo(){
        petMachine.adcionarShampoo();
    }

    public static void verificarShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("a maquina esta " + amount + " litros de shampoo.");
    }
    public static void verificarAgua(){
        var amount = petMachine.getAgua();
        System.out.println("a maquina esta " + amount + " litros de agua.");
    }

    public static void setPetInPetMachine() {
        var nome = "";
        while (nome.isEmpty()) {
            System.out.println("Digite o nome do pet.");
            nome = sc.next();
        }
        var pet = new Pet(nome);
        petMachine.setPet(pet);
        System.out.println("o pet" + pet.getNome() + "foi colocado na maquina.");
    }
}

