//Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
// Retângulo ou Obtusângulo. Sendo que:
// − Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
// −Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º)
// − Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
// Observação: Os somatório dos ângulos internos de um triângulo é sempre 180º

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIgite o primeiro angulo do seu triangulo:");
        double ang1 = scanner.nextDouble();

        System.out.println("Digite o segundo angulo do seu triangulo");
        double ang2 = scanner.nextDouble();

        System.out.println("Digite o terceito angulo do seu triangulo");
        double ang3 = scanner.nextDouble();

        String validacao = validaTriangulo(ang1, ang2, ang3);
        System.out.println(validacao);

        // nao consegui fazer o codigo não "printar" o tipo do triangulo se ele não é um triangulo valido

        String nomeTriangulo = denominaTriangulo(ang1, ang2, ang3);
        System.out.println(nomeTriangulo);
    }

    private static String validaTriangulo (double ang1, double ang2, double ang3){
        double soma = ang1 + ang2 + ang3;

        if (soma > 180) {
            return "nao é um triangulo";
        }else if (soma <180) {
            return "nao é um triangulo";
        }else {
            return"";
        }

    }

    private static String denominaTriangulo (double ang1, double ang2, double ang3){

        if (ang1<90 && ang2<90 && ang3<90 ){
            return "Triangulo acutangulo";
        } else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            return "Triangulo retangulo";
        }else {
            return "triangulo obtusangulo";
        }

    }

}
