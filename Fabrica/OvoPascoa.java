package fabrica;
public class OvoPascoa {
    private char tipoChocolate;
    private int peso;
    private int qtdeBombons;
    private double preco;
    
    public void setTipoChocolate(char tipo){
        tipoChocolate = tipo;
    }
    
    public char getTipoChocolate(){
        return tipoChocolate;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setQtdeBombons(int qtde){
        qtdeBombons = qtde;
    }
    
    public int getQtdeBombons(){
        return qtdeBombons;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void reajustarPreco(int percentual){
        preco = preco + percentual / 100;
    }
    
}
