import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("=-=-=-=-=-= MENU =-=-=-=-=-=");
            System.out.println("1. Cadastrar médico");
            System.out.println("2. Cadastrar paciente");
            System.out.println("3. Listar somente médicos");
            System.out.println("4. Listar somente pacientes");
            System.out.println("5. Listar todas as fichas");
            System.out.println("6. Sair");
            System.out.print("Digite sua opçao: ");
            opcao = s.nextInt();
            s.nextLine();
            if(opcao == 1){
                System.out.print("Digite o nome do médico(a): ");
                String nome = s.nextLine();
                System.out.print("Digite o sexo do médico(a) (M/F): ");
                char sexo = s.next().charAt(0);
                s.nextLine();
                System.out.print("Digite o crm do médico(a): ");
                String crm = s.nextLine();
                System.out.print("Digite a especialidade do médico(a): ");
                String especialidade = s.nextLine();
                Medico medico = new Medico(nome, sexo, crm, especialidade);
                System.out.print("Digite o telefone do médico(a): ");
                String telefone = s.nextLine();
                System.out.print("Digite o email do médico(a): ");
                String email = s.nextLine();
                medico.setContato(new Contato(telefone, email));
                pessoas.add(medico);
            }else if(opcao == 2){
                System.out.print("Digite o nome do(a) paciente: ");
                String nome = s.nextLine();
                System.out.print("Digite o sexo do(a) paciente (M/F):");
                char sexo = s.next().charAt(0);
                System.out.print("Digite a altura do(a) paciente: ");
                double altura = s.nextDouble();
                System.out.print("Digite o peso do(a) paciente: ");
                double peso = s.nextDouble();
                Paciente paciente = new Paciente(nome, sexo, altura, peso);
                System.out.print("Digite a naturalidade do(a) paciente: ");
                s.nextLine();
                String naturalidade = s.nextLine();
                paciente.setNaturalidade(naturalidade);
                System.out.print("Digite o telefone do(a) paciente");
                String telefone = s.nextLine();
                System.out.print("Digite o email do(a) paciente (Deixe em branco caso não tenha): ");
                String email = s.nextLine();
                paciente.setContato(new Contato(telefone, email));
                pessoas.add(paciente);
            }else if(opcao == 3){
                for(Pessoa pessoa: pessoas){
                    if(pessoa instanceof Medico){
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        pessoa.imprimirFicha();
                    }
                }
            }else if(opcao == 4){
                for(Pessoa pessoa: pessoas){
                    if(pessoa instanceof Paciente){
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        pessoa.imprimirFicha();
                    }
                }
            }else if(opcao == 5){
                for(Pessoa pessoa: pessoas){
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    pessoa.imprimirFicha();
                }
            }
        }while(opcao != 6);
    }
    
}
