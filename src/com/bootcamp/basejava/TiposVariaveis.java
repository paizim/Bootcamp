package com.bootcamp.basejava;

public class TiposVariaveis {
    public static void main(String[] args) {
        //int = 10; String nome = "";char = '';double = 10,9; boolean = true or false;
        // ++ = incrementa; -- = decrementa; + para String = concatenção;
        // ! = iberte o valor da variavel; ? = usado no if; : = se não usado no if;
        //.equals = comparação de Strings; == comparação de numeros;
        // && = e; || = ou; (usados no if)
        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "true" : "false";
        System.out.println(resultado);


        String maior = a > b ? "o a é maior que b" : "o a não é maior que b";
        System.out.println(maior);

        if (a > b)
            System.out.println("o a é maior que b");
        else
            System.out.println("o b é maior que a");

    }
}
