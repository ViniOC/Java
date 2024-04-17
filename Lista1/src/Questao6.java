import java.util.Scanner;

//Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
// − Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
// − Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
public class Questao6 {
    public static void  main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de lados: ");
        int lados = scanner.nextInt();

        System.out.println("Informe a medida dos lados em cm: ");
        int med = scanner.nextInt();
        switch (lados){

            case 3:
                System.out.println("TRIANGULO " );
                break;

            case 4:
                System.out.println("QUADRADO " + med*med +"cm quadrado");
                break;
            case 5:
                System.out.println("PENTAGONO");
                break;

        }
        if (lados<3){
            System.out.println("NAO E UM POLIGONO");

        } else if (lados>5) {
            System.out.println("POLIGONO NAO IDENTIFICADO");
        }
    }
}
