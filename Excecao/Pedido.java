public class Pedido implements Comparable<Pedido>{
    private int mesa;
    private String pedido;
    private double valor;
    
    public Pedido(int mesa, String pedido, double valor){
        setMesa(mesa);
        setPedido(pedido);
        setValor(valor);
    }
    
    public void setMesa(int mesa){
        if(mesa < 1){
            throw new InvalidNumberException();
        }
        this.mesa = mesa;
    }
    
    public int getMesa(){
        return mesa;
    }

    public void setPedido(String pedido){
        this.pedido = pedido;
    }
    
    public String getPedido(){
        return pedido;
    }
    
    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        if(valor < 1){
            throw new InvalidNumberException();
        }
        this.valor = valor;
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
