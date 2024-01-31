public class calculadoraImc
{
    double IMC;

    public void calcularIMC(double masa, double altura)
    {
        System.out.println("* Calculando IMC...");
        IMC = masa / (Math.pow(altura, 2));
    }

    public double mostrarIMC()
    {
        return IMC;
    }
}