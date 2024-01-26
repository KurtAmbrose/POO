public class verificaEdad
{
    public static void main (String [] args)
    {
        if(args.length != 1)
        {
            System.err.println("Uso: verificaEdad <edad>");
            System.exit(1);
        }

        if(Integer.parseInt(args[0]) >= 18)
        {
            System.out.println("\n\nUSTED ES MAYOR DE EDAD, PAPU\n\n");
        }
        else
        {
            if(Integer.parseInt(args[0]) < 18 && Integer.parseInt(args[0]) > 0)
            {
                System.out.println("\n\nUSTED ES MENOR DE EDAD, PAPU\n\n");
            }
            else
            {
                System.out.println("\n\nUSTED NO HA NACIDO, YOU STUPID NIGG-\n\n");
            }
        }
    }
}