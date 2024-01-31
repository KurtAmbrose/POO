import java.util.Scanner;
import java.text.DecimalFormat;

public class persona
{
    double masa, altura, IMC;

    DecimalFormat formato = new DecimalFormat("#.##");

    Scanner datos = new Scanner(System.in);

    public void registrarMasayAltura()
    {
        System.out.printf("-> Ingresa la masa en kg: ");
        masa = datos.nextDouble();
        System.out.printf("-> Ingresa la altura en m: ");
        altura = datos.nextDouble();
        datos.close();
    }

    public double mostrarMasa()
    {
        System.out.println("-> La masa es de: " + formato.format(masa) + " kg");
        return masa;
    }

    public double mostrarAltura()
    {
        System.out.println("-> La altura es de: " + formato.format(altura) + " m");
        return altura;
    }
}