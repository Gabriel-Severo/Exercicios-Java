import java.util.List;
public class FolhaPagamento {
    public static void imprimir(List<Funcionario> array){
        System.out.println("Folha pagamento");
        System.err.println("ID  NOME       FUNÇÃO          SALARIO ");
        for(int i = 0; i < array.size(); i++){
            String funcao = "";
            if(array.get(i) instanceof Administrativo){
                funcao = "ADMINISTRADOR/A";
            }else if(array.get(i) instanceof Desenvolvedor){
                funcao = "DESENVOLVEDOR/A";
            }else{
                funcao = "VENDEDOR/A";
            }
            System.out.printf("%-3d %-10s %-15s %.2f" , array.get(i).getId(), array.get(i).getNome(), funcao, array.get(i).getSalario());
            System.out.println();
        }
    }
}