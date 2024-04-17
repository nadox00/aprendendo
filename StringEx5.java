import java.util.Scanner;
public class StringEx5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o caractere");
        String cr = teclado.nextLine();

    switch (cr) {
        case "M":
            System.out.println("HOMEM");
            break;
        case "F":
            System.out.println("MULIER");
            break;
        case "O":
            System.out.println("ANOMALIA, ZUEEEEEERA ZUEEERA, Pa Ri mané");        
            break;
        default:
        System.out.println("DESCONHECIDO");
            break;
    }
    }
    
}
