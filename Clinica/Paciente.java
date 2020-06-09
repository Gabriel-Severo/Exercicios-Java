public class Paciente extends Pessoa {
    private double altura;
    private double peso;
    
    public Paciente(String nome, char sexo, double altura, double peso){
        super(nome, sexo);
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calcularIMC(double altura, double peso) {
        return peso / (altura * altura);
    }
    
    @Override
    public void imprimirFicha(){
        System.out.println((super.getSexo() == 'm' ? "Sr. " : "Sra. ") + super.getNome());
        System.out.println("Natural de: " + super.getNaturalidade());
        System.out.println("Fone: " + super.getContato().getTelefone() 
                            + " Email: " + super.getContato().getEmail());
        System.out.println("IMC: " + calcularIMC(altura, peso));
        
    }
}
