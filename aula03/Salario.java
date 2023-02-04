import javax.swing.JOptionPane;
//ident
public class Salario {
    public static void main(String [] args) {

        //entrada
        double salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário Atual"));
        double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual de Reajuste"));

        //processamento
        double salarioposReajuste = salarioInicial * reajuste /100 + salarioInicial;

        //saída
        JOptionPane.showMessageDialog(null,"Seu Salario pos reajuste sera de R$ " + salarioposReajuste);
    }
    
}
