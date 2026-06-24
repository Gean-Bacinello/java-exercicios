package exercicios.java;

import java.util.Scanner;

/**
 *  Gean Corrêa Bacinello
 *
 *  Escreva um programa Java para converter um número decimal em um número hexadecimal.
 *  Dados de entrada:
 *  Insira um número decimal: 15
 *  Saída Esperada
 *
 *  Número hexadecimal é : F
 */

public class Decimal_para_Hexadecimal_Conversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int decimal = scanner.nextInt();
        scanner.close();

        if (decimal == 0) {
            System.out.println("Hexadecimal: 0");
            return;
        }

        // Vetor contendo os caracteres hexadecimais correspondentes
        char[] caracteresHexa = {'0', '1', '2', '3', '4', '5', '6', '7',
                                 '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        String hexadecimal = "";
        int resto;

        // Loop para obter os restos
        while (decimal > 0) {
            resto = decimal % 16;
            hexadecimal = caracteresHexa[resto] + hexadecimal;
            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal: " + hexadecimal);
    }
}
