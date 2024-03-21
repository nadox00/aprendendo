import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        @SuppressWarnings ("resource")

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = teclado.nextLine();
        System.out.println("Digite o valor do produto");
        double valor = teclado.nextDouble();
        double valorComDesconto = 0;
        
     if  ( valor < 50) {
        valorComDesconto = valor;
    } else if ( valor > 50 && valor < 200) {
        valorComDesconto = valor - ( valor *0.05);
    } else if ( valor >= 200 && valor < 500) {
        valorComDesconto = valor - ( valor * 0.06);
    } else if ( valor >= 500 && valor < 1000) {
        valorComDesconto = valor - ( valor *0.07);
    } else if ( valor > 1000) {
        valorComDesconto = valor - ( valor * 0.08);    
    }
    System.out.println("Nome do produto: " +produto);
    System.out.println("Valor do produto em R$: " +valor);
    System.out.println("Valor com desconto em R$: " +valorComDesconto);
        
    }    
   // Coonsegui resolver esse exercicio, reescrevi a parte do if/elseif mas ainda sim estava dando erro, até eu descobrir que tinha
   // deixar o if/elseif tudo junto sem espaçamento na linha de codigo pra funcionar.
}

