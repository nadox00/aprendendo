import java.util.Scanner;

public class Exercicio13_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int contador = 0;

        for (int i = 1; i <= 5  ; i++) {
            System.out.println("Digite um numero");
            num = teclado.nextInt();
            
            if (num >= 0 && num < 50) {
                contador++;
        }
    }
    System.out.println("Há "+contador +" numeros entre 0 e 50");
}
}