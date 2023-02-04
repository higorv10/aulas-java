import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é de: " + imc);
        
        if (imc >= 18.5 && imc <= 25){
            System.out.println("O seu peso esta normal ");

        } else {
            System.out.println("O seu peso esta fora do normal ");
        }

        sc.close();    
    }
}