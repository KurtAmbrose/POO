import java.util.Scanner;

public class tablaInfinita
{

    public static void sacarTabla(int numero)
    {
        int i, opcion;
        Scanner scan = new Scanner(System.in);

        i = 0;
        opcion = '\0';

        while(opcion != 1)
        {
            System.out.println(numero + " X " + i + " = " + (numero * i));

            System.out.printf("\nOtro? Sí [0] / No [1]: ");

            opcion = scan.nextInt();

            i++;
        }

        scan.close();
    }
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.err.println("Uso: tablaInfinita <número>");
            System.exit(1);
        }    

        sacarTabla(Integer.parseInt(args[0]));
    }
}