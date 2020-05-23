import java.util.Date;
public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("111111", "Fernando");
        Cliente c2 = new Cliente("222222", "Aline");

        Automovel a1 = new Automovel("ABC1111", "Gol 1.6");
        Automovel a2 = new Automovel("ZZZ9999", "Onix 1.4");

        ContratoLocacao cl = new ContratoLocacao(100, new Date(), 180);
        cl.setCliente(c1);
        cl.setAutomovel(a2);

        System.out.printf("%d %td/%<tm/%<tY %s %s\n", 
                            cl.getId(), 
                            cl.getData(), 
                            cl.getCliente().getNome(),
                            cl.getAutomovel().getModelo()
                            );
    }
}