public class Ejercicio_24{

    public static void main(String[] args) {

        int inversion;
        int opcion;
        float porcentaje_interes;
        float intereses;
        float total;

        System.out.println("Ingrese el valor invertido en el banco");
        inversion = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese en decimales el porcentaje de interes");
        porcentaje_interes = Float.parseFloat(System.console().readLine());

        intereses = inversion * porcentaje_interes;

        if (intereses > 7000) {
            opcion = 1;
        } else {
            opcion = 2;
        }

        switch (opcion) {

            case 1:
                total = inversion + intereses;
                System.out.println("Los intereses fueron reinvertidos");
                System.out.println("Total: " + total + " Bs");
                break;

            case 2:
                total = inversion;
                System.out.println("Los intereses no fueron reinvertidos");
                System.out.println("Total: " + total + " Bs");
                break;
        }
    }
}