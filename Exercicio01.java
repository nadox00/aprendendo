import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String nome1 = teclado.nextLine();
        System.out.println("Digite o nome da outra pessoa");
        String nome2 = teclado.nextLine();


        System.out.println("Digite o ano do nascimento da primeira pessoa");
        int nasc1 = teclado.nextInt();

        System.out.println("Digite o ano do nascimento da segunda pessoa");
        int nasc2 = teclado.nextInt();


        int idade1 = 2024 - nasc1;
        int idade2 = 2024 - nasc2;

        
        if ( idade1 < idade2 ) {
            System.out.println("A pessoa mais nova é"  +nome1);
        }

        else if ( idade1 == idade2 ) {
            System.out.println("Ambas pessoas possuem a mesma idade");
        }
        else {
            System.out.println("A pessoa mais nova é"  +nome2);

    // O nextInt depois de lido não permite que leia qualquer linha de codigo que possua nextLine.
        }
    }
}
