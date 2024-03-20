import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = teclado.nextLine();
        System.out.println("Digite o valor do produto");
        float valor = teclado.nextFloat();
        System.out.println("Informe o valor do desconto seguindo a tabela ");
        float desconto = teclado.nextFloat();

    if (valor <= 0) {
        System.out.println("Valor invalido, O valor do produto deve ser maior do que zero");
    } else {

        float valorComDesconto = (100 / valor) * desconto ;

        System.out.println("Nome do produto: " +produto);
        System.out.println("Valor do produto em R$: " +valor);
        System.out.println("Valor com desconto em R$: " +valorComDesconto);
    }
      
    

        
    }
    
}

