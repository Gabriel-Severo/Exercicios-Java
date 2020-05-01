import java.util.Scanner;
public class Rh {
    public static void main(String[] args) {
        Cliente clientes[] = new Cliente[100];
        Vendedor vendedores[] = new Vendedor[100];
        int qClientes = 0, qVendedores = 0, opcao;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1. Cadastrar novo vendedor\n" +
                               "2. Cadastrar novo cliente\n" +
                               "3. Exibir lista de vendedores\n" +
                               "4. Exibir lista de clientes\n" +
                               "5. Fechar o programa");
            System.out.println("Digite sua opção: ");
            opcao = s.nextInt();
            s.nextLine();//buffer
            if(opcao == 1){
                if(qVendedores == 100){
                    System.out.println("Não é possível cadastrar novos vendedores");
                }else{
                    System.out.println("Digite o nome: ");
                    String nome = s.nextLine();
                    System.out.println("Digite o sexo(M ou F): ");
                    char sexo = s.next().charAt(0);
                    System.out.println("Digite a comissão: ");
                    double comissao = s.nextDouble();
                    System.out.println("Digite o salário base: ");
                    double salarioBase = s.nextDouble();
                    Vendedor v = new Vendedor(qVendedores, nome, sexo, comissao, salarioBase);
                    vendedores[qVendedores] = v;
                    qVendedores++;
                }
            }else if (opcao == 2){
                if(qClientes == 100){
                    System.out.println("Não é possível cadastrar novos clientes");
                }else{
                    System.out.println("Digite o nome: ");
                    String nome = s.nextLine();
                    System.out.println("Digite o sexo(M ou F): ");
                    char sexo = s.next().charAt(0);
                    Cliente c = new Cliente(qClientes, nome, sexo);
                    clientes[qClientes] = c;
                    qClientes++;
                }
            }else if(opcao == 3){
                for(int i = 0; i < qVendedores; i++){
                    System.out.println(vendedores[i]);
                }
            }else if(opcao == 4){
                for(int i = 0; i < qClientes; i++){
                    System.out.println(clientes[i]);
                }
            }
        }while(opcao != 0);
    }
}
