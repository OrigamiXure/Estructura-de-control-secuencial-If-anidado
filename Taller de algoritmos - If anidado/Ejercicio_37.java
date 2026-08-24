/*Dados tres datos enteros positivos, que representan las longitudes de los lados de un probable
triángulo, desarrolle un algoritmo que determine si los datos corresponden a un triángulo. En caso
de que sí correspondan, escriba si el triángulo es equilátero, isósceles o escaleno. Calcule además
su área. Considere que es triángulo si se cumple que la suma de los dos lados menores es mayor
que la del lado mayor. Tome en cuenta además que el área de un triángulo la calculamos como:
area = √S(S­A)(S­B)(S­C) donde S es la mitad de la suma de los lados A, B y C.
Recuerde:
Equilátero: todos los lados son iguales.
Isósceles: 2 lados iguales y 1 diferente.
Escaleno: Todos los lados diferentes. */

public class Ejercicio_37 {

    public static void main(String[] args) {

        float A, B, C;
        float S, area;

        System.out.println("Ingrese el lado A");
        A = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el lado B");
        B = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el lado C");
        C = Float.parseFloat(System.console().readLine());

        if (A + B > C && A + C > B && B + C > A) {

            if (A == B) {

                if (B == C)
                    System.out.println("El triangulo es equilatero");
                else
                    System.out.println("El triangulo es isosceles");

            } else if (A == C || B == C) {

                System.out.println("El triangulo es isosceles");

            } else {

                System.out.println("El triangulo es escaleno");
            }

            S = (A + B + C) / 2;
            area = (float)Math.sqrt(S * (S-A) * (S-B) * (S-C));

            System.out.println("El area es: " + area);

        } else {

            System.out.println("Los lados no forman un triangulo");
        }
    }
}