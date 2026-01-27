package AV241;

public class Candidato {
    private String nome;
    private String numero;
    private String sigla;
    private int idade;
    private int qtdVotos;

    Candidato(String nome, int numero, String sigla, int idade) {
        this.nome = nome;
        this.numero = String.valueOf(numero);
        this.sigla = sigla;
        this.idade = idade;
        qtdVotos = 0;
    }

    public String getNome() {
        return nome;
    }
    public String getNumero() {
        return numero;
    }
    public String getSigla() {
        return sigla;
    }
    public int getIdade() {
        return idade;
    }
    public int getQtdVotos() {
        return qtdVotos;
    }

    public void contarVoto() {
        this.qtdVotos++;
    }
}
