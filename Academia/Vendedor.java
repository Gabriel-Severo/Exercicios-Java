public class Vendedor extends Funcionario{
    private double totalVendas;
    private double comissao;

    public Vendedor(int id, String nome, double salario, double totalVendas, double comissao){
        super(id, nome, salario);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double getTotalVendas(){
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    @Override
    public double getSalario(){
        return super.getSalario() +  (totalVendas * (comissao / 100));
    }
}