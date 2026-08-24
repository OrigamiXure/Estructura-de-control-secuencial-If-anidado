/*en una tienda efectúan un descuento a los clientes dependiendo del monto de la compra. El
descuento se efectúa con base en el siguiente criterio:
a. Si el monto es inferior a $500, no hay descuento.
b. Si está comprendido entre $500 y $1000 inclusive, se hace un descuento del 5%
c. Si está comprendido entre $1000 y $7000 inclusive, se hace un descuento del 11%
d. Si está comprendido entre $7000 y $15000 inclusive, el descuento es del
18%

5

e. Si el monto es mayor a $15000, hay un 25% de descuento.
Calcule y muestre el nombre del cliente, el monto de la compra, monto a pagar y descuento recibido. */

public class Ejercicio_33 {

    public static void main(String[] args) {

        String nombre;
        float compra;
        float descuento = 0;
        int opcion;

        System.out.println("Ingrese el nombre");
        nombre = System.console().readLine();

        System.out.println("Ingrese la compra");
        compra = Float.parseFloat(System.console().readLine());

        if (compra < 500)
            opcion = 1;
        else if (compra <= 1000)
            opcion = 2;
        else if (compra <= 7000)
            opcion = 3;
        else if (compra <= 15000)
            opcion = 4;
        else
            opcion = 5;

        switch (opcion) {

            case 1:
                descuento = 0;
                break;

            case 2:
                descuento = 0.05f;
                break;

            case 3:
                descuento = 0.11f;
                break;

            case 4:
                descuento = 0.18f;
                break;

            case 5:
                descuento = 0.25f;
                break;
        }

        System.out.println("Cliente: " + nombre);
        System.out.println("Compra: " + compra);
        System.out.println("Descuento: " + compra * descuento);
        System.out.println("Total: " + (compra - compra * descuento));
    }
}