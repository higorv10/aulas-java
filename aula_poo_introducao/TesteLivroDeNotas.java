import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main (String [] args) {
        String nomeDaUc = JOptionPane.showInputDialog("Professor, qual é o nome da UC? ");
        //Variável de referência
        LivroDeNotas livroDeNotas;
        //operador de construção de objetos : new
        livroDeNotas = new LivroDeNotas ();
        //operador de acesso a membro: .
        // é a chamada do método
        // chamar (call) é um método que significa coloca-lo em execução
        livroDeNotas.nomeDaUc = nomeDaUc;
        livroDeNotas.exibirMensagem();

        LivroDeNotas Livro2 = new LivroDeNotas();
        Livro2.exibirMensagem();
        

    } 
    
}