import javax.swing.JOptionPane;

public class Soma1aN {
    public static void main(String [] args){
        //ler um valor de 1 a n, exibir a soma
        //exemplo: n=5 -> soma = 1 + 2 + 3 + 4 + 5 = 15
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite da soma"));
        //laço while crescente
        int cont = 1;
        int soma = 0;
        while (cont <= n) {
            soma = soma + cont;
            cont++;

        }
        JOptionPane.showMessageDialog(null, "soma com while crescente: " + soma);
        for (cont = n, soma = 0; cont > 0; cont--) {
            soma = soma + cont;
            
        }
        JOptionPane.showMessageDialog(null, "Soma com  for descresente: " + soma);
        
    }

}