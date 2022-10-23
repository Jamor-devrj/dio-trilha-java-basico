import java.util.Scanner;

public class SomaMultipos {
    public static void main(String[] args) {
        int A, N;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        int soma = 0;

        for (int i = 1; i <= N/A; i++){
            soma = A++;
        }

        System.out.println(soma);

        input.close();
    }
}