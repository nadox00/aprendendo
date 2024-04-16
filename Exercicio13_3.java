import java.util.Scanner;

public class Exercicio13_3 {
    
    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner teclado = new Scanner(System.in);
       int idade = 0;
       for (int i = 1; i <= 5; i++) {
        System.out.println("Quais são as idades ? ");
        idade += teclado.nextInt();
    }
    System.out.println("A media gay é " +idade /5 );
    }
}