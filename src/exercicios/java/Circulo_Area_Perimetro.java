package exercicios.java;

/**
 * Gean Corrêa Bacinello
 *
 * Escreva um programa Java para imprimir a área e o perímetro de um círculo.
 * Dados do teste:
 * Raio = 7,5
 * Saída Esperada
 * O perímetro é = 47.12388980384689
 * Área é = 176.7145867642586
 */

public class Circulo_Area_Perimetro {
    public static void main(String[] args){

        double raio = 7.5;

        double area;
        double perimetro;

        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
