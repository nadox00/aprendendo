import java.util.Scanner;
@SuppressWarnings("resource")
public class Exercicio13_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nome = teclado.nextLine();

        for ( int i = 0; i < nome.length(); i ++) {
            System.out.println(nome.charAt(i));
        }
    }
    
}
// Fiz tudo olhando pro chatgpt.