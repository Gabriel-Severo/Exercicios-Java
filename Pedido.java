public class Pedido implements Comparable<Pedido>{
    private int mesa;
    private String pedido;
    private double valor;
    
    public Pedido(int mesa, String pedido, double valor){
        this.mesa = mesa;
        this.pedido = pedido;
        this.valor = valor;
    }
    
    public int getMesa(){
        return mesa;
    }
    
    public String getPedido(){
        return pedido;
    }
    
    public double getValor(){
        return valor;
    }

    @Override
    public int compareTo(Pedido o) {
        if (this.mesa < o.mesa){
            return -1;
        }
        if (this.mesa > o.mesa){
            return 1;
        }
        return 0;
    }
    
}
