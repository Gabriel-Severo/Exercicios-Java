public class Banco {
    public static void main(String[] args) throws ContaException {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        try{
            minhaConta.saca(100);
        }catch(ContaException e){
            System.out.println("O valor a ser sacado deve ser menor que o valor do saldo");
        }
    }
}