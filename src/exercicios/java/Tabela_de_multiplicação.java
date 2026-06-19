package exercicios.java;

import java.util.Scanner;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java que leva um número como entrada e imprime sua tabela de multiplicação até 10.
 * Dados do teste:
 * Insira um número: 8
 * Produção esperada :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Tabela_de_multiplicação {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero interiro: ");
        int numero = in.nextInt();

        if (numero > 0){
            for (int i = 1; i <= 10; i++) {
               int resultado =  numero * i;
                System.out.println(numero + " x "+ i + " = " + resultado );
            }

        } else {
            System.out.println("Por favor digite um valor maior que 0: ");
        }
    }
}
