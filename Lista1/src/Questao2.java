import java.util.Scanner;
//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se
// ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

public class Questao2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe seu ano de nascimento para validar seu direito de voto: ");
        int ano = scanner.nextInt();

        int idade = 2024 - ano;

        boolean podeVotar = idade >= 16;

        // ternario = utilizar o boolean para verificar v e f o "?" é o verdadeiro e o : é o falso
        // [e necessario atribuir isso a uma variavel
        String resultado = podeVotar ? ("Pode Votar") : ("Nao pode votar");

        System.out.println(resultado);


    }
}
