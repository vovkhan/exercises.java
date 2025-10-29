package Questao11;
// (Deitel) Escreva um programa que, dado um número binário (isto é, um inteiro que contém somente 0s e 1s),
// imprime o seu equivalente decimal. Dica: Utilize os operadores de resto e divisão para pegar os dígitos do número
// binário um de cada vez da direita para a esquerda.

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int binario;
        System.out.print("Insert the binary value: ");
        binario = input.nextInt();
        int binarioComprimento = Integer.toUnsignedString(binario).length();

        int[] binarioInvertido = new int[binarioComprimento];
        int resto = binario;
        int valorAtual;
        for (int i = 0; i < binarioComprimento; i++) {
            valorAtual = resto % 10;
            resto /= 10;
            binarioInvertido[i] = valorAtual;
        }

        int j = 0;
        int[] binarioConvertido = new int[binarioComprimento];
        for (int i = (binarioComprimento-1); i >= 0; i--) {
            binarioConvertido[j] = binarioInvertido[i]*(2^j);
            j++;
        }

        int somaTotal = 0;
        for (int i = 0; i < binarioComprimento; i++) {
            somaTotal += binarioConvertido[i];
        }
        System.out.printf("the binary %d in decimal equals to: %d", binario, somaTotal);
    }
}
