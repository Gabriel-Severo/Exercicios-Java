public class ZeroValueException extends RuntimeException{
    public ZeroValueException(){
        super("O valor não pode ser 0");
    }
}