package Modelo;

import Clases.Lider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.JDBCUtilities;

/**
 *
 * @author Katherin
 */
public class MdLider {

    //Método para consultar los lideres    
    public ArrayList<Lider> generarReporteLideres() {

        ArrayList<Lider> reporteLideres = new ArrayList<>();

        try ( Connection conn = JDBCUtilities.getConnection()) {

            String query = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia from lider order by Ciudad_Residencia";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Lider registro = new Lider(result.getInt("ID_Lider"), result.getString("Nombre"), result.getString("Primer_Apellido"), result.getString("Ciudad_Residencia"));
                reporteLideres.add(registro);
            }
            return reporteLideres;

        } catch (Exception e) {
        }
        return reporteLideres;
    }

}
