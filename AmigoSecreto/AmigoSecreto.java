package amigosecreto;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class AmigoSecreto {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        String sorteados = "";
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int opcao;
        do{
            System.out.println("=-=-=-= MENU =-=-=-=");
            System.out.println("1. Cadastrar nomes");
            System.out.println("2. Sortear nomes");
            opcao = s.nextInt();
            s.nextLine();
            if(opcao == 1){
                System.out.println("Digite o nome: ");
                nomes.add(s.nextLine());
                System.out.println("Nome cadastrado com sucesso");
            }else if(opcao == 2){                
                List<String> nomesRestante = new ArrayList<>();
                nomesRestante.addAll(nomes);
                for(String nome: nomes){
                    int numero;
                    do{
                        numero = r.nextInt(nomesRestante.size());
                    }while(nomes.get(numero).equals(nome));
                    sorteados += nome + " sorteou: " + nomesRestante.get(numero) + "\n";
                    nomesRestante.remove(numero);
                }
                System.out.println(sorteados);
                break;
                
            }
        }while(opcao != 0);
    }
    
}
