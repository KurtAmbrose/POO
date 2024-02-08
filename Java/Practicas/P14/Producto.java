import java.util.Scanner;

public class Producto
{
    String marca, caducidad, codBarras, product;
    float precio;

    Scanner scan = new Scanner(System.in);

    public Producto(String marca, String caducidad, String codBarras, String product, float precio)
    {
        this.marca = marca;
        this.caducidad = caducidad;
        this.codBarras = codBarras;
        this.precio = precio;
        this.product = product; 
    }

    public void registrarProducto()
    {
        System.out.printf("\n-> Ingresa el nombre del producto: ");
        product = scan.nextLine();
        System.out.printf("\n-> Ingresa la marca del producto: ");
        marca = scan.nextLine();
        System.out.printf("\n-> Ingresa el código de barras del producto: ");
        codBarras = scan.nextLine();
        System.out.printf("\n-> Ingresa la fecha de caducidad del producto: ");
        caducidad = scan.nextLine();
        System.out.printf("\n-> Ingresa el precio del producto: ");
        precio = scan.nextFloat();
    }
}