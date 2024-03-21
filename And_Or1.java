import java.util.Scanner;

public class And_Or1 {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        // esse "SuppressWarnings" Serve para ignorar avisos do sistema.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        int nota = teclado.nextInt();

        System.out.println("Digite a frequencia do aluno");
        int freq = teclado.nextInt();


        if ( nota >= 70 && freq >= 75) {
            System.out.println("Parabéns, você foi aprovado");

        } else {
            System.out.println("Desculpe, você foi reporvado");
        }

        
    }
}
