/*
WhatsApp)

Atributos:
celular;
mensagens;
qtdMensagens.

Métodos:

receberMensagem(Mensagem m);
lerMensagem(String remetente);
qtdNaoLidas();
listarNaoLidas().
*/
package monitoria2;

import java.util.ArrayList;

public class Uatizap {
    private Celular celular;
    private ArrayList<Mensagem> mensagens;
    // private int qtdMensagens;

    Uatizap(Celular celular) {
        this.celular = celular;
        this.mensagens = new ArrayList<Mensagem>();
        // this.qtdMensagens = this.mensagens.size();
    }

    private void imprimirMensagem(Mensagem m) {
        System.out.printf("%s:\n%s.\n", m.getRemetente(), m.getTexto());
    }
    public void receberMensagem(Mensagem m) {
        if (this.celular.usarBateria(1)) this.mensagens.add(m);
    }
    public void lerMensagem(String remetente) {
        for (Mensagem mensagem : mensagens) {
            if(mensagem.getRemetente().equals(remetente)) {
                this.imprimirMensagem(mensagem);
                mensagem.marcarComoLida();
            }
        }
    }
    public int qtdNaoLidas() {
        int qtdNaoLidas = 0;
        for (Mensagem mensagem : mensagens) {
            if(!mensagem.getLido()) qtdNaoLidas++;
        }
        return qtdNaoLidas;
    }
    public void listarNaoLidas() {
        for (Mensagem mensagem : mensagens) {
            if(!mensagem.getLido()) this.imprimirMensagem(mensagem);
        }
    }
    public int getQtdMensagens() {
        return this.mensagens.size();
    }
}