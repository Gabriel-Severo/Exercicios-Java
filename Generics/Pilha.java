import java.util.EmptyStackException;

public class Pilha <E> {
    private int tamanho;
    private int topo;
    private E[] elementos;

    public Pilha(){
        this(10);
    }
    public Pilha(int tamanho){
        this.tamanho = tamanho > 0 ? tamanho : 10;
        topo = 0;
        elementos = (E[]) new Object[tamanho];
    }

    public void empilhar(E valor) throws Exception{
        if(topo == elementos.length){
            throw new Exception(String.format("Pilha está cheia %s", valor));
        }
        elementos[topo++] = valor;
    }

    public E desempilhar(){
        if(topo == -1) {
            throw new EmptyStackException();
        }
        return elementos[--topo];
    }
}