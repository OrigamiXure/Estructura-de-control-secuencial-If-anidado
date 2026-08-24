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
        int opcion;

        System.out.println("Lectura anterior");
        lectura_anterior = Float.parseFloat(System.console().readLine());

        System.out.println("Lectura actual");
        lectura_actual = Float.parseFloat(System.console().readLine());

        consumo = lectura_actual - lectura_anterior;

        if (consumo <= 100)
            opcion = 1;
        else if (consumo <= 300)
            opcion = 2;
        else if (consumo <= 500)
            opcion = 3;
        else
            opcion = 4;

        switch (opcion) {

            case 1:
                tarifa = 2622;
                break;

            case 2:
                tarifa = 79.78f;
                break;

            case 3:
                tarifa = 89.52f;
                break;

            case 4:
                tarifa = 97.95f;
                break;
        }

        System.out.println("Consumo: " + consumo);
        System.out.println("Total: " + consumo * tarifa + " Bs");
    }
}