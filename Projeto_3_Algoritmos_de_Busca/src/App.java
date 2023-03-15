import Projeto_3_Algoritmos_de_Busca.lib.Busca;
public class App{
    public static void main(String[] args) throws Exception {
        Busca b = new Busca();
        int a = 10;
        int[] vetor = new int[a];

       for(int i =0;i<= vetor.length -1 ; i++){
            vetor[i] = i;
        }
        
        
        System.out.println("o valor está no indice =" + b.binária(vetor, 0));
        
        System.out.println("o valor está no indice =" + b.binária(vetor, 1));
        System.out.println("o valor está no indice =" + b.binária(vetor, 2));
        System.out.println("o valor está no indice =" + b.binária(vetor, 3));
        System.out.println("o valor está no indice =" + b.binária(vetor, 4));
        System.out.println("o valor está no indice =" + b.binária(vetor, 5));
        System.out.println("o valor está no indice =" + b.binária(vetor, 6));
        System.out.println("o valor está no indice =" + b.binária(vetor, 7));
        System.out.println("o valor está no indice =" + b.binária(vetor, 8));
        System.out.println("o valor está no indice =" + b.binária(vetor, 9));

        System.out.println("o valor está no indice =" + b.binária(vetor, 12));


    }
}
