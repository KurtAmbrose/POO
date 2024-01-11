import java.util.Scanner;

public class agenda
{
    public static void main (String[] args)
    {
        String alias, nombre, dir, tel;

        Scanner datos = new Scanner(System.in);

        System.out.println("====================\n Agenda\n====================");

        System.out.printf("Ingresa el nombre completo de la persona: ");
        nombre = datos.nextLine();

        System.out.printf("Ingresa el alias completo de la persona: ");
        alias = datos.nextLine();

        System.out.printf("Ingresa la dirección: ");
        dir = datos.nextLine();

        System.out.printf("Ingresa el teléfono: ");
        tel = datos.nextLine();

        System.out.println("\n---- Datos de la persona ----\n\n\t\t\"" + alias + "\"");
        System.out.println("\t-> Nombre: " + nombre + "\n\t-> Dirección: " + dir + "\n\t-> Teléfono: " + tel + "\n\n");
    }
}