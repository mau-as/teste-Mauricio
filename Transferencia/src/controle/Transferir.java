package controle;

import java.text.NumberFormat;
import java.util.Locale;
import dados.Conta;
import dados.Transferencia;


public abstract class Transferir {

    protected abstract void realizar(String dados[]);

    public void limites(double valor_transferencia,double valor_minimo,double valor_maximo) throws RegraNegocioException{
        
        if(valor_transferencia<=valor_minimo){
            throw new RegraNegocioException("valor_transferencia abaixo do permitido para esse tipo de transferencia. Para esse tipo de transferência, o valor precisa ser acima de " + valor_minimo);
            
        }
        if(valor_maximo!=0){       // O valor 0 representa que não possui valor máximo
            if(valor_transferencia>valor_maximo){
                throw new RegraNegocioException("valor_transferencia acima do permitido para esse tipo de transferencia. Para esse tipo de transferência, o valor máximo é de " + valor_maximo);

            }
        }
    }

    protected void alterarSaldos(Transferencia transferencia){
        
        double valor_transferencia = transferencia.getValor_transferencia();
        
        Conta conta = transferencia.getConta_emissor();
        conta.setSaldo((-1)*valor_transferencia);
        transferencia.setConta_emissor(conta);
        
        conta = transferencia.getConta_receptor();
        conta.setSaldo(valor_transferencia);
        transferencia.setConta_receptor(conta);
    }

    protected void mostrarNovoSaldo(Transferencia transferencia){

        Locale brasil = new Locale( "pt", "BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(brasil);

        System.out.println("Sua transferência foi realizada com sucesso!");
        Conta conta = transferencia.getConta_emissor();
        System.out.println("Saldo do emissor: " + real.format(conta.getSaldo()));
        conta = transferencia.getConta_receptor();
        System.out.println("Saldo do receptor: " + real.format(conta.getSaldo()));

    }

}
