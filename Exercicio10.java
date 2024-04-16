import java.util.Scanner;

public class Exercicio10 {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia");
        String dia = teclado.nextLine();
        System.out.println("Digite o numero do mês");
        int mes = teclado.nextInt();
        System.out.println("Digite o ano");
        int ano = teclado.nextInt();

        switch (mes) {
            case 1:
            System.out.println(dia + " de Janeiro " +ano);
            break;
            case 2:
            System.out.println(dia + " de Fevereiro " +ano);
            break;
            case 3:
            System.out.println(dia + " de Março " +ano);
            break;
            case 4:
            System.out.println(dia + " de Abril " +ano);
            break;
            case 5:
            System.out.println(dia + " de Maio " +ano);
            break;
            case 6:
            System.out.println(dia + " de Junho " +ano);
            break;
            case 7:
            System.out.println(dia + " de Julho " +ano);
            break;
            case 8:
            System.out.println(dia +  "de Agosto " +ano);
            break;
            case 9:
            System.out.println(dia + " de Setembro " +ano);
            break;
            case 10:
            System.out.println(dia + " de Outubro " +ano);
            break;
            case 11:
            System.out.println(dia + " de Novembro " +ano);
            break;
            case 12:
            System.out.println(dia + " de Dezembro " +ano);
            break;
        }
    }
}
// Tá grande o codigo ? Está mas ai é detalhe.
// Fiz na faculdade.