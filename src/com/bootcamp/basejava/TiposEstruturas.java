package com.bootcamp.basejava;

public class TiposEstruturas {
    //condicionnal: if-else ou swich-case;
    // repetição: for ou while;
    // exceção: throw-catch-finally;
    //try{ bloco de codigo}
    //catch(Tipo da Exceção e, por exemplo numerico = InputMismatchException e){
    // mensagem para o determinado erro}


    double saldo = 10;
    double valorSolicitado = 12;
    String sigla = "A";
    int n = 20;
    String alunos[] = {"joao", "maria", "pedro"};


    public void controle() {
        //fluxo de condição composta;
        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println(saldo);
        } else if (valorSolicitado > saldo) {
            saldo += valorSolicitado;
            System.out.println(saldo);
        } else {
            System.out.println(saldo);
        }

        //fluxo de condição ternaria;
        String resultado = saldo < valorSolicitado ? "verdadeiro" : "falso";
        System.out.println(resultado);
    }

    public void tamanho() {
        //switch-case;
        switch (sigla) {
            case "P": {
                System.out.println("pequeno");
                break;
            }
            case "M": {
                System.out.println("medio");
                break;
            }
            case "G": {
                System.out.println("grande");
                break;
            }
        }

        //comparação de Strings;
        if (sigla.equals("P")) {
            System.out.println("pequeno");
        } else if (sigla.equals("M")) {
            System.out.println("medio");
        } else {
            System.out.println("indefinido");
        }
    }

    public void contagem() {
        //PONTO DE PARADA NO FOR;
        for (int i = 0; i < n; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }

        //OUTRA FORMA DE USAR O FOR COM ARRAY;
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        //WHILE
        while (n > 10) {
            int soma = n + 5;
            System.out.println(soma);
        }
    }

    public static void main(String[] args) {
        TiposEstruturas estruturas = new TiposEstruturas();
        estruturas.controle();
        estruturas.tamanho();
        estruturas.contagem();
    }
}

