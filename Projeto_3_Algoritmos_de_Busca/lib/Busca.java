package Projeto_3_Algoritmos_de_Busca.lib;

// A busca binária começa analisando o elemento do meio da lista/vetor.
// se a chave de busca for igual ao elemento do meio, então, retornamos o elemento.
// se não, iremos ignorar um dos lados e realizar a busca 
// para tal, faz: se chave de busca for maior que elemento do meio, então ignoramos o lado esquerdo do vetor e trabalhamos só com o direito 
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
