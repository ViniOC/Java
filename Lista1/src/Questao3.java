//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o
// número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja
// válida. ACESSO NEGADO caso a senha seja inválida
import java.util.Scanner;
public class Questao3 {
    public static void main (String[]args){
       //determinar senha valida
        String senhaValida = "1234";
        Scanner scanner = new Scanner(System.in);
        //leitura de senha
        System.out.println("Insira a sua senha: ");

        String senha = scanner.next();

        //validar se senha valida
        //imprimir o resuldade da validacao
        if(senhaValida.equals(senha)){
            System.out.println("ACESSO PERIMITIDO");
        }else {
            System.out.println("ACESSO NEGADO");
        }
    }


}
