public class Bebida extends Producto
{
    String sabor;
    float pesoNeto;

    public Bebida(String marca, String caducidad, String codBarras, String product, float precio, String sabor, float pesoNeto)
    {
        super(marca, caducidad, codBarras, product, precio);
        this.sabor = sabor;
        this.pesoNeto = pesoNeto;
    }

    public void registrarBebida()
    {
        System.out.printf("\n-> Ingresa el sabor de la bebida: ");
        sabor = scan.nextLine();
        System.out.printf("\n-> Ingresa el peso neto del producto: ");
        pesoNeto = scan.nextFloat();
        scan.close();
    }
}