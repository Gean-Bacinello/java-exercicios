package exercicios.java;

import java.util.Scanner;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java que leva três números como entrada para calcular e imprimir a média dos números.
 */

public class Média_de_três_números {
    static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      double numero = 0;
      double x = 1;

        System.out.println("Insira a quantidade de números (n) para o qual deseja calcular a média. ");
        int n = in.nextInt();

        while (x <= n){
            System.out.println("insira o numero: " + "(" + (int) x + ")" + ":");
            numero += in.nextInt();
            x += 1;
        }

        double media = (numero / n);

        System.out.println("Media: " + media);

        in.close();
    }
}
