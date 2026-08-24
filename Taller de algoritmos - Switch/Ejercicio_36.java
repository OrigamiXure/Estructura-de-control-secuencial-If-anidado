/*Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita desglosar dicha
cantidad en los billetes de curso legal en el País. Recuerde que estos son: 50000, 20000, 10000,
5000, 2000, 1000, 500, 100, 50, 20, 10. */

public class Ejercicio_36 {

    public static void main(String[] args) {

        int cantidad;
        int opcion;

        System.out.println("Ingrese la cantidad");
        cantidad = Integer.parseInt(System.console().readLine());

        opcion = 1;

        switch (opcion) {

            case 1:
                if (cantidad >= 50000) {
                    System.out.println("Billetes de 50000: " + cantidad / 50000);
                    cantidad = cantidad % 50000;
                }
                opcion = 2;

            case 2:
                if (cantidad >= 20000) {
                    System.out.println("Billetes de 20000: " + cantidad / 20000);
                    cantidad = cantidad % 20000;
                }
                opcion = 3;

            case 3:
                if (cantidad >= 10000) {
                    System.out.println("Billetes de 10000: " + cantidad / 10000);
                    cantidad = cantidad % 10000;
                }
                opcion = 4;

            case 4:
                if (cantidad >= 5000) {
                    System.out.println("Billetes de 5000: " + cantidad / 5000);
                    cantidad = cantidad % 5000;
                }
                opcion = 5;

            case 5:
                if (cantidad >= 2000) {
                    System.out.println("Billetes de 2000: " + cantidad / 2000);
                    cantidad = cantidad % 2000;
                }
                opcion = 6;

            case 6:
                if (cantidad >= 1000) {
                    System.out.println("Billetes de 1000: " + cantidad / 1000);
                    cantidad = cantidad % 1000;
                }
                opcion = 7;

            case 7:
                if (cantidad >= 500) {
                    System.out.println("Billetes de 500: " + cantidad / 500);
                    cantidad = cantidad % 500;
                }
                opcion = 8;

            case 8:
                if (cantidad >= 100) {
                    System.out.println("Billetes de 100: " + cantidad / 100);
                    cantidad = cantidad % 100;
                }
                opcion = 9;

            case 9:
                if (cantidad >= 50) {
                    System.out.println("Billetes de 50: " + cantidad / 50);
                    cantidad = cantidad % 50;
                }
                opcion = 10;

            case 10:
                if (cantidad >= 20) {
                    System.out.println("Billetes de 20: " + cantidad / 20);
                    cantidad = cantidad % 20;
                }
                opcion = 11;

            case 11:
                if (cantidad >= 10) {
                    System.out.println("Billetes de 10: " + cantidad / 10);
                }
                break;
        }
    }
}