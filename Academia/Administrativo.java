public class Administrativo extends Funcionario {

    public Administrativo(int id, String nome, double salario){
        super(id, nome, salario);
    }

    @Override
    public double getSalario(){
        return super.getSalario();
    }
}