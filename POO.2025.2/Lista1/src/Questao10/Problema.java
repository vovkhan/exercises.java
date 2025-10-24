package Questao10;

import java.util.Scanner;

/*
Faça um programa para um caixa eletrônico. Dado o valor do saque, o programa deve informar quantas notas de
cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo de saque é
de 10 reais e o máximo, de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
máquina.
● Exemplo 1: Para sacar R$256, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma
nota de 1;
● Exemplo 2: Para sacar R$399, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma
nota de 5 e quatro notas de 1.
*/
public class Problema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notas = {100, 50, 10, 5, 1};

        int valorSaque;
        while(true){
            System.out.print("Insert the value to be exchanged: ");
            valorSaque = (int) (input.nextDouble());
            if (valorSaque >= 10 && valorSaque <= 600) {
                break;
            }
        }

        int[] qtdNotas = new int[notas.length];
        int resto = valorSaque;
        for (int i = 0; i < notas.length; i++) {
            if (resto >= notas[i]) {
                qtdNotas[i] = resto/notas[i];
                resto -= qtdNotas[i]*notas[i];
            }
        }

        System.out.printf("O valor %d resulta na seguinte combinação de notas sortidas:%n", valorSaque);
        for (int i = 0; i < notas.length; i++) {
            if (qtdNotas[i] != 0) {
                System.out.printf("%d notas de %d.%n", qtdNotas[i], notas[i]);
            }
        }
    }
}
