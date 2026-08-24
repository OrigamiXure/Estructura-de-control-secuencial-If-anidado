/*El dueño de una empresa desea planificar las decisiones financieras que tomará en el siguiente
año. La manera de planificarlas depende de lo siguiente: Si actualmente su capital se encuentra
con saldo negativo, pedirá un préstamo bancario para que su nuevo saldo sea de $10000. si su
capital tiene actualmente un saldo positivo pedirá un préstamo bancario para tener un nuevo saldo
de $20000, pero si su capital tiene actualmente un saldo superior a los $20000 no pedirá ningún
préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
$5000 para equipo de cómputo
$2000 para mobiliario y del resto la mitad será para la compra de insumos y la otra para
otorgar incentivos al personal.
Desplegar qué cantidades se destinarán para la compra de insumos e incentivos al personal y, en caso
de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco. */

public class Ejercicio_43 {

    public static void main(String[] args) {

        float capital;
        float prestamo = 0;
        float presupuesto;
        float resto;
        int opcion;

        System.out.println("Ingrese el capital");
        capital = Float.parseFloat(System.console().readLine());

        if (capital < 0)
            opcion = 1;
        else if (capital <= 20000)
            opcion = 2;
        else
            opcion = 3;

        switch (opcion) {

            case 1:
                prestamo = 10000 - capital;
                break;

            case 2:
                prestamo = 20000 - capital;
                break;

            case 3:
                prestamo = 0;
                break;
        }

        presupuesto = capital + prestamo;
        resto = presupuesto - 7000;

        System.out.println("Prestamo: " + prestamo);
        System.out.println("Insumos: " + resto / 2);
        System.out.println("Incentivos: " + resto / 2);
    }
}