/*Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
departamentos y ha establecido un programa de incentivos para incrementar su productividad. El
gerente, al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos
que excedan el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su
salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los
vendedores de los tres departamentos al finalizar el mes. */

public class Ejercicio_29 {

    public static void main(String[] args) {

        float venta1;
        float venta2;
        float venta3;
        float sueldo;
        float total;

        System.out.println("Ingrese ventas del departamento 1");
        venta1 = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese ventas del departamento 2");
        venta2 = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese ventas del departamento 3");
        venta3 = Float.parseFloat(System.console().readLine());

        System.out.println("Ingrese el sueldo");
        sueldo = Float.parseFloat(System.console().readLine());

        total = venta1 + venta2 + venta3;

        if (venta1 > total * 0.33f) {

            if (venta1 > total * 0.33f) {
                System.out.println("Departamento 1 recibe: " + sueldo * 1.20f);
            }

        } else {
            System.out.println("Departamento 1 recibe: " + sueldo);
        }

        if (venta2 > total * 0.33f) {
            System.out.println("Departamento 2 recibe: " + sueldo * 1.20f);
        } else {
            System.out.println("Departamento 2 recibe: " + sueldo);
        }

        if (venta3 > total * 0.33f) {
            System.out.println("Departamento 3 recibe: " + sueldo * 1.20f);
        } else {
            System.out.println("Departamento 3 recibe: " + sueldo);
        }
    }
}