package Q04;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome1 = input.next();
        System.out.print("CPF do cliente: ");
        String cpf1 = input.next();
        Cliente cliente1 = new Cliente(nome1, cpf1);

        System.out.print("Saldo para conta 1: ");
        double saldo1 = input.nextDouble();
        Conta conta1 = new Conta(Integer.toString(1), saldo1, cliente1);

        System.out.print("Saldo para conta 2: ");
        double saldo2 = input.nextDouble();
        Conta conta2 = new Conta(Integer.toString(2), saldo2, cliente1);

        System.out.println("Info do cliente: ");
        System.out.println(cliente1.nome + " " + cliente1.cpf);
        System.out.println("Info da conta 1:");
        System.out.printf("Conta numero: %s, saldo: %.2f.\n", conta1.numero, conta1.saldo);
        System.out.println("Info da conta 2:");
        System.out.printf("Conta numero: %s, saldo: %.2f.\n", conta2.numero, conta2.saldo);
    }
}
