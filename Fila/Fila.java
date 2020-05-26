import java.util.EmptyStackException;

public class Fila <E> {
    private int fim;
    private E[] elementos;

    public Fila(){
        this(10);
    }

    public Fila(int tamanho) {
        fim = 0;
        tamanho = tamanho > 0 ? tamanho : 10;
        elementos = (E[]) new Object[tamanho];
    }

    public void enfileirar(E valor) throws Exception{
        if(fim == elementos.length){
            throw new Exception("A pilha está cheia");
        }
        elementos[fim++] = valor;
    }

    public E desenfileirar() {
        if (fim == 0){
            throw new EmptyStackException();
        }
        E valor = elementos[0];
        for(int i = 0; i < elementos.length-1; i++){
            elementos[i] = elementos[i+1];
            if(elementos[i+1] == null) {
                break;
            }
            if(i == elementos.length-2){
                elementos[i+1] = null;
            }
        }
        fim--;
        return valor;
    }

    public void mostrarFila() {
        for(int i = 0; i < elementos.length && elementos[i] != null; i++){
            System.out.println(elementos[i]);
        }
    }
}