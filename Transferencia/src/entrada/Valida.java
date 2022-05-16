package entrada;

import controle.RegraNegocioException;

public class Valida {

    public static boolean inteiro(String StrInt){
        if(StrInt.matches("[0-9]+"))
            return true;
        else
            return false;
    }

    public static boolean decimal(String StrInt){
        if(StrInt.matches("[0-9]*\\.?[0-9]+"))
            return true;
        else
            return false;
    }

    public static boolean tipoTransferencia(String tipo_transferencia){
        if(tipo_transferencia.equals("PIX") || tipo_transferencia.equals("TED") || tipo_transferencia.equals("DOC"))
            return true;
        else
            return false;
    }

    public static boolean nome (String nome_pessoa){

        if(nome_pessoa.charAt(0) == ' ' || nome_pessoa.charAt((nome_pessoa.length())-1) == ' ')
            return false;

        nome_pessoa = nome_pessoa.replaceAll(" ", "");
        if(nome_pessoa.matches("[a-zA-Z]+"))
            return true;
        else
            return false;

    }

    public static boolean cpf (String pessoa_cpf){
        if(pessoa_cpf.charAt(3) == '.' && pessoa_cpf.charAt(7) == '.' && pessoa_cpf.charAt(11) == '-'){
            pessoa_cpf = pessoa_cpf.replace("-","");
            pessoa_cpf = pessoa_cpf.replace(".","");
        }

        if(pessoa_cpf.length()==11){
            if(!inteiro(pessoa_cpf))
                return false;
        }
        else{
            return false;
        }
        return true;
    }


    public static void dados (String[] dados) throws FormatoException, RegraNegocioException{

        if(!inteiro(dados[0])){
            throw new FormatoException("formato do id_transferencia está incorreto");
        }
        if(!decimal(dados[1])){
            throw new FormatoException("formato do valor_transferencia está incorreto");
        }   
        if(!tipoTransferencia(dados[2])){
            throw new FormatoException("formato do tipo_transferencia está incorreto");
        }
        if(!nome(dados[3])){
            throw new FormatoException("formato do nome_emissor está incorreto");
        }
        if(!inteiro(dados[4])){
            throw new FormatoException("formato da agencia_emissor está incorreto");
        }
        if(!inteiro(dados[5])){
            throw new FormatoException("formato da conta_emissor está incorreto");
        }
        if(!cpf(dados[6])){
            throw new FormatoException("formato do cpf_emissor está incorreto");
        }
        if(!nome(dados[7])){
            throw new FormatoException("formato do nome_receptor está incorreto");
        }
        if(!inteiro(dados[8])){
            throw new FormatoException("formato da agencia_receptor está incorreto");
        }
        if(!inteiro(dados[9])){
            throw new FormatoException("formato da conta_receptor está incorreto");
        }
        if(!cpf(dados[10])){
            throw new FormatoException("formato do cpf_receptor está incorreto");
        }
        if(dados[4].equals(dados[8]) && dados[5].equals(dados[9])){
            throw new RegraNegocioException("não é possível realizar transferência para a mesma conta.");
        }
    }
}

