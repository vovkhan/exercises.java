package Q04;

public class Conta {
    String numero;
    double saldo;
    Cliente cliente;

    Conta(String numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0;
        this.cliente = cliente;
    }
    Conta(String numero) {
        this.numero = numero;
        this.saldo = 0;
        this.cliente = null;
    }
    Conta(double saldo) {
        this.numero = "";
        this.saldo = saldo;
        this.cliente = null;
    }
    Conta(Cliente cliente) {
        this.numero = "";
        this.saldo = 0;
        this.cliente = cliente;
    }
    Conta() {
        this.numero = "";
        this.saldo = 0;
        this.cliente = null;
    }

    void creditar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }
    void debitar(double valor){
        if(valor >= 0 && this.saldo >= valor){
            this.saldo -= valor;
        }
    }
    void transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.creditar(valor);
        }
    }
}
