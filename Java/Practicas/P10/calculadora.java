public class calculadora
{

    public static double elevar(double num1, double num2)
    {
        return Math.pow(num1, num2);
    }

    public static float dividir(float num1, float num2)
    {
        return num1 / num2;
    }

    public static float restar(float num1, float num2)
    {
        return num1 - num2;
    }

    public static float sumar(float num1, float num2)
    {
        return num1 + num2;
    }

    public static float multiplicar(float num1, float num2)
    {
        return num1 * num2;
    }
    public static void main(String [] args)
    {
        float res;
        double res2;
        char opc;

        if(args.length != 3)
        {
            System.err.println("Usage: calculadora <operacion> <número 1> <número 2>");
            System.exit(1);
        }
        else
        {
            if((!args[0].equals("multiplica")) && (!args[0].equals("divide")) && (!args[0].equals("suma")) && (!args[0].equals("resta")) && (!args[0].equals("eleva")))
            {
                System.err.println("Usage: calculadora <multiplica/divide/suma/resta/eleva> <número 1> <número 2>");
                System.exit(1);
            }

            else
            {
                if(args[0].equals("multiplica"))
                {
                    opc = 'm';
                }
                else if(args[0].equals("suma"))
                {
                    opc = 's';
                }
                else if(args[0].equals("resta"))
                {
                    opc = 'r';
                }
                else if(args[0].equals("divide"))
                {
                    opc = 'd';
                }
                else
                {
                    opc = 'e';
                }

                System.out.println("===================================\n\tRESULTADO\n===================================");

                switch(opc)
                {
                    case 'm':
                        res = multiplicar(Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                        System.out.println("\nEL resultado de la multiplicación es: " + res + "\n");
                        break;
                    
                    case 's':
                        res = sumar(Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                        System.out.println("\nEL resultado de la suma es: " + res + "\n");
                    break;

                    case 'r':
                        res = restar(Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                        System.out.println("\nEL resultado de la resta es: " + res + "\n");
                    break;

                    case 'd':
                        res = dividir(Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                        System.out.println("\nEL resultado de la división es: " + res + "\n");
                    break;

                    case 'e':
                        res2 = elevar(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
                        System.out.println("\nEL resultado de la potencia es: " + res2 + "\n");
                    break;

                    default:
                        System.out.println("\nYou stupid nigg-");
                        break;
                }
            }
        }
    }
}
