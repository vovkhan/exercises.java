package AP2.Vivalder.Q1;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        boolean estadoEconomica;
        
        lampada.acender();
        lampada.exibirEstado();

        lampada.apagar();
        lampada.exibirEstado();
        
        lampada.watts = 30;
        estadoEconomica = lampada.ehEconomica();
        System.out.printf("A lâmpada é econômica? %b. watts: %d.%n", estadoEconomica, lampada.watts);
        
        lampada.watts = 60;
        estadoEconomica = lampada.ehEconomica();
        System.out.printf("A lâmpada é econômica? %b. watts: %d.%n", estadoEconomica, lampada.watts);
    }
}
