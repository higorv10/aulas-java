import javax.swing.JOptionPane;
//ident
public class Custodocarro {
    public static void main (String [] args) {
        //entrada
        double custodoFabricante = Double.parseDouble(JOptionPane.showInputDialog("Digite o Custo do carro "));
        double percentualdoDespachante = Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual do Despachante "));
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite a Porcentagem do Imposto sobre o Produto "));

        //processamento
        double custoFinal = custodoFabricante * percentualdoDespachante/100 + custodoFabricante * imposto/100 + custodoFabricante;
        
        //saída
        JOptionPane.showMessageDialog(null, "O custo do veículo será de R$ " + custoFinal);

    } 
}