package exercicios.java;

/**
 * Gean Corrêa Bacinello
 *
 *  Escreva um programa Java para trocar duas variáveis.
 */

public class Swap_Variáveis {
    static void main(String[] args) {

        int temp, a, b;

        a = 15;
        b = 30;

        System.out.println("Saida antes da troca = a , b" + a + "," + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Saida depois da troca = a , b" + a + "," + b);
    }
}
