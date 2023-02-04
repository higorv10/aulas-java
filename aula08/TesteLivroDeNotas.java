import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main ( String [] args){
        
    
    String nomeDaUC = JOptionPane.showInputDialog(("Professor, qual é o nome da UC?"));
    LivroDeNotas livro1;
    livro1 = new LivroDeNotas();
    livro1.setNomeDaUc(nomeDaUC);
    System.out.println("nome do livro 1: " + livro1.getNomeDaUC());
    livro1.exibirMensagem();

    LivroDeNotas livro2 = new LivroDeNotas();
    //syntax sugar
    livro2.setNomeDaUc("Matemática");
    System.out.println("nome do livro 2: " + livro2.getNomeDaUC());
    livro2.exibirMensagem();


    }    

}
