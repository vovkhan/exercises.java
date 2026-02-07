/*
Mensagem:

Atributos: 
remetente;
texto;
lida;

Métodos:
marcarComoLida();
getRemetente();
getTexto()
 */

package monitoria2;

public class Mensagem {
    private String remetente;
    private String texto;
    private boolean lido;

    Mensagem(String remetente, String texto) {
        this.remetente = remetente;
        this.texto = texto;
        this.lido = false;
    }

    public void marcarComoLida() {
        if(!lido) this.lido = true;
    }

    public String getRemetente() {
        return remetente;
    }
    public String getTexto() {
        return texto;
    }
}