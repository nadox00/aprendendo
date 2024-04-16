
import javax.swing.JOptionPane;

public class GUI_1 {

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua Senha");
        if (senha.equals("password123")) {
            JOptionPane.showMessageDialog(null,"Login relacionado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Senha Incorreta");
        }
    }
    
}
