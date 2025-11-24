package AP3.Vivalder.Q2;

public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada(false, 45);

        System.out.println("Lâmpada 1:");
        lampada1.exibirEstado();
        for (int i = 0; i < 3; i++) {
            lampada1.acender();
            lampada1.apagar();
        }
        lampada1.exibirEstado();
        lampada1.vezesAcesa.zerarContagem();
        System.out.printf("Após limpar contador: %d.%n", lampada1.vezesAcesa.consultarContagem());

        boolean estadoEconomica1;
        estadoEconomica1 = lampada1.ehEconomica();
        System.out.printf("A lâmpada 1 é econômica? %b. watts: %d.%n", estadoEconomica1, lampada1.watts);
        System.out.println();
        System.out.println("Lâmpada 2:");
        lampada2.exibirEstado();
        for (int i = 0; i < 15; i++) {
            lampada2.acender();
            lampada2.apagar();
        }
        lampada2.exibirEstado();
        lampada2.vezesAcesa.zerarContagem();
        System.out.printf("Após limpar contador: %d.%n", lampada2.vezesAcesa.consultarContagem());

        boolean estadoEconomica2;
        estadoEconomica2 = lampada2.ehEconomica();
        System.out.printf("A lâmpada 1 é econômica? %b. watts: %d.%n", estadoEconomica2, lampada2.watts);
    }
}
