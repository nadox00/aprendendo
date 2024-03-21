import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings ("resource")
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero1 = teclado.nextInt();

        if ( numero1 % 2 == 0 ) {
        System.out.println("O numero é par");
        }   
        else {
        System.out.println("O numero é impar");

        }
    } 
}
