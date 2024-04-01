import java.util.Scanner;

public class Exercicio13_9{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numeros pares");
        for (int i = 0; i <= 20; i +=2) {
        System.out.println(i);
        }
        System.out.println("Numeros pares");
        for (int i = 1; i <= 20; i +=2) {
            System.out.println(i);
        }
    }
}