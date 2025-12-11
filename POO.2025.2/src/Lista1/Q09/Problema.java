package Q09;
// Faça um programa que calcula o retorno de um investimento financeiro fazendo as contas mês a mês, sem usar a
// fórmula de juros compostos. Dado o valor que será investido por mês e a taxa de juros mensal, o programa deve
// informar o saldo do investimento após um ano (soma das aplicações mês a mês considerando os juros compostos).
// Por exemplo, se for investido R$100,00 por mês, sendo a taxa de juros de 1% ao mês, o programa forneceria a
// seguinte saída: saldo do investimento após 1 ano: 1280.9328043328942.

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the monthly fees tax percentage: %");
        double jurosMensal  = input.nextDouble()/100;
        System.out.print("Insert the monthly investment value: R$");
        double investimentoMensal = input.nextDouble();

        double resultadoAnual = 0;
        for (int i = 1; i <= 12; i++) {
            resultadoAnual += investimentoMensal;
            resultadoAnual += jurosMensal * resultadoAnual;
        }
        System.out.printf("1-year investment results: %f%n", resultadoAnual);
    }
}
