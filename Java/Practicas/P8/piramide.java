public class piramide
{
    public static void main(String[] args)
    {
        int i, espacios, asteriscos;

        if(args.length != 1)
        {
            System.err.println("Uso: piramide <tamaño>");
            System.exit(1); //Ayuda al progrqma a salir con error y dejar de ejecutarse
        }
        else
        {
            for(i=0; i < Integer.parseInt(args[0]); i++)
            {
                for(espacios=0; espacios < Integer.parseInt(args[0]) - i; espacios++)
                {
                    System.out.printf(" ");
                }

                for(asteriscos=0; asteriscos < (i * 2) - 1; asteriscos++)
                {
                    System.out.printf("*");
                }
                
                System.out.println();
            }
        }
    }
}