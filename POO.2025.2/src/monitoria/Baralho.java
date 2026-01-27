package monitoria;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {
    private static String[] nomes = new String[]{"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", };
    private static String[] naipes = new String[]{"Copas", "Espadas", "Ouros", "Paus"};
    private ArrayList<Carta> cartas;
    private Random random;

    Baralho(){
        this.cartas = new ArrayList<Carta>();
        for(int i = 0; i < naipes.length; i++){
            for(int j = 0; j < nomes.length; j++){
                this.cartas.add(new Carta(nomes[j], naipes[i]));
            }
        }
        for(int k = 0; k < 4; k++){
            this.cartas.add(new Carta("Coringa", "Coringa"));
        }
        random = new Random();
    }

    void embaralhar(){
        int index = 0;
        int indexLimite = cartas.size();
        for(int i = 0; i < naipes.length*indexLimite; i++){
            for(int j = 0; j < nomes.length; j++){
                index = random.nextInt(indexLimite);
                this.cartas.add(this.cartas.get(index));
                this.cartas.remove(index);
            }
        }
    }

    Carta darCarta(){
        if(this.temCarta()){
            Carta carta = this.cartas.getLast();
            this.cartas.removeLast();
            return carta;
        }
        return null;
    }

    boolean temCarta(){
        if(this.cartas.isEmpty()){
            return false;
        }
        return true;
    }

    void imprimirBaralho(){
        for(Carta c: this.cartas){
            c.imprimir();
        }
    }

    Carta[] darMao(){
        if(this.temCarta() && this.cartas.size() >= 5){
            Carta[] mao = new Carta[5];
            for(int i = 0; i < 5; i++){
                mao[i] = this.darCarta();
            }
            return mao;
        }
        return null;
    }

    boolean isPair(Carta[] mao){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(mao[i].getNome().equals(mao[j].getNome())) return true;
            }
        }
        return false;
    }
    
}
