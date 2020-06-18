package juntaarquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JuntaArquivos {
    public static void main(String[] args) {
        try {
            FileInputStream file1 = new FileInputStream("FileDemonstration(parte1).java");
            FileInputStream file2 = new FileInputStream("FileDemonstration(parte2).java");
            FileOutputStream file3 = new FileOutputStream("FileDemonstration1.java");
            int c;
            while((c = file1.read()) != -1){
                file3.write(c);
            }
            while((c = file2.read()) != -1){
                file3.write(c);
            }
            file1.close();
            file2.close();
            file3.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JuntaArquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JuntaArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
