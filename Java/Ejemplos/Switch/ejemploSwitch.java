import java.util.Scanner;

public class ejemploSwitch
{
    public static void main (String[]arg)
    {
        int opcion;

        Scanner scan = new Scanner(System.in);

        do 
        {
            System.out.println("====================");
            System.out.println(" Menú de alimentos");
            System.out.println("====================");

            System.out.println("\n-> Comidas\t\t\t-> Bebidas");
            System.out.println("1) Hamburguesa de pollo\t\t* Refrescos (Cocacola, Fanta ó Sprite)");
            System.out.println("2) Nuggets\t\t\t* Agua de sabor (horchata, jamaica ó tamarindo)");
            System.out.println("3) Papas a la francesa\t\t* Agua natural");
            System.out.println("4) Pizza\t\t* Cerveza de barril");
            System.out.println("5) Tacos al pastor\t\t* Cerveza bien fría");

            System.out.printf("\n\n-> Ingresa una opción: ");

            opcion = scan.nextInt();

            switch (opcion) 
            {
                case 1:
                System.out.println("\n\n-> Elegiste la opción " + opcion + "\n\n");
                    break;
                
                case 2:
                System.out.println("\n\n-> Elegiste la opción " + opcion + "\n\n");
                    break;
                
                case 3:
                System.out.println("\n\nElegiste la opción " + opcion + "\n\n");
                    break;
                
                case 4:
                System.out.println("\n\n-> Elegiste la opción " + opcion + "\n\n");
                    break;

                case 5:
                System.out.println("\n\n-> Elegiste la opción " + opcion + "\n\n");
                    break;
            
                default:
                System.out.println("\n\nIngresa una opción correcta\n\n");
                    break;
            }
        }while(opcion > 5);

        scan.close();
    }
}