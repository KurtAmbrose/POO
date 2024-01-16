import java.util.Scanner;

public class estacionamiento
{

    public static void calcularMonto(int [] t1, int [] t2)
    {
        int monto;

        if(t2[1] == t1[1])
        {
            monto = (t2[0] - t1[0]) * 15;
        }
        else
        {
            if(t2[1] < t1[1])
            {
                monto = (t2[0] - t1[0] - 1) * 15;
            }
            else
            {
                monto = (t2[0] - t1[0] + 1) * 15;
            }
        }

        System.out.println("\n\t--> Monto a pagar: " + monto + "\n\n");
    }
    public static void main(String [] args)
    {
        int[] tiempoIni = new int[2];
        int[] tiempoFin = new int[2];
        Scanner datos = new Scanner(System.in);

        System.out.printf("\n\n=====================================================\n BIENVENIDO AL ESTACIONAMIENTO DE PLAZA TEPIKOELHOYO\n=====================================================\n\n");

        do
        {
            System.out.printf("-> Ingresa la hora de entrada (SÓLO LA HORA): ");
            tiempoIni[0] = datos.nextInt();
            if(tiempoIni[0] > 23)
            {
                System.out.println("Ingresa una hora válida\n");
            }
        }while(tiempoIni[0] > 23);
        do
        {
            System.out.printf("-> Ingresa los minutos de entrada (SÓLO LOS MINUTOS): ");
            tiempoIni[1] = datos.nextInt();
            if(tiempoIni[1] > 59)
            {
                System.out.println("Ingresa unos minutos validos\n");
            }
        }while(tiempoIni[1] > 59);

        do
        {
            System.out.printf("-> Ingresa la hora de salida (SÓLO LA HORA): ");
            tiempoFin[0] = datos.nextInt();
            if(tiempoFin[0] > 23)
            {
                System.out.println("Ingresa una hora válida\n");
            }
        }while(tiempoFin[0] > 23);
        do
        {
            System.out.printf("-> Ingresa los minutos de salida (SÓLO LOS MINUTOS): ");
            tiempoFin[1] = datos.nextInt();
            if(tiempoFin[1] > 59)
            {
                System.out.println("Ingresa unos minutos validos\n");
            }
        }while(tiempoFin[1] > 59);

        calcularMonto(tiempoIni, tiempoFin);

    }
}

