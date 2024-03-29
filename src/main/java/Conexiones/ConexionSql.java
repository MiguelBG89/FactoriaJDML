package Conexiones;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionSql {

    private static String URL = "jdbc:mysql://fp2.croh1mygfad5.eu-west-3.rds.amazonaws.com";
    private static final String URL_FINAL = URL;
    private static final String USER = "admin";
    private static final String passwd = "FP2%SanAlberto";

    public ConexionSql() {
    }

    //Creacion del DataSource PoolConexiones necesario para lanzar la conexion a la base de datos, contiene la direccion
    //a la base de datos, el nombre de usuario, la contraseña y el numero inicial de conexiones
    public static DataSource poolConexiones(String DB) {
        BasicDataSource datos = new BasicDataSource();
        datos.setUrl(URL+DB);
        datos.setUsername(USER);
        datos.setPassword(passwd);
        datos.setInitialSize(10);
        return datos;
    }

    //Conexion a la base de datos
    public static Connection conectar(String DB) throws SQLException {
        return poolConexiones(DB).getConnection();
    }

    public static String getURL() {
        return URL;
    }
    public static String getURLFinal() {
        return URL_FINAL;
    }



}
