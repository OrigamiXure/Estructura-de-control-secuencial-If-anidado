/*Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del
15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del
trabajador. */

public class Ejercicio_25{

    public static void main(String[] args) {

        float sueldo;
        float nuevo_sueldo = 0;
        int opcion;

        System.out.println("Ingrese el sueldo");
        sueldo = Float.parseFloat(System.console().readLine());

        if (sueldo < 40000) {
            opcion = 1;
        } else {
            opcion = 2;
        }

        switch (opcion) {

            case 1:
                nuevo_sueldo = sueldo * 1.15f;
                break;

            case 2:
                nuevo_sueldo = sueldo * 1.12f;
                break;
        }

        System.out.println("Nuevo sueldo: " + nuevo_sueldo);
    }
}