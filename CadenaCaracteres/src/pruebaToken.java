import java.util.Arrays;
import java.util.Scanner;

public class pruebaToken {

    public static void main(String[] args) {

        Scanner scaner  = new Scanner(System.in);

        System.out.println("Escriba un enunciado y oprima enter");
        String enunciado = scaner.nextLine();

        //procesando el enunciado del usuario
        String[] tokens = enunciado.split(" ");
        System.out.printf("Numero de elementos: %d%nLos tokens son: %n", tokens.length);

        for (String token : tokens)
        {
            System.out.println(token);
        }
    }
}
