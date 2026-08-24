/*Un científico desea que un algoritmo le ayude en su trabajo analizándole tres valores que se
suministran, para determinar si los dos primeros son las medidas de una figura conocida. Para ello,
calcule el área de cada una de las figuras que se mencionan a continuación y compárela con el
tercer valor suministrado; si hay coincidencia, imprima un mensaje que indique de qué figura se
trata. Las figuras a analizar son:


• Triángulo: b*h/2 Valor1 y Valor2 son base y altura
• Círculo: pi * r^2 Valor1 y Valor2 son radio y pi
• Rectángulo: b * h Valor1 y Valor2 son base y altura. */

public class Ejercicio_27{

    public static void main(String[] args) {

        float valor1;
        float valor2;
        float area;

        System.out.println("Ingrese el valor 1");
        valor1 = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el valor 2");
        valor2 = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el area");
        area = Float.parseFloat(System.console().readLine());

        if (valor1 * valor2 / 2 == area) {

            if (valor1 * valor2 / 2 == area) {
                System.out.println("La figura es un triangulo");
            }

        } else if (3.1416f * valor1 * valor1 == area) {

            System.out.println("La figura es un circulo");

        } else if (valor1 * valor2 == area) {

            System.out.println("La figura es un rectangulo");

        } else {

            System.out.println("No se encontro la figura");
        }
    }
}