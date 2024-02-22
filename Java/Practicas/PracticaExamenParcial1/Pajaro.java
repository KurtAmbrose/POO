public class Pajaro extends Animal
{
    String canto;

    public Pajaro(String nombre, String raza, String especie, String orden, String origen, String canto)
    {
        super(nombre, raza, especie, orden, origen);
        this.canto = canto;
    }

    public void comer()
    {
        System.out.println("\n------YO COMO GUSANOS-----\n");
    }

    public void dormir()
    {
        System.out.println("\n" + "___\n" + //
                "(-,-)\n" + //
                "(   )\n" + //
                "-\"-\"---dwb-");
    }

    public void moverse()
    {
        System.out.println("\n" + "              __\n" + //
                "             /'{>\n" + //
                "         ____) (____\n" + //
                "       //'--;   ;--'\\\\\n" + //
                "      ///////\\_/\\\\\\\\\\\\\\\n" + //
                "             m m\n" + //
                "");
    }

    public void hacerRuido()
    {
        System.out.println("\n-----PIO PIO PIOOOOOO------\n");
    }

    public void verColor()
    {
        System.out.println("\n-----YO SOY AMARILLO-----\n");
    }
}