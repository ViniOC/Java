//Crie um programa que lê o conceito de um aluno na disciplina e imprime seu significado, de acordo com a
// tabela abaixo. Caso seja informado um conceito inexistente, deve ser exibida uma mensagem de erro

import javax.swing.*;
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua performace na prova(A, B, C, D, E, F): ");
        String conceito = scanner.next();

        System.out.println(significadConceito(conceito));


    }

    private static String significadConceito(String conceito){
        switch (conceito){
            case "A":
                return "Excelente";
            case "B":
                return "ótimo";
            case "C":
                return "Bom";
            case "D":
                return "Regular";
            case "E":
                return "Ruim";
            case "F":
                return "Reprovado";
            case "a":
                return "Excelente";
            case "b":
                return "ótimo";
            case "c":
                return "Bom";
            case "d":
                return "Regular";
            case "e":
                return "Ruim";
            case "f":
                return "Reprovado";


        }


        return "--ERRO--";
    }
}
