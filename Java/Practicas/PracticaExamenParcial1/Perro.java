public class Perro extends Animal
{
    int cantidadSurradas;

    public Perro(String nombre, String raza, String especie, String orden, String origen, int cantidadSurradas)
    {
        super(nombre, raza, especie, orden, origen);
        this.cantidadSurradas = cantidadSurradas;
    }

    public void comer()
    {
        System.out.println("\n------YO COMO CROQUETAS Y CARNE DE RES-----\n");
    }

    public void dormir()
    {
        System.out.println("\n" + " __    __\n" + //
                "o-''))_____\\\\\n" + //
                "\"--__/ * * * )\n" + //
                "c_c__/-c____/");
    }

    public void moverse()
    {
        System.out.println("\n" + "             .--~~,__\n" + //
                ":-....,-------`~~'._.'\n" + //
                " `-,,,  ,_      ;'~U'\n" + //
                "  _,-' ,'`-__; '--.\n" + //
                " (_/'~~      ''''(;\n" + //
                "");
    }

    public void hacerRuido()
    {
        System.out.println("\n-----GUAU GUAU GUAU------\n");
    }

    public void verColor()
    {
        System.out.println("\n-----YO SOY NEGRO-----\n");
    }
}