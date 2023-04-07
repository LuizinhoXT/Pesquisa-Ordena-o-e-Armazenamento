package Algoritmos_de_Busca.lib;

// A busca binária começa analisando o elemento do meio da lista/vetor. Isso divide a lista em dois lado: um lado com todos os valores maiores que oelemtndo do meio e outro com todos os valores menores.
// se a chave de busca for igual ao elemento do meio, então, retornamos o elemento.
// se não, iremos verifiacr se o valor do meio é menor (ou maior) que a chave de busca. Se for verdadeiro, então iremos atualizar as variáveis que limitam o espaço de busca.
// iremos fazer comparações consecutivas dividindo um segmento em dois sub segmentos.
// por fim, isso irá reduzir drasticamente o espaço de busca e as iterações do Algoritmo
public class Busca {

    public int binária(int[] vetor, int chaveDeBusca){
        
        int indice = -1;

        int inicio = 0;
        int fim = (vetor.length - 1);
        
        
        while (inicio <= fim){
            int meio =((inicio + fim)/2);
            if(chaveDeBusca == vetor[meio]){
                indice = meio;
                break;
            }else if(chaveDeBusca > vetor[meio]){
                inicio = meio + 1;
                
            }else if(chaveDeBusca < vetor[meio]){
                fim = meio - 1;
                          
            }

        }

        return indice;
    }
    
}
