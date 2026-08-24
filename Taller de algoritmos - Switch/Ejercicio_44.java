/*Una persona desea iniciar un negocio, para lo cual piensa verificar cuánto dinero le prestaría el
banco por hipotecar su casa. Tiene una cuenta bancaria, pero no quiere disponer de ella a menos
que el monto por hipotecar su casa sea muy pequeño. Si el monto de la hipoteca es menor que
$1.000.000 entonces invertirá el 50% de la inversión total, y un socio invertirá el otro 50%. Si el
monto de la hipoteca es de $1.000.000 o más, entonces invertirá el monto total de la hipoteca y el
resto del dinero que se necesite para cubrir la inversión total se repartirá a partes iguales entre el
socio y él. */

public class Ejercicio_44 {

    public static void main(String[] args) {

        float hipoteca;
        float inversion;
        float persona = 0;
        float socio = 0;
        int opcion;

        System.out.println("Ingrese la hipoteca");
        hipoteca = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese la inversion total");
        inversion = Float.parseFloat(System.console().readLine());

        if (hipoteca < 1000000)
            opcion = 1;
        else
            opcion = 2;

        switch (opcion) {

            case 1:
                persona = inversion * 0.50f;
                socio = inversion * 0.50f;
                break;

            case 2:
                persona = hipoteca + (inversion - hipoteca) / 2;
                socio = (inversion - hipoteca) / 2;
                break;
        }

        System.out.println("Persona: " + persona);
        System.out.println("Socio: " + socio);
    }
}