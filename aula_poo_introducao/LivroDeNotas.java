//alta coesão
//você deseja que suas classes sejam altamente coesas
//uma classe altamente coesa é aquela que tem somente um propósito, somente uma finalidade, somente uma razão de ser, ela resolve somente um problema
//alta coesão promove a reusabilidade e manutenabilidade do seu codigo
public class LivroDeNotas {
    // variável de instância
    //instância é sinonimo de objeto
    String nomeDaUc;



    //método (comportamentop)
    // () é a lista de parâmetros desse método
     //definição do método: aqui nós idssemos que ele existe
    public void exibirMensagem () {
        System.out.println("Bem vindo ao livro de notas da UC Programação de soluções Computacionais" + nomeDaUc);
    }
}