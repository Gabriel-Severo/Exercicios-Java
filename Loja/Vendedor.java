public class Vendedor extends Pessoa{
    private double salarioBase;
    private double comissao;
    public Vendedor(int id, String nome, char sexo, double comissao, double salarioBase){
        super(id, nome, sexo);
        this.comissao = comissao;
        this.salarioBase = salarioBase;
    }
    
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    
    public double getComissao(){
        return comissao;
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double calcularSalario(double totalVendas){
        return totalVendas * comissao / 100 + salarioBase;
    }
    
    public String toString(){
        return "Id: " + getId() + " Nome: " + getNome() + " Sexo: " + getSexo() + " Comissão: " + comissao + " Salário Base: " + salarioBase;
    }
    
    @Override
    public String exibirFicha(){
        return String.format("%5d %30s %c %.2f", getId(), getNome(), getSexo(), getComissao());
    }
}
