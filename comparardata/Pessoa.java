import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private char sexo;
    private LocalDateTime nascimento;

    public Pessoa(String nome, char sexo, LocalDateTime nascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }
    
    @Override
    public String toString(){
        Period comparacao = Period.between(nascimento.toLocalDate(), LocalDate.now());
        return  nome + " " + comparacao.getYears() + " anos\n" +
                (sexo == 'm' ? "Masculino\n" : "Feminino\n") +
                nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n";
    }
    
    @Override
    public int compareTo(Pessoa pessoa){
        if(nascimento.isAfter(pessoa.nascimento)){
            return 1;
        }
        if(nascimento.isBefore(pessoa.nascimento)){
            return -1;
        }
        return 0;
    }
    
    
}
