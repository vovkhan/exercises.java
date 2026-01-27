package AV241;

import java.util.ArrayList;

public class Urna {
    private ArrayList<Candidato> candidatos;
    private ArrayList<Eleitor> eleitores;
    private int votosNulos;

    Urna() {
        this.candidatos = new ArrayList<Candidato>();
        this.eleitores = new ArrayList<Eleitor>();
        this.votosNulos = 0;
    }

}
