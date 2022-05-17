package entrada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
    
    public static String[] ler(String[] args) throws IOException{
        
        String LinhaDados;
        File file;

        if(args.length==0){
            file = new File("entrada.txt");

        }
        else{
            file = new File(args[0]);
        }
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        do{                                      
            LinhaDados = br.readLine();               //ignora a linha com o nome das variaveis, tendo em vista que são sempre iguais e na mesma ordem.
        }while(LinhaDados.isEmpty());                 //sempre pega a primeira linha que tiver conteúdo, independente de onde seja
        
        
        do{
            LinhaDados = br.readLine();               //string que recebe a linha contendo os valores
        }while(LinhaDados.isEmpty());                 //sempre pega a segunda linha que contém algo, independente de onde esteja

        String[] partsDados = LinhaDados.split("[|]"); //a partir de string, cria array com cada dado em uma posição na mesma ordem que foi passado
        
        fr.close();
        br.close();

        return partsDados;
        }
    
}
