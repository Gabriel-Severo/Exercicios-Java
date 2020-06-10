import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Collections;
public class Data {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("=-Inserindo uma pessoa-=");
            System.out.print("Digite o nome da pessoa: ");
            String nome = s.nextLine();
            System.out.print("Digite o sexo (M/F): ");
            char sexo = s.nextLine().toLowerCase().charAt(0);
            
            System.out.print("Digite o dia: ");
            int dia = s.nextInt();
            System.out.print("Digite o mês: ");
            int mes = s.nextInt();
            System.out.print("Digite o ano: ");
            int ano = s.nextInt();
            
            System.out.print("Digite a hora: ");
            int hora = s.nextInt();
            System.out.print("Digite o minuto: ");
            int minuto = s.nextInt();
            LocalDateTime nascimento = LocalDateTime.of(ano, mes, dia, hora, minuto);
            Pessoa p = new Pessoa(nome, sexo, nascimento);
            pessoas.add(p);
            s.nextLine();
            System.out.println("Inserir mais uma pessoa (S/N): ");
            char opcao = s.nextLine().toLowerCase().charAt(0);
            if(opcao == 'n')
                break;
        }
        Collections.sort(pessoas);
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa);
        }
    }
    
}
