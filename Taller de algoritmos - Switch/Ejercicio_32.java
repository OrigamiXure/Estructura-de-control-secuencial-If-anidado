/*Dados como datos los valores enteros P y Q, determine si los mismos satisfacen la siguiente
expresión: P3 + Q4 – 2*P2 > 680. En caso afirmativo debe mostrar los valores de P y Q, de lo contrario
muestre un mensaje alusivo al hecho. */

public class Ejercicio_32 {

    public static void main(String[] args) {

        int P, Q, opcion;
        float resultado;

        System.out.println("Ingrese P");
        P = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese Q");
        Q = Integer.parseInt(System.console().readLine());

        resultado = P * P * P + Q * Q * Q * Q - 2 * P * P;

        if (resultado > 680)
            opcion = 1;
        else
            opcion = 2;

        switch (opcion) {

            case 1:
                System.out.println("P = " + P);
                System.out.println("Q = " + Q);
                break;

            case 2:
                System.out.println("Los valores no satisfacen la expresion");
                break;
        }
    }
}