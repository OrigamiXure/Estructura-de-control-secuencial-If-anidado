/*Una empresa quiere hacer una compra de varias piezas de la misma clase a un fabricante de
refacciones. La empresa dependiendo del monto total de la compra, decidirá qué hacer para pagar
al fabricante. Si el monto total de la compra excede de $500000 la empresa tendrá la capacidad
de invertir de su propio dinero un 55% del monto de la compra, pedir presta al banco un 30% y el
resto lo pagará solicitando un crédito al fabricante. Si el monto total de la compra no excede de
$500000 la empresa tendrá capacidad de invertir de su propio dinero un 70% y el restante 30% lo
pagará solicitando crédito al fabricante. El fabricante cobra por concepto de intereses un 20%
sobre la cantidad que se le pague a crédito. Calcule y muestre la cantidad a invertir de los fondos
de la empresa, la cantidad a pagar a crédito, el monto a pagar por intereses y si es necesario, la
cantidad prestada al banco. */

public class Ejercicio_28{

    public static void main(String[] args) {

        float compra;
        float fondos;
        float banco;
        float credito;
        float intereses;

        System.out.println("Ingrese el monto de la compra");
        compra = Float.parseFloat(System.console().readLine());

        if (compra > 500000) {
                fondos = compra * 0.55f;
                banco = compra * 0.30f;
                credito = compra * 0.15f;

            }else {

            fondos = compra * 0.70f;
            banco = 0;
            credito = compra * 0.30f;
        }

        intereses = credito * 0.20f;

        System.out.println("Fondos de la empresa: " + fondos);
        System.out.println("Prestamo del banco: " + banco);
        System.out.println("Credito del fabricante: " + credito);
        System.out.println("Intereses: " + intereses);
    }
}