public class Gusano extends Animal
{
    String fealdad;

    public Gusano(String nombre, String raza, String especie, String orden, String origen, String fealdad)
    {
        super(nombre, raza, especie, orden, origen);
        this.fealdad = fealdad;
    }

    public void comer()
    {
        System.out.println("\n------YO COMO BACTERIAS Y HONGOS-----\n");
    }

    public void dormir()
    {
        System.out.println("\n" + "                                               /~~\\\n" + //
                "  ____                                         /'o  |\n" + //
                ".~  | `\\             ,-~~~\\~-_               ,'  _/'|\n" + //
                "`\\_/   /'\\         /'`\\    \\  ~,             |     .'\n" + //
                "    `,/'  |      ,'_   |   |   |`\\          ,'~~\\  |\n" + //
                "     |   /`:     |  `\\ /~~~~\\ /   |        ,'    `.'\n" + //
                "     | /'  |     |   ,'      `\\  /`|      /'\\    /\n" + //
                "     `|   / \\_ _/ `\\ |         |'   `----\\   |  /'\n" + //
                "      `./'  | ~ |   ,'         |    |     |  |/'\n" + //
                "       `\\   |   /  ,'           `\\ /      |/~'\n" + //
                "         `\\/_ /~ _/               `~------'\n" + //
                "             ~~~~ ");
    }

    public void moverse()
    {
        System.out.println("\n" + "                          (o)(o)\n" + //
                "                          /     \\\n" + //
                "                         /       |\n" + //
                "                        /   \\  * |\n" + //
                "          ________     /    /\\__/\n" + //
                "  _      /        \\   /    /\n" + //
                " / \\    /  ____    \\_/    /\n" + //
                "//\\ \\  /  /    \\         /\n" + //
                "V  \\ \\/  /      \\       /\n" + //
                "    \\___/        \\_____/\n" + //
                "");
    }

    public void hacerRuido()
    {
        System.out.println("\n...\n");
    }

    public void verColor()
    {
        System.out.println("\n-----YO SOY CAFÉ-----\n");
    }
}