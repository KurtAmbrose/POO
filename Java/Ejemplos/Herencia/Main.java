public class Main
{
    public static void main(String [] args)
    {
        claseHijaSuma op1 = new claseHijaSuma();

        System.out.println("=====================================================\n\tEJEMPLO DE HERENCIA CON UNA CALCULADORA\n=====================================================");

        op1.pedirDatos();

        op1.suma();

        op1.mostrarResultado();
    }
}