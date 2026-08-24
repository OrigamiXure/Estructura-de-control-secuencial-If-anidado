/*Dados los datos A, B, C y D que representan números enteros; escriba un algoritmo que calcule el
resultado de las siguientes expresiones:
Si D=0 (A-C)^2
Si D>0 (A-B)^3
   -----------
       D */

public class Ejercicio_26{

    public static void main(String[] args) {

        int A, B, C, D;
        int opcion;
        float resultado = 0;

        System.out.println("Ingrese A");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese B");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese C");
        C = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese D");
        D = Integer.parseInt(System.console().readLine());

        if (D == 0) {
            opcion = 1;
        } else {
            opcion = 2;
        }

        switch (opcion) {

            case 1:
                resultado = (A - C) * (A - C);
                break;

            case 2:
                resultado = (float) ((A - B) * (A - B) * (A - B)) / D;
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}