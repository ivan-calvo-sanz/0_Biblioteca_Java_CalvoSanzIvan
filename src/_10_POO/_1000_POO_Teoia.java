package _10_POO;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _1000_POO_Teoia {

    // https://www.w3schools.com/java/java_oop.asp
    // CONCEPTOS BASICOS POO
    // ***** SOBRECARGA DE METODOS *****
    // cuando en la Clase existe varios métodos con el mismo nombre pero distintos parámetros (ya puede ser en tipo como en numero)
    // si devuelve diferente tipo o tiene diferente número de parámetros o tiene diferente tipo de parámetros o tiene orden diferente de parámetros (tipo) puede hacerse sobrecarga del metodo
    // ***** SOBRECARGA DE CONSTRUCTORES *****
    // igual que la sobrecarga de métodos
    // ***** public VS static *****
    // public   significa que solo se puede acceder a él creando un Objeto de esa Clase
    // static   significa que se puede acceder a él sin crear un objeto de la clase
    // ***** ATRIBUTOS ESTATICOS (static) *****
    // que depende únicamente de la Clase, es decir, NO depende del Objeto sino de la Clase, en este caso el Atributo es característica de la Clase y no dependerá del Objeto, es decir, será una característica intrinsica de la Clase y común para todos los Objetos, Instancias que se creen de esa Clase.
    // como es carácterística de la Clase es mejor inicializar el atributo en la Clase y NO en el Constructor, ya que sino cada vez que se crea una instancia (Objeto) de la Clase se genera el valor de ese atributo y no es muy correcto ya que es una característica intrinsica a la Clase.
    // ***** METODOS ESTATICOS (static) *****
    // misma idea que los Atributos ESTATICOS
    // todo aquello que esté dentro de un metodo estatico tiene que ser estatico, es decir, dentro de un método Estático los atributos tienen que se utilicen dentro de el tienen que ser estáticos, ya que el método estamos indicando que depende unicamente de la Clase, por lo tanto los atributos que intervienen en ese método también deben depender unicamente de la Clase, si alguno de ellos dependiese del Objeto ya el método NO dependería solo de la Clase. 
    // ***** HERENCIA *****
    // Clases padres que tiene Clases hijas, las Clases hijas heredan de la Clase Padre, por lo tanto tendrán atributos o métodos que heredan de la Clase Padre.
    // Es decir, cuando tenemos varias Clases que tienen en común varios atributos o métodos iguales, se puede crear una Clase Padre con estos atributos o métodos comunes y las hijas que hereden de está y así tenemos concentrado en una única Clase todos los atributos o métodos que son comunes y NO es necesario repetirlos en cada una de las Clases.
    // ***** private   VS   protected  *****
    // En las Clases Padres que heredan se puede utilizar el   protected   en vez de   private Esto tiene ventaja ya que el   protected   es privado y heredado, es decir es lo mismo que el privado solo que el privado es privado solo tiene acceso para esa Clase por lo tanto las Clases hijas NO pueden acceder directamente a los atributos o métodos de la Clase padre, sino que hay que acceder mediante    super. Mientras con el   protected   las Clases hijas pueden acceder a los atributos y métodos de la Clase padre directamente sin tener que utilizar el   super.
    // ***** POLIMORFISMO *****
    // Polimorfismo en Herencia, significa que diferentes Clases tienen el mismo método (se llaman igual) pero distinta implementación
    // es decir dependiendo la Clase que sea el Objeto implementado realizará su método correspondiente
    // ***** INTERFACES *****
    // Se crean mediante   Java Interface
    // Sirven para Obligar a implementar en otra Clase los métodos que hemos indicado en la Clase Interface
    //En la Interface NO se implementan los métodos, solo se definen (se indican) los métodos que tienen que tener las Clases que sean interface de esta y en ellas se desarrollan estos métodos
    // ***** CLASES ABSTRACTAS *****
    // Clase Abstracta es aquella que NO se pueden crear Objetos de ella
    // Se suele utilizar cuando realizamos Herencia, la Clase padre suele ser solo como plantilla y NO suele ser necesario realizar Objetos de ella
    // Podemos hacer que la Clase Abstracta Implemente de una Interface, entonces al ser una Clase Abstracta y por lo tanto NO se van a crear Objetos de ella NO hay que implementar en ella los métodos de la Interface, será en las Clases hijas las cuales si se van a crear Objetos de ellas en las que se tenga que implementar los métodos indicados en la Interface.
    // ¿CUANDO HAY QUE CREAR CLASES ABSTRACTAS? si se ve que NO ve van a necesitar crear Objetos de ella y solo de las hijas entonces lo ideal es crear Clase Abstracta.
    // ***** METODOS ABSTRACTOS *****
    // Son métodos que NO se implementan en la Clase Padre sino únicamente se definen, será en las Clases heredadas donde es obligatorio implementarlas.
    // *****
    public static void main(String[] args) {

    }

    // DECLARAR UNA CLASE
    public class Circulo {

        //ATRIBUTOS DE LA CLASE
        private double radio;
        private String color;
        private int centroX, centroY;

        //CONSTRUCTOR
        public Circulo() {

        }

    }
}
