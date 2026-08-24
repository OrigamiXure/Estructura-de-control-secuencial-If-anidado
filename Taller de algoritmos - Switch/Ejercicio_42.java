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
        float minimo = 0;
        String sexo;
        int opcion;

        System.out.println("Edad");
        edad = Float.parseFloat(System.console().readLine());

        System.out.println("Sexo M/F");
        sexo = System.console().readLine();

        System.out.println("Hemoglobina");
        hemoglobina = Float.parseFloat(System.console().readLine());

        if (edad <= 1.0f / 12)
            opcion = 1;
        else if (edad <= 0.5f)
            opcion = 2;
        else if (edad <= 1)
            opcion = 3;
        else if (edad <= 5)
            opcion = 4;
        else if (edad <= 10)
            opcion = 5;
        else if (edad <= 15)
            opcion = 6;
        else if (sexo.equals("F"))
            opcion = 7;
        else
            opcion = 8;

        switch (opcion) {

            case 1:
                minimo = 13;
                break;

            case 2:
                minimo = 10;
                break;

            case 3:
                minimo = 11;
                break;

            case 4:
                minimo = 11.5f;
                break;

            case 5:
                minimo = 12.6f;
                break;

            case 6:
                minimo = 13;
                break;

            case 7:
                minimo = 12;
                break;

            case 8:
                minimo = 14;
                break;
        }

        if (hemoglobina < minimo)
            System.out.println("La persona tiene anemia");
        else
            System.out.println("La persona no tiene anemia");
    }
}