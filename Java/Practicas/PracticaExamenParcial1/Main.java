import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int opc;

        Scanner scan = new Scanner(System.in);
        Perro golden = new Perro("Pepe", "Golden retriver", "C. Familiaris", "Carnívoro", "Inglaterra", 10);
        Gato siames = new Gato("Juan", "Siames", "Felis catus", "Carnívoro", "Irán", "De la chin-");
        Pez atun = new Pez("Fido", "Atún", "Cordadus", "Carnívoro", "Mediterraneo");
        Pajaro tortolito = new Pajaro("Jairo", "Tórtolito", "Columbiana talpacoti", "Carnívoro", "Norteamérica", "Bonito");
        Gusano uno = new Gusano("Allberto", "una random", "No sé", "EL que sea", "???", "No tanta :,)");    

            System.out.println("====================\n\tAnimales del examen\n====================");
            System.out.println("\n-> 1) Perro\n-> 2) Gato\n-> 3) Pez\n-> 4) Gusano\n-> 5) Pájaro\n-> 6) Salir\n\n");
            System.out.printf("*Ingresa una opción: ");

            opc = scan.nextInt();

        switch (opc) {

            case 1:
                System.out.println(golden.nombre + "\n" + golden.especie + "\n" + golden.raza + "\n" + golden.orden + "\n" + golden.origen + "\n" + golden.cantidadSurradas);
                golden.comer();
                golden.dormir();
                golden.hacerRuido();
                golden.moverse();
                golden.verColor();
                break;
            
            case 2:
                System.out.println(siames.nombre + "\n" + siames.especie + "\n" + siames.raza + "\n" + siames.orden + "\n" + siames.origen + "\n" + siames.humor);
                siames.comer();
                siames.dormir();
                siames.hacerRuido();
                siames.moverse();
                siames.verColor();
                break;
            case 3:
                System.out.println(atun.nombre + "\n" + atun.especie + "\n" + atun.raza + "\n" + atun.orden + "\n" + atun.origen + "\n");
                atun.comer();
                atun.dormir();
                atun.hacerRuido();
                atun.moverse();
                atun.verColor();
                break;
            case 4:
                System.out.println(uno.nombre + "\n" + uno.especie + "\n" + uno.raza + "\n" + uno.orden + "\n" + uno.origen + "\n" + uno.fealdad);
                uno.comer();
                uno.dormir();
                uno.hacerRuido();
                uno.moverse();
                uno.verColor();
                break;
            case 5:
                System.out.println(tortolito.nombre + "\n" + tortolito.especie + "\n" + tortolito.raza + "\n" + tortolito.orden + "\n" + tortolito.origen + "\n" + tortolito.canto);
                tortolito.comer();
                tortolito.dormir();
                tortolito.hacerRuido();
                tortolito.moverse();
                tortolito.verColor();
                break;
            
            case 6:
                break;
        
            default:
                break;
        }
    }
}