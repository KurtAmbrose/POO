public class Pez extends Animal
{
    public Pez(String nombre, String raza, String especie, String orden, String origen)
    {
        super(nombre, raza, especie, orden, origen);
    }

    public void comer()
    {
        System.out.println("\n------YO COMO PLANGTON-----\n");
    }

    public void dormir()
    {
        System.out.println("\n" + "/\"*._         _\n" + //
                "      .-*'`    `*-.._.-'/\n" + //
                "    < * ))     ,       ( \n" + //
                "      `*-._`._(__.--*\"`.\\");
    }

    public void moverse()
    {
        System.out.println("\n" + "    O  o\n" + //
                "          _\\_   o\n" + //
                ">('>   \\\\/  o\\ .\n" + //
                "       //\\___=\n" + //
                "          ''");
    }

    public void hacerRuido()
    {
        System.out.println("\n...\n");
    }

    public void verColor()
    {
        System.out.println("\n-----YO SOY MULTICOLOR-----\n");
    }
}