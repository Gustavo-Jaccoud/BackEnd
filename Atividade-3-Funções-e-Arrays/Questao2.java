import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero para calcular a raiz quadrada");
        double numero = scanner.nextDouble();

        double raiz = Math.sqrt(numero);
        System.out.println("A raiz quadrada do numero " + numero + " = " + raiz);
        scanner.close();
    }
}