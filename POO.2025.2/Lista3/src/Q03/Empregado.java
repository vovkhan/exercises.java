package Q03;

public class Empregado {

    String nome, sobrenome;
    double salarioMensal;
    double salarioAnual;

    Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        if (salarioMensal < 0) {
            this.salarioMensal = 0;
        } else {
            this.salarioMensal = salarioMensal;
        }

        this.salarioAnual = this.calcularSalarioAnual(this.salarioMensal);
    }

    //    public double getSalarioMensal() { return salarioMensal;};
    //    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal;};
    //    public void setNome(String nome) { this.nome = nome;};
    //    public String getNome() { return nome;};
    //    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome;};
    //    public String getSobrenome() { return sobrenome;};
    //    public double getSalarioAnual() { return salarioAnual;}
    //    public void setSalarioAnual(double salarioMensal) { this.salarioAnual = this.calcularSalarioAnual(salarioMensal);};

    double calcularSalarioAnual(double salarioMensal) {
        return salarioMensal * 12;
    }
}
