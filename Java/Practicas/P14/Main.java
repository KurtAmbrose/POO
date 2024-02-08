import java.util.Scanner;

public class Main
{
    public static void menuProductos(Bebida beb)
    {
        int opc;
        Scanner puntero = new Scanner(System.in);

        do {
            System.out.println("\n\n-> 1) Refresco\n-> 2) Regresar\n\n");
            System.out.printf("*Ingresa una opción: ");
            opc = puntero.nextInt();

            switch (opc) {
                case 1:
                System.out.println("\n-> Producto: " + beb.product + "\n-> Marca: " + beb.marca + "\n-> Sabor: " + beb.sabor + "\n-> Precio: " + beb.precio + "\n-> Código de barras: " + beb.codBarras + "\n-> Peso neto: " + beb.pesoNeto + "\n-> Caducidad: " + beb.caducidad + "\n");
                    break;
                
                case 2:
                    break;

                default:
                System.out.println("\nINGRESA UNA OPCIÓN CORRECTA.\n\n");
                    break;
            }
        } while (opc != 2);
    }
    public static void main(String [] args)
    {
        int opc;
        Scanner menu = new Scanner(System.in);
        Bebida sprite = new Bebida("Cocacola", "05-05-2025", "ADDBFEWJI23143424564HTRHGTR", "Sprite", 23, "Limón", 500);

        do
        {
            opc = 0;
            System.out.println("==============================\n\tTIENDA UXIONO\n==============================\n\n");
            System.out.println("-> 1) Ver productos\n-> 2) Salir\n");
            System.out.printf("* Ingresa una opción: ");
            opc = menu.nextInt();

            switch (opc) {
                case 1:
                menuProductos(sprite);
                    break;
                
                case 2:
                menu.close();
                    break;

                default:
                    break;
            }
        }while(opc != 2);
    }
}