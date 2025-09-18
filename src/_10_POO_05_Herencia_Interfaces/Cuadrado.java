package _10_POO_05_Herencia_Interfaces;

/**
 *
 * @author ivanc
 */
public class Cuadrado implements Forma, Color {

    private double lado;
    private String color;

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String color() {
        return color;
    }
}
