package _15_BBDD_conexion_mediante_POO;

/**
 *
 * @author ivanc
 */
public class ConexionOracle extends ConexionBBDD {

    public ConexionOracle(String host, String puerto, String SID, String usuario, String password) {
        super("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@" + host + ":" + puerto + ":" + SID, usuario, password);
    }

    public ConexionOracle(String host, String SID, String usuario, String password) {
        super("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@" + host + ":1521" + SID, usuario, password);
    }

}
