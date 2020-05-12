import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Empresa {
    public static void main(String[] args){
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int opcao, qFuncionarios=0;
        do{
            System.out.println("1. Cadastrar Administrativo/a");
            System.out.println("2. Cadastrar Desenvolvedor/a");
            System.out.println("3. Cadastrar Vendedor/a");
            System.out.println("4. Imprimir Folha de Pagamento");
            System.out.println("5. Fechar o programa");
            System.out.println("Digite sua opcao");
            opcao = s.nextInt();
            s.nextLine();
            if(opcao == 1){
                System.out.println("Digite o nome do funcionário: ");
                String nome = s.nextLine();
                System.out.println("Digite o salário do funcionário: ");
                double salario = s.nextDouble();
                Administrativo a = new Administrativo(qFuncionarios, nome, salario);
                funcionarios.add(a);
                qFuncionarios++;
            }else if(opcao == 2){
                System.out.println("Digite o nome do funcionário: ");
                String nome = s.nextLine();
                System.out.println("Digite o salário do funcionário: ");
                double salario = s.nextDouble();
                System.out.println("Digite a bonificação do funcionário: ");
                double bonificacao = s.nextDouble();
                Desenvolvedor d = new Desenvolvedor(qFuncionarios, nome, salario, bonificacao);
                funcionarios.add(d);
                qFuncionarios++;
            }else if(opcao == 3){
                System.out.println("Digite o nome do funcionário: ");
                String nome = s.nextLine();
                System.out.println("Digite o salário do funcionário: ");
                double salario = s.nextDouble();
                System.out.println("Digite o total de vendas do funcionário: ");
                double totalVendas = s.nextDouble();
                System.out.println("Digite a comissão do funcionário: ");
                double comissao = s.nextDouble();
                Vendedor v = new Vendedor(qFuncionarios, nome, salario, totalVendas, comissao);
                funcionarios.add(v);
                qFuncionarios++;
            }else if(opcao == 4){
                FolhaPagamento.imprimir(funcionarios);
            }
        }while(opcao != 5);
    }
}