import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um numero de 1 a 7 que representará o dia da semana");
    int dia = teclado.nextInt();
    
    switch (dia) {
        case 1:
        System.out.println("Domingo");
        break;
        case 2:
        System.out.println("Segunda");
        break;
        case 3:
        System.out.println("Terça");
        break;
        case 4:
        System.out.println("Quarta");
        break;
        case 5:
        System.out.println("Quinta");
        break;
        case 6:
        System.out.println("Sexata");
        break;
        case 7:
        System.out.println("Sabado");
        break;
    }
    }
}
// easy.