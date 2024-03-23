import java.util.Scanner;

public class Exercicio09H {
    public static void main(String[] args) {
        @SuppressWarnings ("resource")
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("|-------------------------|");
        System.out.println("    COMPRA DE INGRESSOS    ");
        System.out.println("|-------------------------|");

        System.out.println("Insira o dia da semana");
        String dia = teclado.nextLine();        

        System.out.println("Possui carteirinha de meia entrada ou é menor de 18 anos? ");
        String carteirinha = teclado.nextLine();

        double valor1 = 20;
        double valor2 = 16;
        double valor3 = 26;
        double valorDoIngresso;
        double valorDoIngressoComDesconto;

    if ( dia.equalsIgnoreCase("Segunda") || dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Quinta")) {
        valorDoIngresso = valor1;
        valorDoIngressoComDesconto = valor1 /2;
        double preçofinal = carteirinha.equals("Sim") ? valorDoIngressoComDesconto : valor1; 
        System.out.println("|---------------|");
        System.out.println("DADOS DO INGRESSO");
        System.out.println("|---------------|");
        System.out.println("Dia da semana: " +dia);
        System.out.println("Possui carteirinha ou é menor de 18 anos ? " +carteirinha);
        System.out.println("Preço Normal " +valorDoIngresso);
        System.out.println("Preço com desconto " +preçofinal);
    } else if ( dia.equals("Quarta")) {
        valorDoIngresso = valor2;
        valorDoIngressoComDesconto = valor2 /2;
        double preçofinal = carteirinha.equals("Sim") ? valorDoIngressoComDesconto : valor2; 
        System.out.println("|---------------|");
        System.out.println("DADOS DO INGRESSO");
        System.out.println("|---------------|");
        System.out.println("Dia da semana: " +dia);
        System.out.println("Possui carteirinha ou é menor de 18 anos ? " +carteirinha);
        System.out.println("Preço Normal " +valorDoIngresso);
        System.out.println("Preço com desconto " +preçofinal);
    } else if ( dia.equals("Sexta") || dia.equals("Sabado") || dia.equals("Domingo")) {
        valorDoIngresso = valor3;
        valorDoIngressoComDesconto = valor3 /2;
        double preçofinal = carteirinha.equals("Sim") ? valorDoIngressoComDesconto : valor3; 
        System.out.println("|---------------|");
        System.out.println("DADOS DO INGRESSO");
        System.out.println("|---------------|");
        System.out.println("Dia da semana: " +dia);
        System.out.println("Possui carteirinha ou é menor de 18 anos ? " +carteirinha);
        System.out.println("Preço Normal " +valorDoIngresso);
        System.out.println("Preço com desconto " +preçofinal);
     } 
    } 
}
// Consegui resolver esse exercicio, penei bastante mas tô feliz de ter conseguido resolver.