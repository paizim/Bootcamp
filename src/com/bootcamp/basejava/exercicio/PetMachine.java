package com.bootcamp.basejava.exercicio;

public class PetMachine {
    private boolean clean = true;
    private int agua = 30;
    private int shampoo = 10;
    private Pet pet;
    public PetMachine(int agua, int shampoo) {
        this.clean = false;
        this.agua = agua;
        this.shampoo = shampoo;
    }
    public int getAgua() {
        return agua;
    }
    public int getShampoo() {
        return shampoo;
    }

    public void banhoPet(){
        if(this.pet == null){
            System.out.println("Coloque o Pet na maquina para iniciar o banho.");
            return;
        } else {
            this.agua -= 10;
            this.shampoo -= 2;
            this.clean = true;
            System.out.println("O Pet " + pet.getNome() + " esta limpo.");
        }
    }
    public void adcionarAgua(){
        if(agua == 30){
        System.out.println("A capacidade da água esta no máximo.");
        }else{
            agua += 2;
        }
    }
    public void adcionarShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade do shampoo esta no máximo.");
        } else{
            shampoo += 2;
        }
    }

    public boolean petBanho(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if(!this.clean){
            System.out.println("A maquina esta suja.");
        }
        if(petBanho()){
            System.out.println("O pet " + pet.getNome() + " esta na maquina.");
        }
    }

    public void removePet(){
        this.clean = true;
        System.out.println("O pet " + pet.getNome() + " esta limpo.");
        this.pet = null;
    }

    public void limparMaquina(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.clean = true;
    }


}
