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
        if(mesa == 0){
            throw new ZeroValueException();
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
        if(valor == 0){
            throw new ZeroValueException();
        }
        return valor;
    }

    public void setValor(double valor){
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
