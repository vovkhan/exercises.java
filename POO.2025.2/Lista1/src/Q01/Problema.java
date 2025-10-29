package Questao1;
// (Deitel) Escreva um programa que, dado dois valores inteiros, determina se o primeiro é múltiplo do segundo e e imprime o resultado.
public class Problema {
    private int numero1;
    private int numero2;

    public Problema(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void num1IsMultipleOf2() {
        if (this.numero1 % this.numero2 == 0) {
            System.out.println("the number '"+this.numero1+"' IS multiple of '"+this.numero2+"'.");
        } else {
            System.out.println("the number '"+this.numero1+"' IS NOT multiple of '"+this.numero2+"'.");
        }
    }
}
