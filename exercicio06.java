import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lua ou Marte ?");
        String planeta = teclado.nextLine();
        

        System.out.println("Digite seu peso");
        int peso = teclado.nextInt();

        double resultadomarte = ( peso / 9.81 ) * 1.62;
        double resultadolua = ( peso / 9.81 ) * 3.71;

        if ( planeta.equals("lua") ) {
            System.out.println("O seu peso na lua é"  +resultadolua);
        }
        else if ( planeta.equals("marte")) {
            System.out.println("Seu peso em marte é de" +resultadomarte);
        }  
    


    }

    // Esse é um exercicio que eu já tinha feito na faculdade e estou fazendo aqui de novo.
    // Acredito que esteja meio confuso e tambem o codigo não vai retornar nada caso digite qualquer outra palavra que nao seja marte ou lua.
    // Irei tentar corrigir isso em casa.
}