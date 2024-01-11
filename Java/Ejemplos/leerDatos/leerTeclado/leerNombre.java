import java.util.Scanner;

public class leerNombre
{
    public static void main (String [] args)
    {
        String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingresa tu nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Hola " + nombre);
    }
}