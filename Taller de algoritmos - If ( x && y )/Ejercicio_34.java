/*Construya un programa que, dados como datos la categoría y el sueldo del trabajador, calcule el
aumento correspondiente teniendo en cuenta la siguiente tabla:
        Categoria                   % aumento
            1                           15%
            2                           10%
            3                           8%
            4                           7%            
Como salida, mostrar la categoría del trabajador y su nuevo sueldo. */

public class Ejercicio_34 {

    public static void main(String[] args) {

        int categoria;
        float sueldo;
        float nuevo_sueldo = 0;

        System.out.println("Ingrese la categoria");
        categoria = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo");
        sueldo = Float.parseFloat(System.console().readLine());

        if (categoria == 1 && sueldo >= 0)
            nuevo_sueldo = sueldo * 1.15f;

        if (categoria == 2 && sueldo >= 0)
            nuevo_sueldo = sueldo * 1.10f;

        if (categoria == 3 && sueldo >= 0)
            nuevo_sueldo = sueldo * 1.08f;

        if (categoria == 4 && sueldo >= 0)
            nuevo_sueldo = sueldo * 1.07f;

        System.out.println("Categoria: " + categoria);
        System.out.println("Nuevo sueldo: " + nuevo_sueldo);
    }
}