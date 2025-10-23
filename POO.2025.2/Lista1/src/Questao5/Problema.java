package Questao5;
// (Deitel) Escreva um programa que determina se três valores diferentes de zero poderiam representar os lados de um triângulo.
// O resultado deve ser impresso no console. Dica: A soma de quaisquer dois lados do triângulo deve ser maior que o terceiro lado.
// Além disso, os lados devem ser positivos.

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] lados = new int[3];
        for (int i = 0; i < lados.length; i++) {
            System.out.print("Insert value for side "+(i+1)+": ");
            lados[i] = input.nextInt();
        }

        boolean greaterThanZero = lados[0] > 0 && lados[1] > 0 && lados[2] > 0;
        boolean sumsGreaterThanThird = lados[0]+lados[1]>lados[2] || lados[0]+lados[2]>lados[1] || lados[1]+lados[2]>lados[0];
        if (greaterThanZero && sumsGreaterThanThird) {
            System.out.println("These 3 sides make an triangle.");
        } else {
            System.out.println("These 3 sides don't make an triangle.");
        }
    }
}
