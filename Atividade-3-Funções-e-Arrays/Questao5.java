public class Questao5 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,10};
        System.out.println(somaVetor(vector,  vector.length-1));
    }

    public static int somaVetor(int[] vector, int index){
        if (index == 0) {
            return vector[0];
        }
        int soma = vector[index] + somaVetor(vector, index-1);
        return soma;
    }
    
}
