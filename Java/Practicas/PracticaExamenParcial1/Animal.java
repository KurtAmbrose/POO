public class Animal
{
    String nombre, especie, orden, raza, origen;

    public Animal(String nombre, String raza, String especie, String orden, String origen)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.orden = orden;
        this.raza = raza;
        this.origen = origen;
    }

    public void comer()
    {
        System.out.println("\n------YO COMO COMIDA-----\n");
    }

    public void dormir()
    {
        System.out.println("\n------YO DUERMO MUCHO-----\n");
    }

    public void moverse()
    {
        System.out.println("\n------YO ME MUEVO DE UNA MANERA-----\n");
    }

    public void hacerRuido()
    {
        System.out.println("\n-----AHHHHHHHHHHHHHHHHHHHHHHHHHH------\n");
    }

    public void verColor()
    {
        System.out.println("\n-----YO SOY BLANCO XD-----\n");
    }
}