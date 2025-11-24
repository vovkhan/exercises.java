package Q07;
// Crie um programa que calcula e exibe o produto dos números inteiros ímpares entre 1 e 15.
public class Problema {
    public static void main(String[] args) {
        int produtoTotal = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                produtoTotal *= i;
            }
        }
        System.out.printf("the product for all the odd numbers between 1 and 15 is: %d.%n", produtoTotal);
    }
}
