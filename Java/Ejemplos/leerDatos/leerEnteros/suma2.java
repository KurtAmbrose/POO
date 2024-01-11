import java.util.Scanner;

public class suma2
{
    public static void main (String[] args)
    {
        int numero1, numero2, resultado;

        System.out.print("\nIngresa el primer número: ");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();

        System.out.print("\nIngresa el segundo número: ");
        numero2 = num1.nextInt();

        resultado = numero1 + numero2;

        System.out.println("\nEl resultado es: " + resultado);
    }
}