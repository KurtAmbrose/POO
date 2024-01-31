import java.text.DecimalFormat;

public class main
{
    public static void main(String [] args)
    {
        double masa, altura;

        persona pers = new persona();

        DecimalFormat formato = new DecimalFormat("#.##");

        calculadoraImc calculadora = new calculadoraImc();

        System.out.println("==================================\n\tCALCULADORA DE IMC\n==================================");

        pers.registrarMasayAltura();

        masa = pers.mostrarMasa();
        altura = pers.mostrarAltura();

        calculadora.calcularIMC(masa, altura);

        if(calculadora.mostrarIMC() < 18.5)
        {
            System.out.println("\n-> El IMC es de " + formato.format(calculadora.mostrarIMC()) + " por lo tanto, TIENE BAJO PESO.\n\n");
        }
        else
        {
            if(calculadora.mostrarIMC() >= 18.5 && calculadora.mostrarIMC() <= 24.9)
            {
                System.out.println("\n-> El IMC es de " + formato.format(calculadora.mostrarIMC()) + " por lo tanto, SU PESO ES BUENO.\n\n");
            }
            else
            {
                if(calculadora.mostrarIMC() >= 25 && calculadora.mostrarIMC() <= 29.9)
                {
                    System.out.println("\n-> El IMC es de " + formato.format(calculadora.mostrarIMC()) + " por lo tanto, TIENE SOBREPESO.\n\n");
                }
                else
                {
                    System.out.println("\n-> El IMC es de " + formato.format(calculadora.mostrarIMC()) + " por lo tanto, ESTÁ USTED BIEN OBESO.\n\n");
                }
            }
        }
        
    }
}