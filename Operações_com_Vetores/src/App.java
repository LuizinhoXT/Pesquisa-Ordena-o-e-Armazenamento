package Operações_com_Vetores.src;
// implemente um programa que receba 10 valores inteiros 
// após isso, deve-se exibir a soma dos valores, a média o maior valor e o menor valor.

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vet = new int[10];

        for (int i = 0; i<= (vet.length - 1) ; i++){
            vet[i] = 1;
        }

        vet[4] = 0;
        vet[3] = 0;
        vet[8] = 0;

        System.out.println("soma dos valores do vetor é " + soma(vet));

        System.out.println("quantidade de valores no vetor " + contarValores(vet));

        System.out.println("media dos valores do vetor é " + media(vet));

        System.out.println("maior valor " + maiorValor(vet));

    }


    public static int soma(int[] vetor){

        int resultado = 0;

        for (int i = 0; i<= (vetor.length - 1); i++){
            resultado = resultado + vetor[i];
        }

        return resultado;
        
    }

    public static float media(int[] vetor){

        int media = (soma(vetor) / contarValores(vetor));

        return media;

    }

    public static int contarValores(int[] vetor){
        int cont = 0;
        for (int i = 0; i<= (vetor.length - 1); i++){          
            if(vetor[i] > 0){
                cont++;
            }
        }

        return cont;
    }

    public static int maiorValor(int[] vetor){ 
        
        for (int i = 0; i<= (vetor.length - 1); i++){ 
            int valor = vetor[i];
            for(int j = 0; i<(vetor.length - 1);j++){
                if(valor>vetor[j]){
                    return valor;
                }
            }
        }

        return -1;
    }
}
