package AP2.Vivalder.Q2;

public class LampadaTresEstados {
    boolean acesa;
    double luminosidade;

    void acender(){
        this.setLuminosidade(100);
        this.acesa = true;

    }
    void apagar(){
        this.setLuminosidade(0);
        this.acesa = false;

    }

    void setLuminosidade(double luminosidade) {
        if (luminosidade <= 0.0) {
            this.luminosidade = 0.0;
            this.acesa = false;
        } else if (luminosidade >= 100) {
            this.luminosidade = 100.0;
            this.acesa = true;
        } else {
            this.luminosidade = luminosidade;
            this.acesa = true;
        }
    }
    void exibirEstado(){
        if(acesa){
            System.out.printf("A lâmpada está acesa. luminosidade: %.2f%%.%n",  luminosidade);
        } else {
            System.out.printf("A lâmpada está apagada.%n");
        }
    }
}
