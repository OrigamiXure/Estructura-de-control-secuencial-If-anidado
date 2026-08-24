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
        int opcion;

        System.out.println("Ingrese la temperatura");
        temperatura = Float.parseFloat(System.console().readLine());

        if (temperatura > 85)
            opcion = 1;
        else if (temperatura > 70)
            opcion = 2;
        else if (temperatura > 32)
            opcion = 3;
        else if (temperatura > 10)
            opcion = 4;
        else
            opcion = 5;

        switch (opcion) {

            case 1:
                System.out.println("Natacion");
                break;

            case 2:
                System.out.println("Tenis");
                break;

            case 3:
                System.out.println("Golf");
                break;

            case 4:
                System.out.println("Esqui");
                break;

            case 5:
                System.out.println("Marcha");
                break;
        }
    }
}