package Q02;
// (Deitel) Em uma grande empresa, o vendedor recebe R$200 por semana mais 9% das suas vendas da semana.
// Por exemplo, um vendedor que vende R$5000 durante a semana recebe R$200 mais 9% de R$5000, totalizando R$650.
// Dados os itens vendidos por um vendedor apresentados a seguir, crie um programa para calcular e exibir a remuneração semanal desse vendedor.
/*
Item | Valor
1    | R$239,99
2    | R$129,75
3    | R$99,95
4    | R$350,89
*/
import java.util.ArrayList;

public class Problema {
    private ArrayList<Double> itensVendidos;
    private int qtdItensVendidos;

    public Problema(){
        this.itensVendidos = new ArrayList<Double>();
        this.qtdItensVendidos = 0;
    }

    public ArrayList<Double> getItensVendidos(){
        return this.itensVendidos;
    }
    public int getQtdItensVendidos(){
        return this.qtdItensVendidos;
    }

    public void addItemVendido(Double valor){
        this.itensVendidos.add(valor);
        this.qtdItensVendidos++;
    }
    public void removeItemVendido(int Index){
        this.itensVendidos.remove(Index);
        this.qtdItensVendidos--;
    }

    public Double calcularTotal(){
        double soma = 0;
        for(int i = 0; i < this.qtdItensVendidos; i++){
            soma += this.itensVendidos.get(i);
        }
        return soma;
    }
    public double calcularBonusPercentual(){
        return this.calcularTotal() * 0.09;
    }
    public double calcularPagamento(){
        return 200 + calcularBonusPercentual();
    }

    public void printLista(){
        System.out.println("Sold Items:");
        for(int i = 0; i < this.qtdItensVendidos; i++){
            System.out.println("Item "+(i+1)+": R$"+String.format("%.2f",this.itensVendidos.get(i)));
        }
    }
    public void printCalculos(){
        System.out.println("Total sum of sold item's values: R$"+String.format("%.2f", this.calcularTotal())+".");
        System.out.println("Percentual bonus: R$"+String.format("%.2f",this.calcularBonusPercentual())+".");
        System.out.println("Total payment for sold item's values: R$"+String.format("%.2f", this.calcularPagamento())+".");
    }
}
