import java.util.Scanner;
public class StringEx4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a frase gay");
        String frase = teclado.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
    
}
