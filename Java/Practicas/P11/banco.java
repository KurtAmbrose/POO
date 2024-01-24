import java.util.Scanner;

public class banco
{
    public static String ingresarUsuario(String [] nuevoUsuario)
    {
        
    }

    public static void main(String [] args)
    {
        String [] usuario;
        float saldo, efectivo;
        int opc;
        Scanner scan = new Scanner(Sysstem.in);

        do
        {
            System.out.println("=====================\n\tBANCO TEPIKOELHOYO\n=====================");
            System.out.println("-> 1) Ingresar usuario\n-> 2) Dinero\n-> 3) Salir\n\n");
            System.out.printf("* Ingresa un a opción: ");

            opc = scan.nextInt();

            switch (opc) 
            {
                case 1:
                    usuario = ingresarUsuario(usuario);
                    break;
            
                default:
                    System.out.println("\n* Ingresa un opción válida\n");
                    break;
            }
        }while(opc != 3);
    }
}