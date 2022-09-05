
package Modelo;

import Clases.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.JDBCUtilities;

/**
 *
 * @author Katherin
 */
public class MdProyecto {
    
    //Método para consultar los los proyectos cuya clasificación sea “Casa Campestre” y que estén ubicados en las ciudades de “Santa Marta”, “Cartagena” y “Barranquilla”    
    public ArrayList<Proyecto> generarReporteProyectos() {

        ArrayList<Proyecto> reporteProyecto= new ArrayList<>();

        try ( Connection conn = JDBCUtilities.getConnection()) {

            String query = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto where clasificacion = 'Casa Campestre' and ciudad in ('Santa Marta', 'Cartagena', 'Barranquilla')";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Proyecto registro = new Proyecto(result.getInt("ID_Proyecto"), result.getString("Constructora"), result.getDouble("Numero_Habitaciones"), result.getString("Ciudad"));
                reporteProyecto.add(registro);
            }
            return reporteProyecto;

        } catch (Exception e) {
        }
        return reporteProyecto;
    }
    
}
