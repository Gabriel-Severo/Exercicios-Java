public class Conta {
    private double saldo;
    private double limite;
    public void deposita(double saldo){
        this.saldo += saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public void saca(double valor) throws ContaException{
        if (valor > saldo){
            throw new ContaException("O valor informado é maior do que o saldo", saldo);
        }
        this.saldo -= valor;
    }
}