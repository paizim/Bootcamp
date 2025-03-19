package com.bootcamp.basejava.exercicio;

public class Pet {
    private final String nome;
    private boolean clean;
    public Pet(String nome) {
        this.nome = nome;
        this.clean = false;
    }

    public String getNome() {
        return nome;
    }
}
