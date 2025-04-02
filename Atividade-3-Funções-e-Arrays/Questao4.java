import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite um número");
                int num1 = scanner.nextInt();

                System.out.println("Digite outro número");
                int num2 = scanner.nextInt();

                System.out.println("Digite outro número");
                int num3 = scanner.nextInt();
                
                scanner.close();

                int menor = num1;

                if (menor > num2){
                    menor = num2;
                }
                
                if (menor > num3){
                    menor = num3;
                }
                System.out.println("O menor valor dentre os três inseridos é: " + menor);
    }
    
}
