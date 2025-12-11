package AP2.Vivalder.Q1;

public class Lampada {
    boolean acesa;
    int watts;

    void acender(){
        this.acesa = true;
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
    }

    boolean ehEconomica(){
        return (watts <= 40);
    }

}
