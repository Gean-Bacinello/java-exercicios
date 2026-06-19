package exercicios.java;

import java.util.Scanner;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java para imprimir a soma (adição), multiplicar, subtrair, dividir e restante de dois números.
 * Dados do teste:
 * Entrada primeiro número: 125
 * Entrada segundo número: 24
 * Produção esperada :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Operações_Aritméticas_Básicas {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = in.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        in.close();

    }
}
