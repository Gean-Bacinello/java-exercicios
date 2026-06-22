package exercicios.java;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java para imprimir um rosto.
 * Saída Esperada
 *
 *  +"""""+
 * [| o o |]
 *  |  ^  |
 *  | '-' |
 *  +------+
 */

public class Impressora_facial {
    static void main(String[] args) {

        String[] arra = new String[5];

        arra[0] = " +\"\"\"\"\"+ ";
        arra[1] = "[| o o |]";
        arra[2] = " |  ^  |";
        arra[3] = " | '-' |";
        arra[4] = " +-----+";

        for (int i = 0; i < 5; i++) {
            System.out.println(arra[i]);
        }
    }
}
