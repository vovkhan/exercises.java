package Q06;
// Considere duas variáveis X e Y que possam assumir valores entre -100 e 100.
// Escreva um programa que imprima todos os valores de X e Y para os quais a soma X + Y seja igual a 100 ou igual a -100.

public class Problema {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i++) {
            for (int j = -100; j <= 100; j++) {
                if (i+j==100) {
                    System.out.printf("%d + %d = 100\n", i, j);
                } else if (i+j==-100) {
                    System.out.printf("%d + %d = -100\n", i, j);
                }
            }
        }
    }
}
