import javax.swing.JOptionPane;
//indent:indentação
public class Conversao{
   public static void main(String [] args){

    //declaração de variáveis
    double cotacao;   
    double quantidade;
    double valorConvertido;
    //entrada
    //atribuição =
    cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação"));
    quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade"));

    //processamento
    valorConvertido = cotacao * quantidade;
    

    //saida
    JOptionPane.showMessageDialog (null, valorConvertido);

    }
}