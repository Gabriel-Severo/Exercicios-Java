import java.util.Arrays;
public class Generics {
    public static <E> void ordenaArray(E[] array){
        Arrays.sort(array);
    }
    public static <E> void imprimirArray(E[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        Integer[] array = {3, 2, 5, 4, 7, 9, 3};
        String[] array2 = {"tis", "test"};
        ordenaArray(array);
        ordenaArray(array2);
        imprimirArray(array);
        imprimirArray(array2);
    }
}