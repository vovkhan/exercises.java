package AP3.Vivalder.Q2;

public class Lampada {
    boolean acesa;
    int watts;
    Contador vezesAcesa;
    // A relação entre as classes Contador e Lampada é de COMPOSIÇÃO,
    // onde um contador do tipo Contador é referenciado como atributo
    // da classe Lampada e utilizado para detarminar a contagem de vezes
    // em que a lampada foi acendida, isto é, quantas vezes passou pelo ciclo de ligar/desligar.

    Lampada(boolean acesa, int watts, int vezesAcesa) {
        this.acesa = acesa;
        this.watts = watts;
        this.vezesAcesa = new Contador(vezesAcesa);
    }
    Lampada(boolean acesa, int watts) {
        this.acesa = acesa;
        this.watts = watts;
        this.vezesAcesa = new Contador();
    }
    Lampada(){
        this.acesa = false;
        this.watts = 40;
        this.vezesAcesa = new Contador();
    }

    void acender(){
        this.acesa = true;
        this.vezesAcesa.incrementarContagem();
    }
    void apagar(){
        this.acesa = false;
    }

    void exibirEstado(){
        if(acesa){
            System.out.printf("A lâmpada está acesa.%n");
        } else {
            System.out.printf("A lâmpada está apagada.%n");
        }
        System.out.printf("Vezes acendida: %d.\n", this.vezesAcesa.consultarContagem());
    }

    boolean ehEconomica(){
        return (watts <= 40);
    }
}
