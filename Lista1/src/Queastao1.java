//Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o
// maior deles.
import java.util.Scanner;
public class Queastao1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro: ");

        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");

        int n2 = scanner.nextInt();

        if (n1>n2){
            System.out.println("o maior valor entre eles é o " + n1);

        }else{
            System.out.println("O maior numero entre eles é o " + n2);
        }
    }
}
