package playlist.musicas;
public class Musica implements Comparable<Musica>{
    private String titulo;
    private String artista;
    private int duracao;
    
    public Musica(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getArtitas(){
        return artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public String toString(){
        return "Título: " + titulo + " Artista: " + artista + " Duração: " + duracao;
    }
    
    public int compareTo(Musica m){
        return titulo.compareTo(m.titulo);
    }
}
