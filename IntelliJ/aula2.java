import java.util.Scanner;
public class aula2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();

        if (idade < 13){
            System.out.println("Você é uma criança!");
        } else if (idade >= 13 && idade<18) {
            System.out.println("Você é um adoloscente!");
        } else{
            System.out.println("Você é um adulto!");
        }


    }
}
