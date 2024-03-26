import java.util.Scanner;

public class Switch_Case {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Numero 1,2 ou 3");

        int numero = teclado.nextInt();
        switch (numero) {
            case 0:
            System.out.println("O valor da var numero é Zero");
            break;
            case 1:
            System.out.println("O valor da var numero é Um");
            break;
            case 2:
            System.out.println("O valor da var numero é Dois");
        default:
        System.out.println("O valor da var numero é diferente de 0,1 ou 2");
        break;
    }
}
}
// Exercicio de indrotução de como funciona o Switch Case.
// Fiz umas modificações mas deu um bug, vou procurar como corrig-lo dps.