/*El gobierno del estado de México desea reforestar un bosque que mide determinado número de
hectáreas. Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces decidirá
sembrar de la siguiente manera:
PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
70% Pino
20% Oyamel
10% Cedro
Si la superficie del terreno es menor o igual a un millón de metros cuadrados, entonces decidirá
sembrar de la siguiente manera:
PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
50% Pino
30% Oyamel
20% Cedro
El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que sembrar en el bosque,
si se sabe que en 10 metros cuadrados caben 8 pinos, en 15 metros cuadrados caben 15 oyameles y
en 18 metros cuadrados caben 10 cedros. También se sabe que una hectárea equivale a 10 mil
metros cuadrados. */

public class Ejercicio_41 {

    public static void main(String[] args) {

        float hectareas;
        float metros;
        float pino = 0;
        float oyamel = 0;
        float cedro = 0;
        int opcion;

        System.out.println("Ingrese las hectareas");
        hectareas = Float.parseFloat(System.console().readLine());

        metros = hectareas * 10000;

        if (metros > 1000000)
            opcion = 1;
        else
            opcion = 2;

        switch (opcion) {

            case 1:
                pino = metros * 0.70f;
                oyamel = metros * 0.20f;
                cedro = metros * 0.10f;
                break;

            case 2:
                pino = metros * 0.50f;
                oyamel = metros * 0.30f;
                cedro = metros * 0.20f;
                break;
        }

        System.out.println("Pinos: " + (pino / 10 * 8));
        System.out.println("Oyameles: " + (oyamel / 15 * 15));
        System.out.println("Cedros: " + (cedro / 18 * 10));
    }
}