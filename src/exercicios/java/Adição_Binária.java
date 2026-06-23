package exercicios.java;

import java.util.Scanner;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java para adicionar dois números binários.
 * Dados de entrada:
 * Entrada primeiro número binário: 10
 * Entrada segundo número binário: 11
 * Saída Esperada
 *
 * Soma de dois números binários: 101
 */
public class Adição_Binária {

    static void main(String[] args) {

        long binary1, binary2;
        int i = 0, remainder = 0;

        int[] sum = new int[20];

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero binario: ");
        binary1 = in.nextLong();

        System.out.println("Digite o segundo numero binario: ");
        binary2 = in.nextLong();

        while(binary1 !=0 || binary2 != 0){

            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }

        --i;

        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");
    }
}
