import java.util.Scanner;

public class calculadora_v1 
{

    public static void main (String[] args)
    {
        int numero1, numero2, resultado;

        System.out.println("=========================");
        System.out.println(" Calculadora versión 1.0");
        System.out.println("=========================");

        System.out.printf("\nIngresa el primer número: ");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();
        System.out.printf("\nIngresa el segundo número: ");
        numero2 = num1.nextInt();

        resultado = numero1 + numero2;

        System.out.println("\n-> La suma de " + numero1 + " y " + numero2 + " es: " + resultado);

        resultado = numero1 - numero2;

        System.out.println("-> La resta de " + numero1 + " y " + numero2 + " es: " + resultado);

        resultado = numero1 * numero2;

        System.out.println("-> La multiplicación de " + numero1 + " y " + numero2 + " es: " + resultado);

        resultado = numero1 / numero2;

        System.out.println("-> La división de " + numero1 + " y " + numero2 + " es: " + resultado + "\n");
    }
}