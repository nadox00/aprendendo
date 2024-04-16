import java.util.Scanner;

public class Exercicio13_2 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome de usuario");
        String user = teclado.nextLine();
        System.out.println("Digite Um numero");
        int num = teclado.nextInt();

        for ( int i = 1; i <= num; i++) {
            System.out.println("Olá " +user);
        
    }
}
}
