package exercicios.java;

import java.util.Scanner;

/**
 *  Gean Corrêa Bacinello
 *
 *  Escreva um programa Java para converter um número inteiro para um número binário.
 *  Dados de entrada:
 *  Insira um número decimal: 5
 *  Saída Esperada
 *
 *  O número binário é: 101
 */

public class Decimal_para_Binary_Converter {

    static void main(String[] args) {

        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero decimal: ");
        dec_num = scan.nextInt();

        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.print("O numero em binario e: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");

    }
}
