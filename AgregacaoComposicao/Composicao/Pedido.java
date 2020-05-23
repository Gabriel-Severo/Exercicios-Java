import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private Date data;
    private List<ItemPedido> itensPedidos;

    public Pedido(int numero, Date data) {
        this.numero = numero;
        this.data = data;
        itensPedidos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public List<ItemPedido> getItensPedidos(){
        return itensPedidos;
    }

    public void addItensPedido(ItemPedido itemPedido) {
        itensPedidos.add(itemPedido);
    }
}