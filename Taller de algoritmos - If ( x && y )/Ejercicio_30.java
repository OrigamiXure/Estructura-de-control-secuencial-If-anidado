/*Se tienen 4 dígitos en las variables A, B, C, D que forman un entero positivo N. Se desea redondear
N a la centena más próxima y mostrar el resultado. Considere los siguientes ejemplos: Si A es 2, B
es 3, C es 6 y D es 2, entonces N es 2362 y el resultado redondeado es 2400. Si N es 2342, el
resultado redondeado será 2300 y si N es 2962, el resultado redondeado será 3000. */

public class Ejercicio_30 {

    public static void main(String[] args) {

        int A, B, C, D, N;

        System.out.println("Ingrese A");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese B");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese C");
        C = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese D");
        D = Integer.parseInt(System.console().readLine());

        N = A * 1000 + B * 100 + C * 10 + D;

        if (D >= 5 && N > 0) {
            N = N + (100 - N % 100);
        } else {
            N = N - N % 100;
        }

        System.out.println("Numero redondeado: " + N);
    }
}