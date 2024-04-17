import java.util.Scanner;
public class Conversor {
    public double medida;
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        System.out.println("Informe a sua medida ");
        int n1 = scanner.nextInt();

        System.out.println("escolha sua unidade de comprimento");

        System.out.println("1 = cm");
        System.out.println("2 = m");
        System.out.println("3 = km");
        int uni = scanner.nextInt();

        System.out.println("escolha para qual medida deseja converter");
        System.out.println("1 = cm");
        System.out.println("2 = m");
        System.out.println("3 = km");
        int med = scanner.nextInt();

        switch (uni + med){

            case 1:


        }




    }
}
