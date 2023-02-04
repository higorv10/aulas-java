public class LivroDeNotas {
    private String nomeDaUc;

    //método de acesso = getters
    public String getNomeDaUC (){
        return nomeDaUc;
    }

    //método modificadores = setters
    public void setNomeDaUc (String nome) {
        this.nomeDaUc = nomeDaUc;
    }
    
    public void exibirMensagem() {
        System.out.println("Bem vindo ao livro de notas da UC " + nomeDaUc);
    }
    
}
