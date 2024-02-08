import java.util.Scanner;

public class clasePadre
{
    int valor1, valor2, res;

    Scanner entrada = new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.printf("Ingresa el primer dato: ");
        valor1 = entrada.nextInt();
        System.out.printf("Ingresa el segundo dato: ");
        valor2 = entrada.nextInt();
    }

    public void mostrarResultado()
    {
        System.out.println("El resultado es: " + res);
    }
}