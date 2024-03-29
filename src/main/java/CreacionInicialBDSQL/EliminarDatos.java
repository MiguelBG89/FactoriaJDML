package CreacionInicialBDSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EliminarDatos {
    final static Scanner sc = new Scanner(System.in);

    public static void MenuEliminacion(Connection connection) throws SQLException {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> EliminarProyecto(connection);
                case 0 -> System.out.println("Salir");
                default -> System.out.println("Opcion no existente");
            }
        } while (opcion != 0);
    }

    public static int menu() {
        System.out.println("1 - Eliminar Proyecto");
        System.out.println("0 - Salir");
        return sc.nextInt();
    }


    //Metodo para eliminar proyectos con su id
    public static void EliminarProyecto(Connection connection) throws SQLException {

            int id_Proyecto;
            id_Proyecto = Leer.pedirEntero("Introduce el Identificador del proyecto: ");
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Proyectos WHERE PROYECTO_ID=?");
            ps.setInt(1, id_Proyecto);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                ps = connection.prepareStatement("DELETE FROM Proyectos WHERE PROYECTO_ID=?");
                ps.setInt(1, id_Proyecto);
                ps.execute();
                System.out.println("Eliminacion realizada");
            } else {
                System.out.println("Eliminacion no completada, no existe el proyecto");
            }
        }

}
