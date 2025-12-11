package Q04;

public class Endereco {
    String cep;
    String rua;
    String bairro;
    String complemento;

    Endereco(String cep, String rua, String bairro, String complemento) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
    }
    Endereco(String cep, String rua, String bairro){
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
    }
}
