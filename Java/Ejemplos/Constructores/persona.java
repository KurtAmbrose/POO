import java.util.Scanner;

public class persona
{
    String nombre, apellido;
    int edad;

    Scanner scan = new Scanner(System.in);

    public persona(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void pedirDatos()
    {
        System.out.printf("\nIngresa el nombre de la persona: ");
        nombre = scan.nextLine();
        System.out.printf("\nIngresa el apellido de la persona: ");
        apellido = scan.nextLine();
        System.out.printf("\nIngresa la edad de la persona: ");
        edad = scan.nextInt();
    }
}