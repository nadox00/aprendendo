import java.util.Scanner;

public class Exercicio13_5H {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = teclado.nextInt();
        int mult = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.println("Tabuada "+num * mult++);
    }
}
}