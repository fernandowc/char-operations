public class OperacionesCaracteres {

    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("Hola, como estas?");

        //capacity proporciona la capacidad de almacenamiento del objeto StringBuilder
        System.out.printf("buffer = %s%nlongitud = %s%ncapacidad = %d%n", buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75); //indica la capcidad que debe de tener
        System.out.printf("Nueva Capacidad = %d%n%n", buffer.capacity());

        buffer.setLength(20);
        System.out.printf("Nueva longitud = %d%nbuffer = %s%n", buffer.length(), buffer.toString());

    }
}
