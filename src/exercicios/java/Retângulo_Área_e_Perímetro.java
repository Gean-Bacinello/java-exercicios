package exercicios.java;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
 * Dados do teste:
 * Largura = 5,5 Altura = 8,5
 *
 * Saída Esperada
 * Área é de 5,6 * 8,5 = 47,60
 * O perímetro é 2 * (5.6 + 8,5) = 28,20
 */

public class Retângulo_Área_e_Perímetro {
    static void main(String[] args) {


        double largura = 5.6;
        double altura = 8.5;

        double area =  largura * altura;

        double perimetro = (2 * largura) + (2 * altura);

        System.out.printf("Perimetro e 2*(%.1f + %.1f) = %.2f \n", altura,largura,perimetro);

        System.out.printf("Area e %.1f * %.1f = %.2f \n", largura, altura, area);
    }
}
