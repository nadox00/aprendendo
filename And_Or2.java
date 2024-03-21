import java.util.Scanner;

public class And_Or2 {
    
    public static void main(String[] args) {
        @SuppressWarnings ("resource")
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        int nota = teclado.nextInt();

        System.out.println("Digite a frequencia do aluno");
        int freq = teclado.nextInt();

        System.out.println("Digite o comportamento do aluno");
        int comp = teclado.nextInt();


        if ( nota >= 70 || freq >= 75 && comp >= 30 ) {
            System.out.println("Parabéns, você foi aprovado");
// Eu posso misturar os operadores no meio do if/else 
// Ex: && e || na mesma linha de codigo.

        } else {
            System.out.println("Desculpe, você foi reporvado");
        }

        
    }
}