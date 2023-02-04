import javax.swing.JOptionPane;
//ident
public class Idade {

    public static void main(String [] args){
        
    //entrada
    double anos = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade"));
    
    //processamento
    double idadeDias = anos* 365;
    //saída
   
    JOptionPane.showMessageDialog(null, "Sua idade em dias é de " + idadeDias + "dias" );

    }
    


    
}
