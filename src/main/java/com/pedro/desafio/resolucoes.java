package com.pedro.desafio;

public class resolucoes {
    public static void verificaNumeroFibonacci(int n) {
        int atual = 0;
        int anterior = 1;

        while(atual < n){
            int sup = atual + anterior;
            anterior = atual;
            atual = sup;
        }

        if(atual == n){
            System.out.println("O número " + n + " pertece a sequência fibonacci");
            return;
        }

        System.out.println("O número " + n + " não pertece a sequência fibonacci");
    }

    public static void verificaLetraString(char c, String texto) {
        int quantidadeLetra = 0;

        quantidadeLetra = (int) texto.toLowerCase()
                .chars()
                .filter(x -> x == c)
                .count();

        if(quantidadeLetra == 0){
            System.out.println("A string informada não possui a letra " + c + ".");
            return;
        }

        System.out.println("A string informada possui "
                + quantidadeLetra + " letra(s) " + c + ".");
    }

    public static void soma(){
        int i = 12;
        int soma = 0;
        int k = 1;
        while(k < i){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("O resultado da soma é " + soma);
    }
}
