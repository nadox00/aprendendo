import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        double numero1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Digite o simbolo de operacão");
        String simbolo = teclado.nextLine();
        System.out.println("Digite outro numero");
        double numero2 = teclado.nextDouble();

        switch (simbolo) {
            case "+":
            System.out.println("Resultado " + (numero1+numero2));
            break;
            case "-":
            System.out.println("Resultado " + (numero1-numero2));
            break;
            case "*":
            System.out.println("Resultado " + (numero1*numero2));
            break;
            case "/":
            if (numero2 == 0) {
                System.out.println("Não é possivel dividir por 0");
            } else {
            System.out.println("Resultado " + (numero1/numero2));
            break;
        }
    }
}
}
