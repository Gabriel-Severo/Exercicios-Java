package playlist.musicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlaylistMusicas {
    public static void main(String[] args) {
        List<Musica> playlist = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("=-=-=-= MENU =-=-=-=");
            System.out.println("1. Cadastrar nova música");
            System.out.println("2. Listar músicas");
            System.out.println("3. Remover uma música");
            System.out.println("4. Ordena a playlist pelo título");
            System.out.println("Digite sua opção: ");
            opcao = s.nextInt();
            s.nextLine();
            if(opcao == 1){
                System.out.print("Digite o título da música: ");
                String titulo = s.nextLine();
                System.out.print("Digite o artista da música: ");
                String artista = s.nextLine();
                System.out.print("Digite a duração da música em segundos: ");
                int duracao = s.nextInt();
                Musica musica = new Musica(titulo, artista, duracao);
                playlist.add(musica);
            }else if(opcao == 2){
                for(Musica musica: playlist){
                    System.out.println(musica);
                }
            }else if(opcao == 3){
                System.out.print("Digite o nome da música para remove-la: ");
                String nome = s.nextLine();
                int i;
                for(i = 0; i < playlist.size(); i++){
                    if(playlist.get(i).getTitulo().equals(nome)){
                        break;
                    }
                }
                if(i != playlist.size()){
                    playlist.remove(i);
                    System.out.println("Mùsica removida com sucesso!");
                }else{
                    System.out.println("Essa música não existe");
                }
            }else if(opcao == 4){
                Collections.sort(playlist);
                System.out.println("Orneado com sucesso!");
            }
        }while(opcao != 0);
    }
    
}
