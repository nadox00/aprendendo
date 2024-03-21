import java.util.Scanner;

public class Exercicio08H {
    public static void main(String[] args) {
        @SuppressWarnings ("resource")
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a data em dd/mm/aa");
        String data = teclado.nextLine();

        int dia = Integer.parseInt(data.substring(0,2));
        int mes = Integer.parseInt(data.substring(3,5));
        int ano = Integer.parseInt(data.substring(6));
        
        String [] nomeMeses = {
            "Janeiro", "Fevereiro", "Março",
            "Abril", "Maio", "Junho", "Julho",
            "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("Dia " +dia);
        System.out.println("Mês " +nomeMeses[mes - 1]);
        System.out.println("Ano " +ano);
    }
    // fiz esse exercicio que o professor passou pra casa com ajuda do ChatGPT.
}
