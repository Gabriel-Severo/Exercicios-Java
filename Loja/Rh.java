import java.util.Scanner;
public class Rh {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[10];
        int qPessoas = 0, opcao;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println((qPessoas < 10 ? "1. Cadastrar novo vendedor\n" +
                               "2. Cadastrar novo cliente\n": "") +
                               "3. Exibir lista de vendedores\n" +
                               "4. Exibir lista de clientes\n" +
                               "5. Exibir todos\n" +
                               "6. Fechar o programa");
            System.out.println("Digite sua opção: ");
            opcao = s.nextInt();
            s.nextLine();//buffer
            if(opcao == 1){
                if(qPessoas == 10){
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
                    Vendedor v = new Vendedor(qPessoas, nome, sexo, comissao, salarioBase);
                    pessoas[qPessoas] = v;
                    qPessoas++;
                }
            }else if (opcao == 2){
                if(qPessoas == 10){
                    System.out.println("Não é possível cadastrar novos clientes");
                }else{
                    System.out.println("Digite o nome: ");
                    String nome = s.nextLine();
                    System.out.println("Digite o sexo(M ou F): ");
                    char sexo = s.next().charAt(0);
                    System.out.println("Essa pessoa é vip(S/N)");
                    boolean vip = s.next().charAt(0) == 'S' ? true : false;
                    Cliente c = new Cliente(qPessoas, nome, sexo);
                    pessoas[qPessoas] = c;
                    ((Cliente) pessoas[qPessoas]).setVip(vip);
                    qPessoas++;
                }
            }else if(opcao == 3){
                for(int i = 0; i < qPessoas; i++)
                    if (pessoas[i] instanceof Vendedor)
                        System.out.println(pessoas[i].exibirFicha());
            }else if(opcao == 4){
                for(int i = 0; i < qPessoas; i++)
                    if(pessoas[i] instanceof Cliente)
                        System.out.println(pessoas[i].exibirFicha());
            }else if(opcao == 5){
                for(int i = 0; i < qPessoas; i++)
                    System.out.println(pessoas[i].exibirFicha());
            }
        }while(opcao != 0);
    }
}
