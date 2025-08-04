package _60_POO;

/**
 *
 * @author ivanc
 */
public class RaizCuadrada {

    private double a;
    private double b;
    private double c;

    public RaizCuadrada(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void obtenerRaices() {
        double x1 = (-(this.b) + Math.sqrt(getDiscriminante())) / (2 * this.a);
        double x2 = (-(this.b) - Math.sqrt(getDiscriminante())) / (2 * this.a);
        System.out.println("Solucion X1= " + x1);
        System.out.println("Solucion X2= " + x2);
    }

    private void obtenerRaiz() {
        double x = (-(this.b)) / (2 * this.a);
        System.out.println("Unica solucion X= " + x);
    }

    private double getDiscriminante() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    private boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    private boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("NO tiene soluciones");
        }
    }

}
