/*Desarrolle un algoritmo, que dado como dato una temperatura en grados Fahrenheit, determine
el deporte que es apropiado practicar a esa temperatura, teniendo en cuenta la siguiente tabla:
     Deporte         Temperatura
     Natacion           Temp.>85
     Tenis              70< Temp. <85
     Golf               32< Temp. <70
     Esqui              10< Temp. <32
     Marcha             Temp. <=10      */
     
public class Ejercicio_35 {

    public static void main(String[] args) {

        float temperatura;

        System.out.println("Ingrese la temperatura en Fahrenheit");
        temperatura = Float.parseFloat(System.console().readLine());

        if (temperatura > 85) {

            if (temperatura > 85)
                System.out.println("Practique natacion");

        } else if (temperatura > 70) {

            System.out.println("Practique tenis");

        } else if (temperatura > 32) {

            System.out.println("Practique golf");

        } else if (temperatura > 10) {

            System.out.println("Practique esqui");

        } else {

            System.out.println("Practique marcha");
        }
    }
}