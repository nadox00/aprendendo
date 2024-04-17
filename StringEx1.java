public class StringEx1 {

    public static void main(String[] args) {
        String cep = "46433-000";

        System.out.println(cep.length());
        System.out.println(cep.charAt(5));

        if (cep.charAt(5) == '-' ) {
            System.out.println("Há o traço no lugar correto");
        } else {
            System.out.println("Não há o traço no lugar correto");
        }
    }
    
}
