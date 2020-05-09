package fabrica;
import java.util.Scanner;
public class Fabrica {
    public static void main(String[] args) {
        OvoPascoa ovos[] = new OvoPascoa[100];
        Scanner s = new Scanner(System.in);
        int cont = 0;
        while(true){
            System.out.println("===== MENU =====");
            System.out.println("1. Fabricar ovo de chocolate");
            System.out.println("2. Fechar menu");
            System.out.println("3. Listar ovos criados");
            int opcao = s.nextInt();
            s.nextLine();
            if (opcao == 1){
                ovos[cont] = new OvoPascoa();
                System.out.print("Digite o tipo do ovo(Use B para Branco e P para preto): ");
                ovos[cont].setTipoChocolate(s.next().charAt(0));
                System.out.print("Digite o peso do ovo em gramas: ");
                ovos[cont].setPeso(s.nextInt());
                System.out.print("Digite a quantidade de bombons: ");
                ovos[cont].setQtdeBombons(s.nextInt());
                System.out.print("Digite o preço: ");
                ovos[cont].setPreco(s.nextDouble());
                System.out.println("Ovo criado");
                cont++;
            }else if(opcao == 2){
                break;
            }else if(opcao == 3){
                System.out.println("=== Ovos fabricados ===");
                for(int i = 0; i < cont; i++){
                    System.out.println("Ovo " + (i+1));
                    System.out.println("Tipo de Chocolate: " + ovos[i].getTipoChocolate());
                    System.out.println("Peso: " + ovos[i].getPeso());
                    System.out.println("Quantidade de Bombons: " + ovos[i].getQtdeBombons());
                    System.out.println("Preco: " + ovos[i].getPreco());
                    System.out.println("");
                }
            }
        }
        
    }
    
}
