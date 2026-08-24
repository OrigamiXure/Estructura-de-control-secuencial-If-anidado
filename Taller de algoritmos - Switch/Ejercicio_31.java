/*Una compañía de alquiler de automóviles sin conductor, desea calcular y mostrar lo que debe pagar
cada cliente, de acuerdo a las siguientes condiciones:
a. Si no se rebasan los 300 km, se cancelan 5000 Bolívares
b. Si la distancia recorrida es superior a 300 km
 Pero inferior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro
superior a 300.
 Si es superior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro,
para las distancias entre 300 y 1000 kilómetros y 150 Bolívares por cada kilómetro para
las distancias mayores a 1000. */

public class Ejercicio_31 {

    public static void main(String[] args) {

        float kilometros;
        float pago = 0;
        int opcion;

        System.out.println("Ingrese los kilometros");
        kilometros = Float.parseFloat(System.console().readLine());

        if (kilometros <= 300)
            opcion = 1;
        else if (kilometros <= 1000)
            opcion = 2;
        else
            opcion = 3;

        switch (opcion) {

            case 1:
                pago = 5000;
                break;

            case 2:
                pago = 5000 + (kilometros - 300) * 200;
                break;

            case 3:
                pago = 5000 + 700 * 200 + (kilometros - 1000) * 150;
                break;
        }

        System.out.println("Total a pagar: " + pago + " Bs");
    }
}