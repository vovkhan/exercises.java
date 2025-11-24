package AP2.Vivalder.Q2;

public class LampadaTresEstadosTeste {
    public static void main(String[] args) {
        LampadaTresEstados lampada = new LampadaTresEstados();

        lampada.acender();
        lampada.exibirEstado();

        lampada.apagar();
        lampada.exibirEstado();

        lampada.setLuminosidade(75);
        lampada.exibirEstado();

        lampada.setLuminosidade(-5);
        lampada.exibirEstado();

        lampada.setLuminosidade(105);
        lampada.exibirEstado();
    }
}
