/*Desarrolle un programa que calcule y muestre el monto que debe pagar un suscriptor por concepto
de consumo de luz eléctrica y servicio de aseo urbano. Dicho monto se calcula multiplicando la
diferencia de la lectura anterior y la lectura actual por el costo de cada Kilovatio hora, según la
siguiente escala:
0 - 100 2.622,00 Bs.
101 - 300 79,78 Bs. / Kwh
301 – 500 89,52 Bs. /Kwh
501 – en adelante 97,95 Bs. / Khw */

public class Ejercicio_40 {

    public static void main(String[] args) {

        float lectura_anterior;
        float lectura_actual;
        float consumo;
        float tarifa = 0;

        System.out.println("Lectura anterior");
        lectura_anterior = Float.parseFloat(System.console().readLine());

        System.out.println("Lectura actual");
        lectura_actual = Float.parseFloat(System.console().readLine());

        consumo = lectura_actual - lectura_anterior;

        if (consumo >= 0 && consumo <= 100)
            tarifa = 2622;

        if (consumo > 100 && consumo <= 300)
            tarifa = 79.78f;

        if (consumo > 300 && consumo <= 500)
            tarifa = 89.52f;

        if (consumo > 500 && consumo > 0)
            tarifa = 97.95f;

        System.out.println("Consumo: " + consumo);
        System.out.println("Total: " + consumo * tarifa + " Bs");
    }
}