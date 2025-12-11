package Q04;
// (Deitel) Fatoriais costumam ser utilizados em problemas de probabilidade.
// O fatorial de um inteiro positivo n, escrito como n! e pronunciado como "fatorial de n", é igual ao produto dos números inteiros positivos de 1 à n.
// Escreva um programa que calcula os fatoriais de 1 à 20. Utilize o tipo long. Exiba os resultados em formato tabular.

public class Problema {

    public long calcularFatorial(int n){
        if (n <= 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Problema p = new Problema();
        for (int i = 1; i <=20; i++) {
            System.out.println("the factorial of "+i+" is: "+p.calcularFatorial(i));
        }
    }
}
