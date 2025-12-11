package Lista5.Q17;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaBebidas {
    double[] moedasValidas;
    double[] precos;
    String[] bebidas;
    ArrayList<Double> moedasInseridas;
    Scanner scanner;

    MaquinaBebidas(){
        this.bebidas = new String[]{"Café", "Chocolate Quente", "Cappuccino"};
        this.precos = new double[]{2, 5, 3};
        this.moedasValidas = new double[]{0.05, 0.10, 0.25, 0.5, 1.0};
        this.moedasInseridas = new ArrayList<Double>();
        this.scanner = new Scanner(System.in);
    }

    double contarMoedas(ArrayList<Double> moedasArrayList){
        double soma = 0;
        for(double m: moedasArrayList) soma += m;
        return soma;
    };
    void inserirMoedas(double[] moedasValidas, ArrayList<Double> moedasArrayList, Scanner scanner){
        while(true){
            double moeda;
            System.out.printf("Insira uma moeda: ");
            moeda = scanner.nextDouble();
            for(double m: moedasValidas){
                if(moeda == m){
                    moedasArrayList.add(moeda);
                }
            }
        }
    }
}
