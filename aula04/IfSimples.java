import javax.swing.JOptionPane;
public class IfSimples{
    public static void main(String [] args){
        
        double nota;
        nota =Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota "));
        if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado ");
            JOptionPane.showMessageDialog(null, "Parabéns ");

        }
    }


}