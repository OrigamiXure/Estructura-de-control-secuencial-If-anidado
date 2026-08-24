/*Desarrolle un algoritmo que reciba como dato de entrada la fecha de nacimiento de una persona
y a continuación escriba el nombre del signo del zodiaco correspondiente; así como su edad.
Considere la siguiente tabla de signos: */

public class Ejercicio_38 {

    public static void main(String[] args) {

        int dia, mes, año, año_actual;
        String signo;

        System.out.println("Ingrese el dia de nacimiento");
        dia = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el mes de nacimiento");
        mes = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año de nacimiento");
        año = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año actual");
        año_actual = Integer.parseInt(System.console().readLine());

        if (mes == 1) {

            if (dia <= 20)
                signo = "Capricornio";
            else
                signo = "Acuario";

        } else if (mes == 2) {

            if (dia <= 19)
                signo = "Acuario";
            else
                signo = "Piscis";

        } else if (mes == 3) {

            if (dia <= 20)
                signo = "Piscis";
            else
                signo = "Aries";

        } else if (mes == 4) {

            if (dia <= 20)
                signo = "Aries";
            else
                signo = "Tauro";

        } else if (mes == 5) {

            if (dia <= 21)
                signo = "Tauro";
            else
                signo = "Geminis";

        } else if (mes == 6) {

            if (dia <= 21)
                signo = "Geminis";
            else
                signo = "Cancer";

        } else if (mes == 7) {

            if (dia <= 22)
                signo = "Cancer";
            else
                signo = "Leo";

        } else if (mes == 8) {

            if (dia <= 23)
                signo = "Leo";
            else
                signo = "Virgo";

        } else if (mes == 9) {

            if (dia <= 22)
                signo = "Virgo";
            else
                signo = "Libra";

        } else if (mes == 10) {

            if (dia <= 22)
                signo = "Libra";
            else
                signo = "Escorpion";

        } else if (mes == 11) {

            if (dia <= 21)
                signo = "Escorpion";
            else
                signo = "Sagitario";

        } else {

            if (dia <= 21)
                signo = "Sagitario";
            else
                signo = "Capricornio";
        }

        System.out.println("Signo: " + signo);
        System.out.println("Edad: " + (año_actual - año));
    }
}