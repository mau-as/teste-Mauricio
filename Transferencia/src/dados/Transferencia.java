package dados;

import entrada.FormatoException;
import entrada.Valida;

public class Transferencia implements Cloneable{
    
    private int id_transferencia;
    private double valor_transferencia;
    private Conta conta_receptor;
    private Conta conta_emissor;
    private String tipo_transferencia;

    public Transferencia(String[] dados) throws FormatoException{

        Valida.dados(dados);
        
        this.id_transferencia = Integer.parseInt(dados[0]);
        this.valor_transferencia = Double.parseDouble(dados[1]);
        this.tipo_transferencia = dados[2];
        
        Pessoa emissor = new Pessoa(dados[3],dados[6]);
        this.conta_emissor = new Conta(emissor, Integer.parseInt(dados[4]), Integer.parseInt(dados[5]));

        Pessoa receptor = new Pessoa(dados[7],dados[10]);
        this.conta_receptor = new Conta(receptor, Integer.parseInt(dados[8]), Integer.parseInt(dados[9]));

    }

    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException e){
            return this;
        }
    }

    public int getId_transferencia() {
        return this.id_transferencia;
    }

    public void setId_transferencia(int id_transferencia) {
        this.id_transferencia = id_transferencia;
    }

    public double getValor_transferencia() {
        return this.valor_transferencia;
    }

    public void setValor_transferencia(double valor_transferencia) {
        this.valor_transferencia = valor_transferencia;
    }

    public Conta getConta_receptor() {
        return (Conta)conta_receptor.clone();
    }

    public void setConta_receptor(Conta conta_receptor) {
        this.conta_receptor = conta_receptor;
    }

    public Conta getConta_emissor() {
        return (Conta)conta_emissor.clone();
    }

    public void setConta_emissor(Conta conta_emissor) {
        this.conta_emissor = conta_emissor;
    }

    public String getTipo_transferencia() {
        return this.tipo_transferencia;
    }

    public void setTipo_transferencia(String tipo_transferencia) {
        this.tipo_transferencia = tipo_transferencia;
    }

}