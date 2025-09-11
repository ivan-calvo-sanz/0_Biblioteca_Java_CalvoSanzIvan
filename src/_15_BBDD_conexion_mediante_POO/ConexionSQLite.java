package _15_BBDD_conexion_mediante_POO;

/**
 *
 * @author ivanc
 */
public class ConexionSQLite extends ConexionBBDD {

    public ConexionSQLite(String ruta) {
        super("org.sqlite.JDBC", "jdbc:sqlite:" + ruta);
    }

}
