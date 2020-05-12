public class Desenvolvedor extends Funcionario{
    private double bonificacao;

    public Desenvolvedor(int id, String nome, double salario, double bonificacao){
        super(id, nome, salario);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao(){
        return bonificacao;
    }

    public void setBonificacao(double bonificacao){
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalario(){
        return super.getSalario() + bonificacao;
    }
}