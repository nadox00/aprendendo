import java.util.Scanner;

public class SalarioCounter {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Quantos Salarios ?");
        int vl = sc.nextInt();
        double sm = 1.203;

        System.out.print("A quantidade total de salarios é:" +vl*sm);


    }
    
}

