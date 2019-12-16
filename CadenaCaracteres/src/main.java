public class main {

    public static void main(String[] args) {

        StringBuilder buffer1 = new StringBuilder(); //capacidad de 16 caracteres

        StringBuilder buffer2 = new StringBuilder(10); //capacidad inicial de 10 caracteres

        StringBuilder buffer3 = new StringBuilder("Hola"); //su capacidad sera la cantidad de caracteres que tenga asignada + 16

        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer2 = \"%s\"%n", buffer2);
        System.out.printf("buffer3 = \"%s\"%n", buffer3);;

    }
}
