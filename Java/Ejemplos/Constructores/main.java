public class main
{
    public static void main(String [] args)
    {
        persona juan = new persona(null, null, 0);

        juan.pedirDatos();

        System.out.println("\n\nNombre: " + juan.nombre + "\nApellido: " + juan.apellido + "\nEdad: " + juan.edad + "\n\n");
    }
}