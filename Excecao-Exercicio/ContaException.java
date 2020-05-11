public class ContaException extends Exception{
    private double saldo;
    public ContaException(String message, double saldo){
        super(message + " " + saldo);
        this.saldo = saldo;
    }
}