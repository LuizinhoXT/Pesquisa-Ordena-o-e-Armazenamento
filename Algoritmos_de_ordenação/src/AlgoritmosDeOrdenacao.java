

public class AlgoritmosDeOrdenacao {
    
    public void bubbleSort(int[] vetor){
        int tamanho = vetor.length;
        
        for(int j = 0; j<=(tamanho-2);j++){
            for(int i = 0; i<= (tamanho-2); i++){
                if(vetor[i+1] < vetor[i]){
                    int aux = vetor[i+1];
                    vetor[i+1] = vetor[i];
                    vetor[i] = aux;
                    
                }
            }
        }
    }

    public void selectionSort(int[] vetor){
        int min_index = 0;
        while( min_index < vetor.length-1){
            
            for(int j = min_index+1; j<vetor.length;j++){
                if(vetor[j]<vetor[min_index]){
                    
                    trocar(vetor, j, min_index);
                }
            } 
            min_index++;
        }
        
        
    }

    public void insertionSort(int[] vetor){
        int atual = 1;
        int anterior = atual - 1;
        int aux = 0;
        while(atual < vetor.length-1){        
            aux = vetor[atual];
            anterior = atual - 1;

            while(anterior >= 0 && vetor[anterior] > aux){              
                vetor[anterior+1] = vetor[anterior];               
                anterior--;
            }
            
            vetor[anterior+1] = aux;
            atual++;

        }
    }

    public void mergeSort(int [] vetor, int[] aux, int inicio, int fim){

        if (inicio<fim){
            int meio = (inicio+fim)/2;

            mergeSort(vetor, aux, inicio, meio);
            mergeSort(vetor, aux, meio+1, fim);

            merge(vetor,aux,inicio,meio,fim);




        }

    }

    public void merge(int[] vetor, int [] aux, int inicio, int meio, int fim){

        for(int i = inicio; i<=fim;i++){
            aux[i] = vetor[i];
        }

        int esq = inicio, dir = meio+1;

        for(int i = inicio; i<=fim;i++){
           if(esq > meio){
                vetor[i] = aux[dir++];
           }else if( dir> fim){
                vetor[i] = aux[esq++];
           }else if( aux[esq]<aux[dir]){
                vetor[i] = aux[esq++];
                
            }else{
                vetor[i] = aux[dir++];
            }
        }
     
    }
   
    public void quickSort(int[] vetor, int esq, int dir){
        while(esq < dir){
            int j = separar(vetor,esq,dir);
            quickSort(vetor, esq, j-1);
            quickSort(vetor, j+1, dir);
        }
    }

    private int separar(int[] vetor, int esq, int dir) {

        int pivot = vetor[dir];
        int i = esq;
        for(int j = 0; j<=dir;j++){
            if(vetor[j] <= pivot){
                trocar(vetor, j, i);
                i++;
            }
        }
        trocar(vetor, dir,  i);
        return i;
    }

    private void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
    
   

    
    
}
