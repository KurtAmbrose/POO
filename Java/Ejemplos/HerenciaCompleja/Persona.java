import java.util.Scanner;


public class Persona
{
    String nombre, genero;
    int edad;
    Scanner scan = new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.printf("\n-> Ingresa el nombre: ");
        nombre = scan.nextLine();
        System.out.printf("\n-> Ingresa el género: ");
        genero = scan.nextLine();
        System.out.printf("\n-> Ingresa la edad: ");
        edad = scan.nextInt();
    }
    public void mostrarInfoPersona()
    {
        System.out.println("-> NOMBRE: " + nombre + "\n-> GÉNERO: " + genero + "\n-> EDAD: " + edad + "\n");
    }
}
