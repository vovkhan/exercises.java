package Q0102;

import Q01.Problema;

public class Teste {
    public static void main(String[] args) {
        System.out.printf("Problema com contrutor default:\n");
        Problema p1 = new Problema();
        System.out.printf("Problema com contrutor modificado:\n");
        Problema p2 = new Problema("Construtor modificado.");
    }
}
