//Faça um programa que receba duas notas, calcule e mostre a média aritmética e mensagem que está na
//tabela a seguir:

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota:");
        double nota2 = scanner.nextDouble();


        double mediaNota = mediaAritmetica(nota1, nota2);

        String aprovacao = verificarAprovacao(mediaNota);

        System.out.println("Situação do aluno: " + aprovacao);
        System.out.println("sua nota: " + mediaNota);


    }

    private static double mediaAritmetica(double nota1, double nota2){
       double media = (nota1 + nota2) / 2;

       return media ;

    }
    private static String verificarAprovacao(double mediaNota){
        if (mediaNota == 0 && mediaNota <= 4){
            return "Reprovado";
        } else if (mediaNota >= 4.1 && mediaNota <= 7) {
            return "Exame";
        }else {
            return "Aprovado";
        }

    }



}
