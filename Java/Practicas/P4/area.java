/**
 * Programa que calcula el area y perimetro de distintas figuras
 * El usuario debe de agregar el nombre de la figura la cual desea saber el area, las figuras disponibles son estas:
 *  a) Triángulo
 *  b) Cuadrado
 *  c) Rectangulo
 *  d) Círculo
 * Eventualmente el programa le preguntará los datos necesarios y finalmente arrojará el área como resultado
 * 
 * @author Elaborado por Diego Bravo Pérez
 * @version 1.0
 * 
 * Elaborado el día 13 de Enero del 2024
 * 
 * Última modificación el día 14 de Enero del 2023
 */


import java.util.Scanner;

public class area
{

    /**
     * Función que calcula el área de un círculo
     * El programa le solicita al usuario el valor del diámetro, luego calcula el área y devuelve el valor de esta misma
     * @param valores
     * @return res
     * @author Diego Bravo Pérez
     */

    public static double areaCirculo(Scanner valores)
    {
        double diametro, res = 0;

        System.out.printf("\n->Ingresa el valor del diámetro: ");
        diametro = valores.nextDouble();

        res = Math.PI * Math.pow((diametro/2), 2); //Math.PI te da el valor de Pi y con Math.pow se eleva una base al exponente que se deseé.

        return res;
    }

    /**
     * Función que calcula el área de un cuadrado
     * El programa le solicita al usuario el valor de un lado, luego calcula el área y devuelve el valor de esta misma
     * @param valores
     * @return res
     * @author Diego Bravo Pérez
     */

    public static double areaCuadrado(Scanner valores)
    {
        double lado, res = 0;

        System.out.printf("\n->Ingresa el valor de un lado: ");
        lado = valores.nextDouble();

        res = Math.pow(lado, 2);

        return res;
    }
    
    /**
     * Función que calcula el área de un rectángulo
     * El programa le solicita al usuario el valor de la base y la altura, luego calcula el área y devuelve el valor de esta misma
     * @param valores
     * @return res
     * @author Diego Bravo Pérez
     */

    public static double areaRectangulo(Scanner valores)
    {
        double base, altura;
        double res = 0;

        System.out.printf("\n->Ingresa el valor de la base: ");
        base = valores.nextDouble();
        System.out.printf("\n->Ingresa el valor de la altura: ");
        altura = valores.nextDouble();

        res = base * altura;

        return res;
    }

    /**
     * Función que calcula el área de un triángulo
     * El programa le solicita al usuario el valor de la base y la altura, luego calcula el área y devuelve el valor de esta misma
     * @param valores
     * @return res
     * @author Diego Bravo Pérez
     */

    public static double areaTriangulo(Scanner valores) {

        double base, altura;
        double res = 0;

        System.out.printf("\n->Ingresa el valor de la base: ");
        base = valores.nextDouble();
        System.out.printf("\n->Ingresa el valor de la altura: ");
        altura = valores.nextDouble();

        res = (base * altura)/2;

        return res;
    }

    /**
     * Función principal del programa
     * Aquí es donde se opera todo
     * @param args
     * @author Diego Bravo Pérez
     */
    public static void main (String [] args)
    {
        double resultado;
        Scanner valores = new Scanner(System.in);

        //valida si los parametros de entrada son suficientes para ejecutar el programa
        if (args.length != 1)
        {
            System.err.println("\nUso: area <triángulo/cuadrado/rectángulo/círculo>\n");

            System.exit(1);
        }
        else
        {
            //args[0] es la figura a la cual se le va a hallar el área

            System.out.println("\n==============================================\n\t\tÁREA DEL " + args[0].toUpperCase() + "\n==============================================\n\n");

            switch (args[0]) 
            {
                case "triángulo":

                resultado = areaTriangulo(valores);

                System.out.println("\n\t* El área del " + args[0] + " es = " + resultado + " u²\n");
                    
                    break;

                case "rectángulo":

                resultado = areaRectangulo(valores);

                System.out.println("\n\t* El área del " + args[0] + " es = " + resultado + " u²\n");

                    break;

                case "cuadrado":

                resultado = areaCuadrado(valores);

                System.out.println("\n\t* El área del " + args[0] + " es = " + resultado + " u²\n");

                    break;

                case "círculo":

                resultado = areaCirculo(valores);

                System.out.println("\n\t* El área del " + args[0] + " es = " + resultado + " u²\n");

                    break;
            
                default:

                System.err.println("\nUso: area <triángulo/cuadrado/rectángulo/círculo>\n");

                    break;
            }
        }
    }
}