public class triangulo
{
    public static void main (String [] args)
    {
        int i, j;

        if(args.length != 1)
        {
            System.err.println("Uso: triangulo <cantidad de lados>");
            System.exit(1);
        }
        
        else
        {
            for(i = 0; i < Integer.parseInt(args[0]); i++) //Integer.parseInt(); ayuda a pasar de cadena a entero
            {
                for(j = 0; j <= i; j++)
                {
                    System.out.printf("*");
                }

                System.out.printf("\n");
            }
        }
    }
}