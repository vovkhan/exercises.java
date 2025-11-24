package Q08;
// (Deitel) Usando operações básicas, escreva um programa que, dado um número de cinco dígitos, separa o número
// nos seus dígitos individuais e imprime os dígitos separados uns dos outros por três espaços. Por exemplo, se o
// número é 42339, o programa deve imprimir "4 2 3 3 9".
// Depois, responda: O que acontece quando é usado um número com mais de cinco dígitos? O que acontece quando
// é usado um número com menos de cinco dígitos?
// Resposta: Da forma com que a solução foi implementada no código abaixo, apenas números com 5 dígitos,
// tanto positivos quanto negativos (apenas no código comentado, no estado atual apenas números positivos funcionam corretamente), serão processados.
// Números com dígitos além ou abaixo desta quantidade não serão processados.

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //bloco try-with-resources ausente.

        int numero;
        while (true) {
            System.out.print("Insert a 5 digit integer number: ");
            numero = input.nextInt();
//          if (numero > 9999 && numero < 100000 || numero < -9999 && numero > -100000) {
            if (numero > 9999 && numero < 100000) {
                break;
            }
        }
/*
        String numeroString = Integer.toString(numero);
        for (int i = 0; i < numeroString.length(); i++) {
            if ((i+1) == numeroString.length()) {
                System.out.printf("%c.", numeroString.charAt(i));
            } else {
                System.out.printf("%c   ", numeroString.charAt(i));
            }
        }
*/
        int[] valores = new int[5];
        int resto = numero;
        int valorAtual;
        for (int i = 0; i < 5; i++) {
            valorAtual = resto%10;
            resto = resto/10;
            valores[i] = valorAtual;
        }

        for (int i = 4; i >= 0; i--) {
            if (i == 0) {
                System.out.printf("%d.", valores[i]);
            } else {
                System.out.printf("%d   ", valores[i]);
            }
        }
    }
}
