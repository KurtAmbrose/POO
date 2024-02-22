public class Gato extends Animal
{
    String humor;

    public Gato(String nombre, String raza, String especie, String orden, String origen, String humor)
    {
        super(nombre, raza, especie, orden, origen);
        this.humor = humor;
    }

    public void comer()
    {
        System.out.println("\n------YO COMO RATONES Y PESCADOS-----\n");
    }

    public void dormir()
    {
        System.out.println("\n" + "      |\\      _,,,---,,_\n" + //
                "ZZZzz /,`.-'`'    -.  ;-;;,_\n" + //
                "     |,4-  ) )-,_. ,\\ (  `'-'\n" + //
                "    '---''(_/--'  `-'\\_)  Felix Lee ");
    }

    public void moverse()
    {
        System.out.println("_._     _,-'\"\"`-._\n" + //
                "(,-.`._,'(       |\\`-/|\n" + //
                "    `-.-' \\ )-`( , o o)\n" + //
                "          `-    \\`_`\"'-");
    }

    public void hacerRuido()
    {
        System.out.println("\n-----MIAUUUUUUUUUU------\n");
    }

    public void verColor()
    {
        System.out.println("\n-----YO SOY NEGRO-----\n");
    }
}