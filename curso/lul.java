import java.util.Scanner;

public class lul {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo numero ");
        int numero2 = sc.nextInt();

        int soma = (numero1/numero2) * 11;
        System.out.println("A soma desses numeros tem como resultado: " + soma);

        if (soma == 11){
            System.out.println("Portanto o resultado esta correto ");

        }

        sc.close();
    }

}
