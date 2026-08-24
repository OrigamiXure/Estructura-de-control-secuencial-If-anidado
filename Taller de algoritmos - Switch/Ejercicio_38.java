/*Desarrolle un algoritmo que reciba como dato de entrada la fecha de nacimiento de una persona
y a continuación escriba el nombre del signo del zodiaco correspondiente; así como su edad.
Considere la siguiente tabla de signos: */

public class Ejercicio_38 {

    public static void main(String[] args) {

        int dia, mes, año, año_actual;
        int opcion;
        String signo = "";

        System.out.println("Dia");
        dia = Integer.parseInt(System.console().readLine());

        System.out.println("Mes");
        mes = Integer.parseInt(System.console().readLine());

        System.out.println("Año nacimiento");
        año = Integer.parseInt(System.console().readLine());

        System.out.println("Año actual");
        año_actual = Integer.parseInt(System.console().readLine());

        if (mes == 1)
            opcion = dia <= 20 ? 1 : 2;
        else if (mes == 2)
            opcion = dia <= 19 ? 2 : 3;
        else if (mes == 3)
            opcion = dia <= 20 ? 3 : 4;
        else if (mes == 4)
            opcion = dia <= 20 ? 4 : 5;
        else if (mes == 5)
            opcion = dia <= 21 ? 5 : 6;
        else if (mes == 6)
            opcion = dia <= 21 ? 6 : 7;
        else if (mes == 7)
            opcion = dia <= 22 ? 7 : 8;
        else if (mes == 8)
            opcion = dia <= 23 ? 8 : 9;
        else if (mes == 9)
            opcion = dia <= 22 ? 9 : 10;
        else if (mes == 10)
            opcion = dia <= 22 ? 10 : 11;
        else if (mes == 11)
            opcion = dia <= 21 ? 11 : 12;
        else
            opcion = dia <= 21 ? 12 : 1;

        switch (opcion) {

            case 1: signo = "Capricornio"; break;
            case 2: signo = "Acuario"; break;
            case 3: signo = "Piscis"; break;
            case 4: signo = "Aries"; break;
            case 5: signo = "Tauro"; break;
            case 6: signo = "Geminis"; break;
            case 7: signo = "Cancer"; break;
            case 8: signo = "Leo"; break;
            case 9: signo = "Virgo"; break;
            case 10: signo = "Libra"; break;
            case 11: signo = "Escorpion"; break;
            case 12: signo = "Sagitario"; break;
        }

        System.out.println("Signo: " + signo);
        System.out.println("Edad: " + (año_actual - año));
    }
}