public class PilhaTeste {
    public static void main(String[] args) {
        Pilha<Integer> inteiro = new Pilha<>(10);
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < numeros.length; i++){
            try{
                inteiro.empilhar(numeros[i]);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.println(inteiro.desempilhar());
        }
    }
}