/*Confeccionar un algoritmo que permita resolver una ecuación de segundo grado, de la forma:
AX2+BX+C = 0, sabiendo que el discriminante (D) se calcula con la fórmula: D= Bˆ2­4*A*C. El valor
obtenido se evalúa y se aplica la fórmula correspondiente, según muestra la siguiente tabla:
Valor del discriminante Fórmula a utilizar
Si D = 0 entonces X1 = X2 = -B/(2*a)
Si D > 0 entonces X1 = (-B + SQRT(Bˆ2­4*A*C))/(2*A) X2 = (-B - SQRT(Bˆ2­4*A*C))/(2*A)
Sí D < 0 entonces no tiene solucion en los reales */

public class Ejercicio_45 {

    public static void main(String[] args) {

        float A;
        float B;
        float C;
        float D;
        float X1;
        float X2;

        System.out.println("Ingrese A");
        A = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese B");
        B = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese C");
        C = Float.parseFloat(System.console().readLine());

        D = B * B - 4 * A * C;

        if (D >= 0) {

            if (D == 0) {

                X1 = -B / (2 * A);
                X2 = X1;

                System.out.println("X1 = " + X1);
                System.out.println("X2 = " + X2);

            } else {

                X1 = (-B + (float)Math.sqrt(D)) / (2 * A);
                X2 = (-B - (float)Math.sqrt(D)) / (2 * A);

                System.out.println("X1 = " + X1);
                System.out.println("X2 = " + X2);
            }

        } else {

            System.out.println("La ecuacion no tiene solucion en los reales");
        }
    }
}