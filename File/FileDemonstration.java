import java.io.File;
import java.util.Scanner;

public class FileDemonstration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo ou diretório: ");
        analyzePath(input.nextLine());
        input.close();
    }

    public static void analyzePath(String path){
        File name = new File(path);
        if(name.exists()){
            System.out.println("Nome: " + name.getName());
            System.out.println(name.isFile() ? "é um arquivo" : "é um diretório");
            System.out.println("Tamanho: " + name.length());
            System.out.println("Diretório pai: " + name.getParent());
            if(name.isDirectory()){
                String[] directory = name.list();
                System.out.println("Conteúdo do diretório");
                for(String directoryName: directory){
                    System.out.println(directoryName);
                }
            }
        }else{
            System.out.println("Arquivo ou diretório inexistente ->" + path);
        }
    }
}