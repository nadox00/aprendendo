import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o simbolo de operacão");
        String simbolo = teclado.nextLine();
        System.out.println("Digite outro numero");
        int numero2 = teclado.nextInt();
        int resultadomais = numero1 + numero2;
        int resultadomenos = numero1 - numero2;
        int resultadovezes = numero1 * numero2;
        int resultadodividido = numero1 / numero2;

        switch (simbolo) {
            case "+":
            System.out.println("Resultado " +resultadomais);
            break;
            case "-":
            System.out.println("Resultado " +resultadomenos);
            break;
            case "*":
            System.out.println("Resultado " +resultadovezes);
            break;
            case "/":
            System.out.println("Resultado " +resultadodividido);
            break;
        }
    }
    
}
