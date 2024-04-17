import java.util.Scanner;

public class Calculadora {
    static double resultado;
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        double n1 = scanner.nextInt();

        System.out.println("digite outro numero");
        double n2 = scanner.nextInt();

        System.out.println("-Escolha um opção de operador-");
        System.out.println("1 = soma");
        System.out.println("2 = subtração");
        System.out.println("3 = divisão");
        System.out.println("4 = multiplicação");
        int operador = scanner.nextInt();



        switch (operador){
            case 1:
                resultado = n1+n2;
                break;
            case 2:
                resultado = n1-n2;
                break;
            case 3:
                if (n2!=0){
                resultado = n1/n2;
                }else {
                    System.out.println("erro");
                    return;}
                break;
            case 4:
                resultado = n1*n2;
                break;
            default:
                System.out.println("erro");
                return;

                }
         System.out.println("resultado é igual a: " + resultado);
        }








    }



