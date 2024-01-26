import java.util.Scanner;

public class datos
{
    String nombre;
    int edad;
    Scanner scan = new Scanner(System.in);

    public void pedirNombre()
    {
        System.out.printf("-> Ingresa un nombre: ");
        nombre = scan.nextLine();
    }

    public void pedirEdad()
    {
        System.out.printf("-> Ingresa la edad: ");
        edad = scan.nextInt(); 
    }

    public String regresarNombre()
    {
        return nombre;
    }

    public int regresarEdad()
    {
        return edad;
    }
}