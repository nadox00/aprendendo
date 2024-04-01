import java.util.Scanner;

public class Exercicio13_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        
        int soma = 0;
        

        for (; ;) {
            int numero = teclado.nextInt();

            if ( numero < 0) {
                break;
            }
            
            soma += numero;
    }
    System.out.println("A soma dos numeros digitados é " +soma);
}
}
// outro que fiz olhando direto do chatgpt.