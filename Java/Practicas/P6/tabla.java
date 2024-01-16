
public class tabla
{
    public static void main (String [] args)
    {
        int i, res;

        if(args.length != 1)
        {
            System.err.println("Uso: tabla <número>");

            System.exit(1);
        }
        else
        {
            for(i=0; i<11; i++)
            {
                res = i * Integer.parseInt(args[0]);
                System.out.println(args[0] + " X " + i + " = " + res);
            }
        }
    }
}