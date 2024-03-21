import java.util.Scanner;

public class Exercicio09H {
    public static void main(String[] args) {
        @SuppressWarnings ("resource")
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira o dia da semana");
        String dia = teclado.nextLine();        
        teclado.nextLine();
        System.out.println("Qual sua idade ?");
        int idade = teclado.nextInt();
        System.out.println("Possui carteirinha de meia entrada ?");
        String sORn = teclado.nextLine();

        String[] diaSemana = {
            "Segunda", "Terça", "Quarta", "Quinta",
            "Sexta", "Sabado", "Domingo"
        };
        
        int valorDoIngresso = 0;


    }
    
}
