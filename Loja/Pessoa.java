public abstract class Pessoa {
    private int id;
    private String nome;
    private char sexo;
    public Pessoa(int id, String nome, char sexo){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public char getSexo(){
        return sexo;
    }
    
}
