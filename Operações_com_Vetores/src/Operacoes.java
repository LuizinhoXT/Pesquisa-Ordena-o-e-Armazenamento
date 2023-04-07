package Operações_com_Vetores.src;
import java.util.Random;
public class Operacoes {
    Random r = new Random();

    public void listar(int[] vetor, Boolean print){
        if(print == true){
            for(int i = 0;i<=(vetor.length-1);i++){
                if(i == 0){

                    
                    System.out.print("{ " + vetor[i] + " , ");
    
                }else if(i > 0){
                    if(i == (vetor.length -1)){

                        System.out.print(vetor[i] + " ] ");
                        break;
        
                    }
                    System.out.print(vetor[i] + " , ");
    
                }
            }
                        
        }else{

            for(int i=0;i<=(vetor.length-1);i++){
                
               System.out.println(vetor[i]); 
            }
        }
    }

    public void inserir(int[] vetor, Boolean aleatorio){

        if(aleatorio == true){
            for(int i = 0; i<=(vetor.length -1);i++){
                vetor[i] = r.nextInt(vetor.length);
            }
        }else{
            for(int i = 0; i<=(vetor.length -1);i++){
                vetor[i] = i;
            }
        }

    }


    
}
