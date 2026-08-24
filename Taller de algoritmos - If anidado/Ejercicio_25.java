/*Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del
15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del
trabajador. */

public class Ejercicio_25{

    public static void main(String[] args) {

        float sueldo;
        float nuevo_sueldo;

        System.out.println("Ingrese el sueldo del trabajador");
        sueldo = Float.parseFloat(System.console().readLine());

        if (sueldo < 40000) {

            if (sueldo >= 0) {
                nuevo_sueldo = sueldo * 1.15f;
                System.out.println("Nuevo sueldo: " + nuevo_sueldo);
            }

        } else {

            nuevo_sueldo = sueldo * 1.12f;
            System.out.println("Nuevo sueldo: " + nuevo_sueldo);
        }
    }
}