
import Operações_com_Vetores.src.Operacoes;

public class App {
    public static void main(String[] args) throws Exception {
        Operacoes o = new Operacoes();
        
        AlgoritmosDeOrdenacao adr = new AlgoritmosDeOrdenacao();

        int v[] = new int[15];
        int v_aux[] = new int[v.length];
        o.inserir(v, true);
        o.listar(v, true);
        adr.mergeSort(v,v_aux,0, v.length-1);
        System.out.println("");
        o.listar(v, true);
        
    
    }
    
}
