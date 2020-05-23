public class Equipe {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1, "João", 'M');
        Funcionario f2 = new Funcionario(2, "Maria", 'F');

        f1.setDataAdmissao(new Data(30, 12, 2018));
        f1.setDataNascimento(new Data(29, 2, 1980));
        f2.setDataAdmissao(new Data(2, 7, 2002));
        f2.setDataNascimento(new Data(7, 2, 1973));

        System.out.println("ID  | NOME              | SEXO | Data de Nascimento           | Data de Admissao");
        System.out.printf("%-3d | %-17s | %-4c | %-28s | %s\n",
                            f1.getId(),
                            f1.getNome(),
                            f1.getSexo(),
                            f1.getDataNascimento(),
                            f1.getDataAdmissao());
        System.out.printf("%-3d | %-17s | %-4c | %-28s | %s",
                            f2.getId(),
                            f2.getNome(),
                            f2.getSexo(),
                            f2.getDataNascimento(),
                            f2.getDataAdmissao());
    }
}