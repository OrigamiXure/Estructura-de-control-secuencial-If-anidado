/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor que
el rango que le corresponde, se determina su resultado como positivo y en caso contrario como
negativo. La tabla en la que el médico se basa para obtener el resultado es la siguiente:
EDAD NIVEL DE HEMOGLOBINA
0 - 1 mes 13 - 26 g%
Mayor de 1 y menor o igual de 6 meses 10 - 18 g%
Mayor de 6 y menor o igual de 12 meses 11 - 15 g%
Mayor de 1 y menor o igual que 5 años 11.5 - 15 g%
Mayor de 5 y menor o igual que 10 años 12.6 – 15.5 g%
Mayor de 10 y menor o igual que 15 años 13 - 15.5 g%
Mujeres mayores de 15 años 12 - 16 g%
Hombres mayores de 15 años 14 - 18 g%
Desarrolle un algoritmo que indique, si una persona tiene Anemia o no. */

public class Ejercicio_42 {

    public static void main(String[] args) {

        float edad;
        float hemoglobina;
        float minimo;
        String sexo;

        System.out.println("Ingrese la edad en años");
        edad = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el sexo M/F");
        sexo = System.console().readLine();

        System.out.println("Ingrese el nivel de hemoglobina");
        hemoglobina = Float.parseFloat(System.console().readLine());

        if (edad <= 1.0f / 12) {

            if (edad >= 0)
                minimo = 13;
            else
                minimo = 0;

        } else if (edad <= 0.5f) {

            minimo = 10;

        } else if (edad <= 1) {

            minimo = 11;

        } else if (edad <= 5) {

            minimo = 11.5f;

        } else if (edad <= 10) {

            minimo = 12.6f;

        } else if (edad <= 15) {

            minimo = 13;

        } else {

            if (sexo.equals("F"))
                minimo = 12;
            else
                minimo = 14;
        }

        if (hemoglobina < minimo) {

            if (hemoglobina < minimo)
                System.out.println("La persona tiene anemia");

        } else {

            System.out.println("La persona no tiene anemia");
        }
    }
}