
package Modelo;

import Clases.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.JDBCUtilities;

/**
 *
 * @author Katherin
 */
public class MdCompra {
    
    //Método para consultar los las compras realizadas por los proyectos con el proveedor “Homecenter” y para la ciudad “Salento”.
    public ArrayList<Compra> generarReporteCompras() {

        ArrayList<Compra> reporteCompra = new ArrayList<>();

        try ( Connection conn = JDBCUtilities.getConnection()) {

            String query = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado from Compra as c inner join Proyecto as p on p.ID_Proyecto = c.ID_Proyecto where c.Proveedor='Homecenter' and p.Ciudad='Salento'";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Compra registro = new Compra(result.getInt("ID_Compra"), result.getString("Constructora"), result.getString("Banco_Vinculado"));
                reporteCompra.add(registro);
            }
            return reporteCompra;

        } catch (Exception e) {
        }
        return reporteCompra;
    }
    
}
