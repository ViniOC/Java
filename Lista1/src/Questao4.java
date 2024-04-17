import java.util.Scanner;
// As maçãs custam R$ 0,30 cada se forem compradas menos do que uma
// dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
// programa que leia o número de maçãs compradas, calcule e escreva o
// valor total da compra
public class Questao4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de macas compradas: ");
        int qnt = scanner.nextInt();

        boolean duzia = qnt >= 12;

        double preco = duzia? (qnt*0.25) : (qnt*0.30);

        System.out.println("o valor total da sua compra foi de R$"+preco);

    }

}
