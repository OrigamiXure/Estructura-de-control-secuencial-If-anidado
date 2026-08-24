/*Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita desglosar dicha
cantidad en los billetes de curso legal en el País. Recuerde que estos son: 50000, 20000, 10000,
5000, 2000, 1000, 500, 100, 50, 20, 10. */

public class Ejercicio_36 {

    public static void main(String[] args) {

        int cantidad;

        System.out.println("Ingrese la cantidad");
        cantidad = Integer.parseInt(System.console().readLine());

        if (cantidad >= 50000 && cantidad > 0) {
            System.out.println("Billetes de 50000: " + cantidad / 50000);
            cantidad = cantidad % 50000;
        }

        if (cantidad >= 20000 && cantidad > 0) {
            System.out.println("Billetes de 20000: " + cantidad / 20000);
            cantidad = cantidad % 20000;
        }

        if (cantidad >= 10000 && cantidad > 0) {
            System.out.println("Billetes de 10000: " + cantidad / 10000);
            cantidad = cantidad % 10000;
        }

        if (cantidad >= 5000 && cantidad > 0) {
            System.out.println("Billetes de 5000: " + cantidad / 5000);
            cantidad = cantidad % 5000;
        }

        if (cantidad >= 2000 && cantidad > 0) {
            System.out.println("Billetes de 2000: " + cantidad / 2000);
            cantidad = cantidad % 2000;
        }

        if (cantidad >= 1000 && cantidad > 0) {
            System.out.println("Billetes de 1000: " + cantidad / 1000);
            cantidad = cantidad % 1000;
        }

        if (cantidad >= 500 && cantidad > 0) {
            System.out.println("Billetes de 500: " + cantidad / 500);
            cantidad = cantidad % 500;
        }

        if (cantidad >= 100 && cantidad > 0) {
            System.out.println("Billetes de 100: " + cantidad / 100);
            cantidad = cantidad % 100;
        }

        if (cantidad >= 50 && cantidad > 0) {
            System.out.println("Billetes de 50: " + cantidad / 50);
            cantidad = cantidad % 50;
        }

        if (cantidad >= 20 && cantidad > 0) {
            System.out.println("Billetes de 20: " + cantidad / 20);
            cantidad = cantidad % 20;
        }

        if (cantidad >= 10 && cantidad > 0) {
            System.out.println("Billetes de 10: " + cantidad / 10);
        }
    }
}