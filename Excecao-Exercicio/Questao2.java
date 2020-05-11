import java.util.InputMismatchException;
import java.util.Scanner;
public class Questao2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        while(true){
            int x, y;
            double r;
            while(true){
                System.out.println("Informe o primeiro valor: ");
                try{
                    x = teclado.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("O valor só pode ser inteiro");
                }
                teclado.next();
            }
            while(true){
                System.out.println("Informe o segundo valor: ");
                try{
                    y = teclado.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("O valor só pode ser inteiro");
                }
                teclado.next();
            }
            try{
                r = (x / y);
                System.out.println("O resultado da divisão é " + r);
                break;
            }catch(ArithmeticException e){
                System.out.println("Não é possível dividir um número por zero");
            }
        }
    }
}