import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j <matriz[0].length; j++){
                    System.out.println("Insira o valor para celula ("+ (int)(i+1) +" , " + (int)(j+1) + ")" );
                    matriz[i][j] = scanner.nextInt();
                }
            }

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[0].length; j++){
                    matriz[i][j] = matriz[i][j]*5;
                }
            }
            System.out.println("Matriz multiplicada por 5" );

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            scanner.close();


    }
    
}
