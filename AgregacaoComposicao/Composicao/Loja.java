import java.util.Date;

public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Camisa Jeans M", 96);
        Produto p2 = new Produto(2, "Camisa Polo Branca", 78);
        Produto p3 = new Produto(3, "Camiseta Verde M", 49);

        Pedido p = new Pedido(100, new Date());
        p.addItensPedido(new ItemPedido(p1, 1));
        p.addItensPedido(new ItemPedido(p3, 1));

        System.out.printf("%d %td/%<tm/%<tY\n",
            p.getNumero(),
            p.getData()
        );

        for (ItemPedido itemPedido : p.getItensPedidos()) {
            System.out.printf("%s %.2f %d\n", 
                itemPedido.getProduto().getNome(),
                itemPedido.getProduto().getPreco(),
                itemPedido.getQuantidade()
            );
        }
    }
}