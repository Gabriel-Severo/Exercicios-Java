public class Jogador {
    private String nome;
    private int numeroDaCamisa;

    public Jogador(String nome, int numeroDaCamisa) {
        this.nome = nome;
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(int numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }
}