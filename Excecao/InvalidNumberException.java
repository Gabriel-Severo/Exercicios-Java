public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(){
        super("O valor informado não deve ser menor que 1");
    }
}