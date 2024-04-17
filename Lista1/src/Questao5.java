import java.text.DecimalFormat;
import java.util.Scanner;
// Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
// Calcular e imprimir o seguinte:
// − Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
// − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
// − Se o número de lados for igual a 5 escrever PENTÁGONO.
public class Questao5 {

    // (medida lado /(2*tang(pi/quantidade de lados)))*semiperimetro
    public static void  main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de lados do poligono regular: ");
        int quantidadeLados = scanner.nextInt();

        System.out.println("Informe a medida dos lados em cm: ");
        int medidaLado = scanner.nextInt();


        String classificar = classificarPoligono (quantidadeLados);
        System.out.println(classificar);

        double area = calcularArea(quantidadeLados, medidaLado);
        System.out.println("A área do quadrado é: " + area + " cm²");

    }

    private static String classificarPoligono(int quantidadeLados) {
        switch (quantidadeLados){
            case 3:
                return "TRIANGULO";

            case 4:
                return "QUADRADO";

            case 5:
                return "PENTAGONO";

        }

        if (quantidadeLados<3){
            return "NAO E UM POLIGONO";

        } else {
            return "POLIGONO NAO IDENTIFICADO";
        }
    }

    static double calcularArea(int quantidadeLados, int medidaLado) {
        double perimetro = medidaLado*quantidadeLados;
        double apotema = medidaLado / (2 * Math.tan(Math.PI/quantidadeLados));

        return apotema *(perimetro/2);
     }
}





