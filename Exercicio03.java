import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano");
        int ano = teclado.nextInt();


        if ( ano % 4 == 0) {
        System.out.println("O ano é bixesto");
    }
    else {
        System.out.println("O ano não é bixesto");
    }
}

}

// acredito que só utilizando o %4 eu consiga saber se o ano é bixesto ou não. 