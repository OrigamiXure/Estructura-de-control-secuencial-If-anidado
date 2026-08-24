/* Un hombre desea saber cuánto dinero se generará por concepto de intereses
   sobre la cantidad que tiene en inversión en el banco. El decidirá
   reinvertir los intereses siempre y cuando éstos excedan a $7000. */

public class Ejercicio_24{

    public static void main(String[] args) {

        int inversion;
        float porcentaje_interes;
        float intereses;
        float total;

        System.out.println("Ingrese el valor invertido en el banco");
        inversion = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese en decimales el porcentaje de interes");
        porcentaje_interes = Float.parseFloat(System.console().readLine());

        intereses = inversion * porcentaje_interes;

        if (intereses > 7000) {

            if (intereses > 7000) {
                total = inversion + intereses;
                System.out.println("Los intereses fueron reinvertidos");
                System.out.println("El dinero total es: " + total + " Bs");
            }

        } else {

            total = inversion;
            System.out.println("Los intereses no fueron reinvertidos");
            System.out.println("El dinero total es: " + total + " Bs");
        }
    }
}