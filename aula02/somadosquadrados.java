import javax.swing.JOptionPane;
//ident:indentação
public class somadosquadrados{
    public static void main(String [] args){

        //declaração de variáveis
        double n1;
        double n2;
        double n3;
        double n4;
        double somadosquadrados;

        //entrada
        //atribuição =
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));    
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número"));

        //processamento

        somadosquadrados = n1 * n1 + n2 * n2 + n3 * n3 + n4 * n4;

        //saida
        JOptionPane.showMessageDialog (null, somadosquadrados);

    }
    
}
