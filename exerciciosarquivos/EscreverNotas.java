package exerciciosarquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscreverNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = s.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = s.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = s.nextDouble();
        System.out.print("Digita a quarta nota: ");
        double nota4 = s.nextDouble();
        
        try {
            File f = new File(nome+".txt");
            FileWriter fr = new FileWriter(f);
            PrintWriter out = new PrintWriter(fr);
            out.println(nota1);
            out.println(nota2);
            out.println(nota3);
            out.println(nota4);
            out.close();
            fr.close();
        }catch(IOException e){
            System.out.println("Erro ao escrever o arquivo o arquivo");
        }
    }
}
