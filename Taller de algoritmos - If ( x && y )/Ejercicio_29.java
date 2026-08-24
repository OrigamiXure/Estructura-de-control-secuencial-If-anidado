/*Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
departamentos y ha establecido un programa de incentivos para incrementar su productividad. El
gerente, al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos
que excedan el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su
salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los
vendedores de los tres departamentos al finalizar el mes. */

public class Ejercicio_29 {

    public static void main(String[] args) {

        float venta1, venta2, venta3, sueldo, total;

        System.out.println("Ventas departamento 1");
        venta1 = Float.parseFloat(System.console().readLine());

        System.out.println("Ventas departamento 2");
        venta2 = Float.parseFloat(System.console().readLine());

        System.out.println("Ventas departamento 3");
        venta3 = Float.parseFloat(System.console().readLine());

        System.out.println("Sueldo");
        sueldo = Float.parseFloat(System.console().readLine());

        total = venta1 + venta2 + venta3;

        if (venta1 > total * 0.33f && venta1 > 0)
            System.out.println("Departamento 1: " + sueldo * 1.20f);
        else
            System.out.println("Departamento 1: " + sueldo);

        if (venta2 > total * 0.33f && venta2 > 0)
            System.out.println("Departamento 2: " + sueldo * 1.20f);
        else
            System.out.println("Departamento 2: " + sueldo);

        if (venta3 > total * 0.33f && venta3 > 0)
            System.out.println("Departamento 3: " + sueldo * 1.20f);
        else
            System.out.println("Departamento 3: " + sueldo);
    }
}