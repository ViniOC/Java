import java.util.Scanner;
public class Main {
    static double resultado;
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o operador da conta");
        String operator = scanner.next();

        while (isValid(operator)){
            System.out.println("operador invalido!!");
            operator = scanner.next();
        }

        System.out.println("digite um numero");
        double n1 = scanner.nextDouble();

        System.out.println("Digite outro numero");
        double n2 = scanner.nextDouble();



        if (operator.equals("+")){
            resultado = n1 +n2;
        } else if (operator.equals("-")) {
            resultado = n1 - n2;
        }else if(operator.equals("/")){
            resultado = n1 / n2;
        } else if (operator.equals("*")) {
            resultado = n1 * n2;
        } else {
            System.out.println("oparador invalido !!");
        }



        System.out.println(" o resultdo d operação é: " + resultado);
    }
    static boolean  isValid(String operator){
        return !(operator.equals("+")|| operator.equals("-")|| operator.equals("*")|| operator.equals("/"));
    }

}
