package exerciciosarquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class LerNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = s.nextLine();
        String filename = nome+".txt";
        double media = 0;
        List<Double> notas = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine();
            while(line != null){
                notas.add(Double.parseDouble(line));
                line = in.readLine();
            }
            for(int i = 0; i < notas.size(); i++){
                System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
                media += notas.get(i);
            }
            System.out.println("A média de " + nome + " é " + media / notas.size());
            in.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Aluno não encontrado");
        } catch (IOException ex) {
            Logger.getLogger(LerNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
