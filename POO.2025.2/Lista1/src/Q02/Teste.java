package Q02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Problema teste = new Problema();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the sold items quantity: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){
            System.out.print("Insert the value for item " + (i+1) + ": ");
            double valor = sc.nextDouble();
            teste.addItemVendido(valor);
        }

        teste.printLista();
        teste.printCalculos();
    }
}
