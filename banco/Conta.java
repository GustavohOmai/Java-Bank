package banco;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Pessoa titular;

    public Conta(int agencia, int numero){
        this.agencia=agencia;
        this.numero=numero;
    }

    public void deposit(double valor){
        saldo += valor;
    }
    public boolean withdraw(double valor){
        if (saldo>=valor){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean transfer(double valor, Conta destino){
        if (saldo>=valor){
            withdraw(valor);
            destino.deposit(valor);
            return true;
        }
            return false;
    }

    public double getSaldo(){
        return  saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}