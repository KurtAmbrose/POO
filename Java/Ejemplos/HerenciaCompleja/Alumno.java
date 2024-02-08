public class Alumno extends Persona
{
    int cuenta;
    float promedioGen;
    String carrera;

    public void pedirInfoAlumno()
    {
        System.out.printf("\n-> Ingresa el número de cuenta: ");
        cuenta = scan.nextInt();
        System.out.printf("\n-> Ingresa el promedio general: ");
        promedioGen = scan.nextFloat();
        scan.nextLine();
        System.out.printf("\n-> Ingresa la carrera: ");
        carrera = scan.nextLine();
    }

    public void mostrarDatosAlumno()
    {
        System.out.println("-> NUM. DE CUENTA: " + cuenta + "\n-> PROM. GENERAL: " + promedioGen + "\n-> CARRERA: " + carrera + "\n");
    }
}