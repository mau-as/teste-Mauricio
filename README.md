# Sobre o código

**Compilação e execução**

1. Abra algum terminal.
2. Vá para o diretório Transferência.
3. Para compilar, digite: 
      
       javac -p ./bin -cp ./src ./src/controle/Main.java
4. Para executar, digite: 
      
       java -cp ./bin controle.Main
   
Se quiser compilar e executar a partir de outro diretório, apenas substitua os "." pelo caminho até o diretório Transferência.
   
Caso queira alterar onde os arquivos .class serão gerados pela compilação apenas mude o "./bin" para o caminho do diretório desejado. Para executar, também substitua o "./bin" pelo mesmo da compilação.
   
**Entrada**

  O programa aceita como entrada um arquivo chamado "entrada.txt" que pode ser passado como argumento para a execução. Caso não haja argumento, o programa procurará o arquivo "entrada.txt" no diretório atual aberto.
  
  Exemplo de execução passando o arquivo como argumento:
         
    java -cp ./bin controle.Main /home/mauricio/Documents/projects/entrada.txt
      
  Para o funcionamento correto do código, o arquivo precisa conter em sua segunda linha não vazia os valores das variáveis na mesma ordem que o exemplo de entrada.txt da questão.

**Saída**

  A saída consiste em prints no terminal em que o código foi executado informando algum possível erro ou o sucesso na transferência.
  
**Visão da construção do código**

  O código foi desenvolvido visando a facilidade de manutenção e inclusão de novas features. Por isso, os pacotes e as classes do código foram organizadas buscando minimizar a quantidade de trabalho necessário para a realização de ajustes. Nesse sentido, uma possível inclusão de um tipo de entrada diferente ou de um novo tipo de transferência seriam mais eficientes, por exemplo.
  
  A partir da experiência que já tive de dentro do Itaú, tornou-se claro o quão grande a empresa é em todos os sentidos, refletindo na quantidade de seus códigos e suas extensões. Somando isso ao momento de migrações e transições de tecnologias que o banco se encontra, é evidente que o tipo de desenvolvimento que eu busquei é imprescindível ao Itaú.











# teste-estag-canais

![alt text](https://static.vecteezy.com/system/resources/previews/003/326/613/non_2x/software-engineering-concept-for-website-and-mobile-site-vector.jpg)

Olá! Para seguirmos com o nosso processo seletivo do nosso programa de estágio, precisamos que você solucione o problema de lógica abaixo:

Primeiro, faça um fork desse repositório e adicione no seu github pessoal, clicando nesse link -> https://github.com/itau-canais-estag/teste-estag-canais/fork

No final do teste, envie no e-mail que você recebeu sobre a vaga, a URL do seu repositório! 

A partir do arquivo de **entrada.txt**, onde a primeira linha representa as variáveis e a segunda representa os valores, desenvolva um algoritmo que execute operações de transferência bancária obedecendo os seguintes critérios: 

1. Toda transferência deverá ser feita entre um emissor e um receptor;
2. Operador e receptor iniciam a operação com um saldo de R$ 0,00;
3. As transferências deverão ser executadas de acordo com o seu tipo, sendo 3 os seus tipos: PIX, TED e DOC;
4. O limite de valor máximo permitido para uma transferência via PIX é de R$ 5 mil; 
5. Transferências via TED só são permitidas para valores acima de R$ 5 mil e até R$ 10 mil; 
6. Transferências via DOC só são permitidas para valores acima de R$ 10 mil; 
7. Não serão permitidas transferências para a mesma conta, mas um emissor pode transferir para ele mesmo se for uma conta diferente;
8. As entradas deverão estar sempre com todos os dados preenchidos.

Ao final da operação, uma mensagem deverá ser exibida: 

1. Se a transferência for bem sucedida, exibir mensagem de sucesso com o saldo do emissor e do receptor após a transferência, de acordo com o modelo:

**Sua transferência foi realizada com sucesso!<br> 
Saldo do emissor: R$ X,XX<br>
Saldo do receptor: R$X,XX**<br>

4. Se a transferência não for completada, exibir mensagem de erro explicando o motivo, vide exemplo: 

**Sua transferência não foi completada pois (escrever o motivo)**

Escolha, dentre as opoções de linguagens de programação abaixo, qual se sentir mais confortável em desenvolver o algoritmo e pense nos casos de teste descritos acima! 

1. Java
2. Python
3. Swift
4. Kotlin
5. Typescript 
6. C, C++/C#

Será observado o uso de boas práticas de programação, bem como orientaçao à objetos e se possível, aplicação de padrões de projeto. 

Boa sorte! 

