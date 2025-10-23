package Questao3;
// Usando loop, escreva um programa para exibir a seguinte tabela de valores:
/*
N   10*N    100*N   1000*N
1   10      100     1000
2   20      200     2000
3   30      300     3000
4   40      400     4000
5   50      500     5000
*/

public class Problema {
    public static void main(String[] args) {
        int multipliers[] = {1, 10, 100, 1000};
        System.out.println("N    10*N  100*N  1000*N");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < multipliers.length; j++){
                System.out.print((i+1)*multipliers[j]+"    ");
            }
            System.out.println();
        }
    }
}
