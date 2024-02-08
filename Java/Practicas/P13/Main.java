import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Abaco operacion = new Abaco();

        Scanner scan = new Scanner(System.in);

        int opc;

        System.out.println("=====================================================\n\tCALCULADORA DE OPERACIONES BÁSICAS\n=====================================================");

        do 
        {
            System.out.println("\n\n-> 1) SUMAR\n-> 2) RESTAR\n-> 3) MULTIPLICAR\n-> 4) DIVIDIR\n-> 5) SALIR\n\n");
            System.out.printf("\t* Ingresa una opción: ");
            opc = scan.nextInt();

            switch(opc)
            {
                case 1:
                    operacion.pedirDatos();
                    operacion.suma();
                    operacion.mostrarResultado();
                    break;

                case 2:
                    operacion.pedirDatos();
                    operacion.resta();
                    operacion.mostrarResultado();
                    break;
                
                case 3:
                    operacion.pedirDatos();
                    operacion.multiplica();
                    operacion.mostrarResultado();
                    break;
                
                case 4:
                    operacion.pedirDatos();
                    operacion.divide();
                    operacion.mostrarResultado();
                    break;
                
                case 5:
                    scan.close();
                    break;
                
                default:
                    System.out.println("INGRESA UNA OPCIÓN CORRECTA.\n\n");
                    break;
            }
        }while(opc != 5);
    }
}