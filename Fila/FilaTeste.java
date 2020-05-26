import java.util.Scanner;
public class FilaTeste {

    public static <E> E convertObject(Object object){
        return (E) object;
    }
    public static <E> void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao, tipo=0;
        Fila<E> f = new Fila<>();
        do{
            System.out.println("=-=-=-=-=-= MENU =-=-=-=-=-=");
            System.out.println("0 – Escolher o tipo de fila (Double, Integer ou Character)");
            System.out.println("1 – Criar fila");
            System.out.println("2 – Enfileirar elemento");
            System.out.println("3 – Desenfileirar");
            System.out.println("4 – Imprimir fila");
            System.out.println("5 – Sair");
            System.out.print("Digite sua opção: ");
            opcao = s.nextInt();
            s.nextLine();
            if(opcao == 0) {
                System.out.println("Qual o tipo da fila a ser criado ?");
                System.out.println("1. Double\n2. Integer\n3. Character");
                tipo = s.nextInt();
                if(tipo != 1 && tipo != 2 && tipo != 3) {
                    System.out.println("Impossível criar um vetor desse tipo");
                }
            }else if(opcao == 1) {
                System.out.println("Digite o tamanho do vetor.");
                int tamanho = s.nextInt();
                f = new Fila<>(tamanho);
            }else if(opcao == 2) {
                System.out.println("Valor a ser enfileirado");
                try {
                    if(tipo == 1)
                        f.enfileirar(convertObject(s.nextDouble()));
                    else if(tipo == 2)
                        f.enfileirar(convertObject(s.nextInt()));
                    else if(tipo == 3)
                        f.enfileirar(convertObject(s.next().charAt(0)));
                    else
                        System.out.println("O tipo da fila escolhido e inválido");
                }catch(Exception e){
                    System.err.println(e);
                }
            }else if(opcao == 3) {
                try {
                    System.out.println(f.desenfileirar());                    
                }catch(Exception e) {
                    System.err.println(e);
                }
            }else if(opcao == 4) {
                f.mostrarFila();
            }
        }while(opcao != 5);
    }
}