/*Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita desglosar dicha
cantidad en los billetes de curso legal en el País. Recuerde que estos son: 50000, 20000, 10000,
5000, 2000, 1000, 500, 100, 50, 20, 10. */

public class Ejercicio_36 {

    public static void main(String[] args) {

        int cantidad;
        int billete;

        System.out.println("Ingrese la cantidad de dinero");
        cantidad = Integer.parseInt(System.console().readLine());

        billete = cantidad / 50000;

        if (billete > 0) {

            if (billete > 0)
                System.out.println("Billetes de 50000: " + billete);

            cantidad = cantidad % 50000;
        }

        billete = cantidad / 20000;

        if (billete > 0) {
            System.out.println("Billetes de 20000: " + billete);
            cantidad = cantidad % 20000;
        }

        billete = cantidad / 10000;

        if (billete > 0) {
            System.out.println("Billetes de 10000: " + billete);
            cantidad = cantidad % 10000;
        }

        billete = cantidad / 5000;

        if (billete > 0) {
            System.out.println("Billetes de 5000: " + billete);
            cantidad = cantidad % 5000;
        }

        billete = cantidad / 2000;

        if (billete > 0) {
            System.out.println("Billetes de 2000: " + billete);
            cantidad = cantidad % 2000;
        }

        billete = cantidad / 1000;

        if (billete > 0) {
            System.out.println("Billetes de 1000: " + billete);
            cantidad = cantidad % 1000;
        }

        billete = cantidad / 500;

        if (billete > 0) {
            System.out.println("Billetes de 500: " + billete);
            cantidad = cantidad % 500;
        }

        billete = cantidad / 100;

        if (billete > 0) {
            System.out.println("Billetes de 100: " + billete);
            cantidad = cantidad % 100;
        }

        billete = cantidad / 50;

        if (billete > 0) {
            System.out.println("Billetes de 50: " + billete);
            cantidad = cantidad % 50;
        }

        billete = cantidad / 20;

        if (billete > 0) {
            System.out.println("Billetes de 20: " + billete);
            cantidad = cantidad % 20;
        }

        billete = cantidad / 10;

        if (billete > 0) {
            System.out.println("Billetes de 10: " + billete);
        }
    }
}