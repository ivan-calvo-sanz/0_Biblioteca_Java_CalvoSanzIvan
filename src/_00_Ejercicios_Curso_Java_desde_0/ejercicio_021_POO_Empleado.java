package _00_Ejercicios_Curso_Java_desde_0;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class ejercicio_021_POO_Empleado {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Pepe", 19, 2000);
        Empleado e3 = new Empleado("Tom", 1, 1000);
        Empleado e4 = new Empleado("Jon", 5, 1500);

        e1.mostrarParametros();
        e2.mostrarParametros();
        e3.mostrarParametros();
        e4.mostrarParametros();

        e1.mostrarClasificacion();
        e2.mostrarClasificacion();
        e3.mostrarClasificacion();
        e4.mostrarClasificacion();

        e1.subirSalario(100);
        e2.subirSalario(10);
        e3.subirSalario(20);
        e4.subirSalario(50);

        e1.mostrarParametros();
        e2.mostrarParametros();
        e3.mostrarParametros();
        e4.mostrarParametros();

    }

}
