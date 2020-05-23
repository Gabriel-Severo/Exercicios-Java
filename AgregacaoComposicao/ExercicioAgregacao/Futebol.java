public class Futebol {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Jogador 1", 10);
        Jogador j2 = new Jogador("Jogador 2", 15);
        Jogador j3 = new Jogador("Jogador 3", 4);

        Time t1 = new Time("JP", "Jogadores Profissionais", "Campo Grande", "Mato Grosso do Sul", 1990);
        t1.addJogador(j1);
        t1.addJogador(j2);
        t1.addJogador(j3);
        System.out.printf("Singla | Nome                    | Cidade       | Estado               | Ano De Fundacao\n");
        System.out.printf("%-6s | %-20s | %-12s | %-20s | %d\n",
                    t1.getSigla(),
                    t1.getNome(),
                    t1.getCidade(),
                    t1.getEstado(),
                    t1.getAnoFundacao());
        System.out.println();
        System.out.printf("Nome                 | Camisa\n");
        for (Jogador jogador : t1.getJogadores())
            System.out.printf("%-20s | %d\n", jogador.getNome(), jogador.getNumeroDaCamisa());

    }
}