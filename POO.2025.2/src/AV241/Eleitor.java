package AV241;

public class Eleitor {
    private String nome;
    private String titulo;
    private boolean jaVotou;

    Eleitor(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
        this.jaVotou = false;
    }

    public String getNome() {
        return nome;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean getJaVotou() {
        return jaVotou;
    }
}
