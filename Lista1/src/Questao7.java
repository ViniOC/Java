import java.util.Scanner;

//Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não
// informará valores iguais.
public class Questao7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o prmeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("digite o segundo valor: ");
        int num2 = scanner.nextInt();
        System.out.println("digite o terceiro valor");
        int num3 = scanner.nextInt();

        int maior = num1;
        if (num2>maior){
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("o maior valor é: "+ maior);


    }

}
