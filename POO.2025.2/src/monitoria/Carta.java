package monitoria;

public class Carta {
    private String nome;
    private String naipe;

    Carta(String nome, String naipe){
        this.nome = nome;
        this.naipe = naipe;
    }
    
    public void imprimir(){
        System.out.printf("%s de %s.%n", this.nome, this.naipe);
    }

    public String getNome() {
        return nome;
    }
    public String getNaipe() {
        return naipe;
    }
}
