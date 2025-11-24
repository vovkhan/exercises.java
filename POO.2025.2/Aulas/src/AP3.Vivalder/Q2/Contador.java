package AP3.Vivalder.Q2;

public class Contador {
    int contagem;

    public Contador(int valorInicial) {
        this.contagem = valorInicial;
    }
    public Contador() {
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
