import java.util.Scanner;

public class Exercicio13_4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        
        int idade = 0;
        int maior = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Quais são as idades ? ");
            idade = teclado.nextInt();

            if (idade >= 18) {
                maior++;
            }
    }
    System.out.println("O numero de maiores são " +maior);
}
}
