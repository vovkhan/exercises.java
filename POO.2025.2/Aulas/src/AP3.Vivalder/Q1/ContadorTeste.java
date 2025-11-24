package AP3.Vivalder.Q1;

public class ContadorTeste {
    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.printf("consulta inicial do contador: %d.\n", contador.consultarContagem());
        for (int i = 0; i < 10; i++) {
            contador.incrementarContagem();
        }
        System.out.printf("consulta do contador após loop de 10 incrementos: %d.\n", contador.consultarContagem());
        contador.zerarContagem();
        System.out.printf("consulta do contador após zerar contagem: %d.\n", contador.consultarContagem());

    }
}
