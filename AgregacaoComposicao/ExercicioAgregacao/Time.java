import java.util.List;
import java.util.ArrayList;

public class Time {
    private String sigla;
    private String nome;
    private String cidade;
    private String estado;
    private int anoFundacao;
    private List<Jogador> jogadores;

    public Time(String sigla, String nome, String cidade, String estado, int anoFundacao) {
        this.sigla = sigla;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.anoFundacao = anoFundacao;
        jogadores = new ArrayList<>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
}