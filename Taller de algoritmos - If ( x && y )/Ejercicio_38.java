/*Desarrolle un algoritmo que reciba como dato de entrada la fecha de nacimiento de una persona
y a continuación escriba el nombre del signo del zodiaco correspondiente; así como su edad.
Considere la siguiente tabla de signos: */

public class Ejercicio_38 {

    public static void main(String[] args) {

        int dia, mes, año, año_actual;
        String signo = "";

        System.out.println("Dia");
        dia = Integer.parseInt(System.console().readLine());

        System.out.println("Mes");
        mes = Integer.parseInt(System.console().readLine());

        System.out.println("Año nacimiento");
        año = Integer.parseInt(System.console().readLine());

        System.out.println("Año actual");
        año_actual = Integer.parseInt(System.console().readLine());

        if (mes == 1 && dia <= 20)
            signo = "Capricornio";

        if (mes == 1 && dia >= 21)
            signo = "Acuario";

        if (mes == 2 && dia <= 19)
            signo = "Acuario";

        if (mes == 2 && dia >= 20)
            signo = "Piscis";

        if (mes == 3 && dia <= 20)
            signo = "Piscis";

        if (mes == 3 && dia >= 21)
            signo = "Aries";

        if (mes == 4 && dia <= 20)
            signo = "Aries";

        if (mes == 4 && dia >= 21)
            signo = "Tauro";

        if (mes == 5 && dia <= 21)
            signo = "Tauro";

        if (mes == 5 && dia >= 22)
            signo = "Geminis";

        if (mes == 6 && dia <= 21)
            signo = "Geminis";

        if (mes == 6 && dia >= 22)
            signo = "Cancer";

        if (mes == 7 && dia <= 22)
            signo = "Cancer";

        if (mes == 7 && dia >= 23)
            signo = "Leo";

        if (mes == 8 && dia <= 23)
            signo = "Leo";

        if (mes == 8 && dia >= 24)
            signo = "Virgo";

        if (mes == 9 && dia <= 22)
            signo = "Virgo";

        if (mes == 9 && dia >= 23)
            signo = "Libra";

        if (mes == 10 && dia <= 22)
            signo = "Libra";

        if (mes == 10 && dia >= 23)
            signo = "Escorpion";

        if (mes == 11 && dia <= 21)
            signo = "Escorpion";

        if (mes == 11 && dia >= 22)
            signo = "Sagitario";

        if (mes == 12 && dia <= 21)
            signo = "Sagitario";

        if (mes == 12 && dia >= 22)
            signo = "Capricornio";

        System.out.println("Signo: " + signo);
        System.out.println("Edad: " + (año_actual - año));
    }
}