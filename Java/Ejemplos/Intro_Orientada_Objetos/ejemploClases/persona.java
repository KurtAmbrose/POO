public class persona
{
    public static void main(String[] args) 
    {
        
        datos negro = new datos(); //CREACIÓN DE UN OBJETO, MI PRIMER OBJETO (datos es la clase y per es el objeto)

        negro.pedirNombre(); // Objeto per se comunica con el método pedirNombre
        negro.pedirEdad(); // Objeto per se comunica con el método pedirEdad
        
        if(negro.regresarEdad() >= 18)
        {
            System.out.println("\n Negro llamdo " + negro.regresarNombre() + ", usted es mayor de edad :)\n\n");
        }
        else
        {
            if(negro.regresarEdad() < 18 && negro.regresarEdad() > 0)
            {
                System.out.println("\n Negro llamdo " + negro.regresarNombre() + ", usted es menor de edad :)\n\n");
            }
            else
            {
                System.out.println("\n Negro llamdo " + negro.regresarNombre() + ", usted no ha nacido :]\n\n");
            }
        }
    }
}