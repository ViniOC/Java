// Leia o código de um determinado produto e mostre sua classificação.
import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("informe o codigo do seu produto");
        int codigoProduto = scanner.nextInt();

        String produto = lerProduto(codigoProduto);

        System.out.println(produto);
    }

    private static String lerProduto(int codigoProduto){

        switch (codigoProduto){
            case 1:
                return "Alimento não-perecivel";
            case 2:
                return "Alimento Perecivel";
            case 3:
                return "Vestuario";
            case 4:
                return "Higiene pessoal";
        }
            if (codigoProduto >= 8 && codigoProduto <=15){

                return "Limpeza e Utensilios Domésticos";
            }else {
                return "Código Invalido!!";

            }

    }









}

