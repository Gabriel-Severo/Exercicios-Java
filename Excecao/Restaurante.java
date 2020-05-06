import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Restaurante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();
        while(true){
            System.out.println("====== MENU ======");
            System.out.println("1. Fazer um pedido");
            System.out.println("2. Total da conta por mesa (informar o número da mesa)");
            System.out.println("3. Mostrar todas as vendas");
            System.out.println("4. Mostrar todos os pedidos (ordenados por número da mesa)");
            System.out.println("5. Total de vendas");
            System.out.println("0. Finaliza o programa");
            System.out.print("Digite sua opção: ");
            int opcao = s.nextInt();
            System.out.println();
            if (opcao == 1){
                System.out.print("Digite a mesa: ");
                int mesa = s.nextInt();
                System.out.print("Digite o pedido: ");
                s.nextLine();//buffer
                String pedido = s.nextLine();
                System.out.print("Digite valor do pedido: ");
                double valor = s.nextDouble();
                try{
                    Pedido p = new Pedido(mesa, pedido, valor);
                    pedidos.add(p);
                }catch(InvalidNumberException e){
                    System.err.println("O número da mesa ou o valor do pedido não devem ser menores que 1");
                    continue;
                }
            }else if(opcao == 2){
                System.out.print("Digite a mesa: ");
                int mesa = s.nextInt();
                int valor = 0;
                for(Pedido pedido: pedidos){
                    if(pedido.getMesa() == mesa){
                        valor += pedido.getValor();
                    }
                }
                System.out.println("Mesa: " + mesa);
                System.out.println("Total da conta: R$"+valor);
            }else if(opcao == 3){
                for(Pedido pedido: pedidos){
                    System.out.println("=-=-=-=-=-=-=");
                    System.out.println("Mesa: " + pedido.getMesa());
                    System.out.println("Pedido: " + pedido.getPedido());
                    System.out.println("Valor: R$" + pedido.getValor());
                }
            }else if(opcao == 4){
                List<Pedido> p = new ArrayList<>();
                p.addAll(pedidos);
                Collections.sort(p);
                for (Pedido pedido: p){
                    System.out.println("=-=-=-=-=-=-=");
                    System.out.println("Mesa: " + pedido.getMesa());
                    System.out.println("Pedido: " + pedido.getPedido());
                    System.out.println("Valor: R$" + pedido.getValor());
                }
            }else if(opcao == 5){
                double totalVendas = 0;
                for (Pedido pedido: pedidos){
                    totalVendas += pedido.getValor();
                }
                System.out.println("Total de Vendas: " + totalVendas + "");
            }else if(opcao == 0){
                break;
            }else{
                System.out.println("Opção inválida");
            }
            System.out.println();
        }
    }
}
