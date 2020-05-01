public class Cliente extends Pessoa{
    private boolean vip;
    public Cliente(int id, String nome, char sexo){
        super(id, nome, sexo);
    }
    
    public void setVip(boolean vip){
        this.vip = vip;
    }
    
    public boolean getVip(){
        return vip;
    }
    
    public String toString(){
        return "Id: " + getId() + " Nome: " + getNome() + " Sexo: " + getSexo() + " Vip: " + vip;
    }
}
