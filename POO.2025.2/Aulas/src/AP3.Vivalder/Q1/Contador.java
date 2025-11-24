package AP3.Vivalder.Q1;

public class Contador {
    int contagem;

    Contador(int valorInicial) {
        this.contagem = valorInicial;
    }
    Contador() {
        this.contagem = 0;
    }

    void zerarContagem() {
        this.contagem = 0;
    }
    void incrementarContagem() {
        this.contagem++;
    }

    int consultarContagem() { return contagem;};
}
