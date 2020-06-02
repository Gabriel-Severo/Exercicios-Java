public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    private Contato contato;
    
    public Medico(String nome, char sexo, String crm, String especialidade){
        super(nome, sexo);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }    
    
    
    @Override
    public void imprimirFicha() {
        System.out.println("Nome: " + (super.getSexo() == 'M' ? "Dr. " : "Dra. ") + super.getNome());
        System.out.println("Especialidade: " + especialidade + " CRM: " + crm);
        System.out.println("Fone: " + super.getContato().getTelefone() 
                            + " Email: " + super.getContato().getEmail());
    }
}
