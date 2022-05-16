package dados;

public class Conta implements Cloneable{
    
    private Pessoa dono;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta(Pessoa dono, int agencia, int conta){
        this.dono = dono;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException e){
            return this;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public Pessoa getDono() { 
        return (Pessoa)dono.clone();
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

}
