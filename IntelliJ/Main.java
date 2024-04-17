import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        String[] names = {"joao", "maria", "jorge", "vinicius" };
//       for(int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//
//        }
//       int tamanholista = names.length;
//        for (int j = 0 ; j< tamanholista; j++){
//
//            System.out.println(names[j]);
//        }
//

        int j =0;
//        while (j < names.length){
//            System.out.println(names[j]);
//            j++;
//        }

        do {
            System.out.println(names[j]);
            j++;
        }while (j < names.length);
    }

}
