// import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;
//JOptionPane
//ShowMenssageDialog
//javax.swing
public class ExemploWhile{
    public static void main (String [] args){
        //declaração de variáveis
        int quantidadeAlunos = parseInt(showInputDialog("Professor, você possui quantos alunos?"));
        int nota1, nota2;
        double media;
        //while
        //repetição controlada por contador
        int contador = 1;
        //isso é um loop infinito
        while(contador <= quantidadeAlunos){//condição de continuidade
            //entrada
            nota1 = parseInt(showInputDialog("Digite a primeira nota"));
            nota2 = parseInt(showInputDialog("Digite a segunda nota"));
            //processamento
            media = (nota1 * 1. + nota2) / 2; 
            //saída
            showMessageDialog(null, "A média é: " + media);
            //contador = contador + 1;//incremento
            //contador += 1; //operador composto
            //contador++;//operador de pós incremento
            ++contador; //operador de pré incremento
    
    
    

        }        


        
    }

    
}