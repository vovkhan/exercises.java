package Q01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("type the first number: ");
        int num1 = sc.nextInt();
        System.out.print("type the second number: ");
        int num2 =  sc.nextInt();

        Problema teste = new Problema(num1,num2);
        teste.num1IsMultipleOf2();
    }
}
