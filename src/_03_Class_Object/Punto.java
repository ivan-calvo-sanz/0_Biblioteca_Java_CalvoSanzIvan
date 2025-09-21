package _03_Class_Object;

/**
 *
 * @author ivanc
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * SOBREESCRIBIR METODO .toString()
     */
    @Override
    public String toString() {
        return "[x=" + x + " ,y=" + y + "]";
    }

    /**
     * SOBREESCRIBIR METODO .equals(Object obj)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {  //estamos haciendo referencia a que tiene el mismo hasCode(), es decir apunta al mismo espacio en memoria, por lo tanto es el mismo objeto
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Punto puntoParametro = (Punto) obj;
        return x == puntoParametro.getX() && y == puntoParametro.getY();
    }

    /**
     * SOBREESCRIBIR METODO .hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31; //numero primo y se suele utilizar el 31
        int result = 1;
        result = prime * result + (int) x;
        result = prime * result + (int) y;
        return result;
    }
}
