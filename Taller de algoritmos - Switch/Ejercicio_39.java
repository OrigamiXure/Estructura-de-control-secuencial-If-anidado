/*Una persona se encuentra en la disyuntiva de comprar un automóvil o un terreno, los cuales
cuestan exactamente la misma cantidad de dinero. Sabe que mientras el automóvil se devalúa,
con el terreno sucede lo contrario. Esta persona comprará el automóvil si al cabo de tres años la
devaluación de éste no es mayor que la mitad del incremento del valor del terreno. Ayúdele a esta
persona a determinar si debe o no comprar el automóvil. */

public class Ejercicio_39 {

    public static void main(String[] args) {

        float valor;
        float devaluacion;
        float incremento;
        float perdida;
        float ganancia;
        int opcion;

        System.out.println("Ingrese el valor");
        valor = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese la devaluacion");
        devaluacion = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el incremento");
        incremento = Float.parseFloat(System.console().readLine());

        perdida = valor * devaluacion * 3;
        ganancia = valor * incremento * 3;

        if (perdida <= ganancia / 2)
            opcion = 1;
        else
            opcion = 2;

        switch (opcion) {

            case 1:
                System.out.println("Debe comprar el automovil");
                break;

            case 2:
                System.out.println("Debe comprar el terreno");
                break;
        }
    }
}