import java.util.Scanner;

public class While_ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a Sua mãe");
        String mae = teclado.nextLine();
        System.out.println("Digite um numero gay");
        int num = teclado.nextInt();
        int cont = 0;
        while ( cont < num) {
            System.out.println(mae);
            cont++;
        }
    }
}
