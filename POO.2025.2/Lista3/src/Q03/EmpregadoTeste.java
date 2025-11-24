package Q03;

public class EmpregadoTeste {
    public static void main(String[] args) {
        String nome = "Virgulino";
        String sobrenome = "Silva";
        double salarioMensal = 1000;
        Empregado empregado = new Empregado(nome, sobrenome, salarioMensal);

//        System.out.printf("Empregado:\n");
//        System.out.printf("Nome: %s\n", empregado.getNome());
//        System.out.printf("Sobrenome: %s\n", empregado.getSobrenome());
//        System.out.printf("Salario mensal: %s\n", empregado.getSalarioMensal());
//        System.out.printf("Salario anual: %s\n", empregado.getSalarioAnual());
//
//        double novoSalarioMensal = empregado.getSalarioMensal() * 1.1;
//        empregado.setSalarioMensal(novoSalarioMensal);
//        empregado.setSalarioAnual(empregado.getSalarioMensal());
//
//        System.out.printf("Novo salario mensal: %s\n", empregado.getSalarioMensal());
//        System.out.printf("Novo salario anual: %s\n", empregado.getSalarioAnual());

        System.out.printf("Nome: %s.\n", empregado.nome);
        System.out.printf("Sobrenome: %s.\n", empregado.sobrenome);
        System.out.printf("Salario: %s.\n", empregado.salarioMensal);
        System.out.printf("Salario anual: %f.\n", empregado.salarioAnual);

        System.out.println("10% de aumento:");
        empregado.salarioMensal = empregado.salarioMensal * 1.1;
        empregado.salarioAnual = empregado.calcularSalarioAnual(empregado.salarioMensal);
        System.out.printf("Novo salario: %f.\n", empregado.salarioMensal);
        System.out.printf("Salario anual: %f.\n", empregado.salarioAnual);
    }
}
