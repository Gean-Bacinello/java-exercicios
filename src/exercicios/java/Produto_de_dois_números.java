package exercicios.java;

import java.util.Scanner;

/**
 * Gean Correa Bacinello
 *
 * Escreva um programa Java que leva dois números como entrada e exibe o produto de dois números.
 * Dados do teste:
 * Entrada primeiro número: 25
 * Entrada segundo número: 5
 * Produção esperada :
 * 25 x 5 = 125
 */

public class Produto_de_dois_números {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = in.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = in.nextInt();

        System.out.println(num1 + "x" + num2 + " = " + num1*num2);

        in.close();

    }
}
