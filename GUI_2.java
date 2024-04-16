
import javax.swing.JOptionPane;

public class GUI_2 {

    public static void main(String[] args) {
        String ano_str = JOptionPane.showInputDialog("Digite o ano em que voce nasceu");
        int ano_int = Integer.parseInt(ano_str);
        int idade = 2024 - ano_int;
        
        JOptionPane.showMessageDialog(null, "Sua idade é: " +idade);
    }
    
}
