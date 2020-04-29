package notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Notas {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("=-=-=-= MENU =-=-=-=");
            System.out.println("1. Cadastrar nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Mostrar maior nota");
            System.out.println("4. Mostrar menor nota");
            System.out.println("0. Sair do programa");
            opcao = s.nextInt();
            if(opcao == 1){
                System.out.print("Digite a nota: ");
                notas.add(s.nextInt());
                System.out.println("Nota cadastrada com sucesso.");
            }else if(opcao == 2){
                notas.forEach((nota) -> {System.out.println(nota);});
            }else if(opcao == 3){
                List<Integer> copia = new ArrayList<>();
                copia.addAll(notas);
                Collections.sort(copia);
                System.out.println("A maior nota foi " + copia.get(copia.size() -1));
            }else if(opcao == 4){
                List<Integer> copia = new ArrayList<>();
                copia.addAll(notas);
                Collections.sort(copia);
                System.out.println("A menor nota foi " + copia.get(0));
            }
        }while(opcao != 0);
        
    }
    
}
