
package metadatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Meta {
    public static void main(String[] args) {
        mostrarInfo();
    }
    public static void mostrarInfo(){
        Connection con=null;
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql","root","");
            //optencio de metadatos
            DatabaseMetaData datos=con.getMetaData();//tenemos metadatos referentes a la conexion
            //informacion mostrar
            System.out.println("Gestor: "+datos.getDatabaseProductName());
            System.out.println("Versión: "+datos.getDatabaseProductVersion());
            System.out.println("Driver: "+datos.getDriverName());
            System.out.println("Versión: "+datos.getDriverVersion());
            
            //Lista tablas
            System.out.println("________________________________________________________");
            //p% en el tercer argumento para llamar tablas que enpiezan con esz letra
            rs=datos.getTables(null, null, null, null);//guardamos los metadatos de las tablas
            while (rs.next()) {                
                System.out.println("Nombre tabla: "+rs.getString("TABLE_NAME"));
            }
            //campos de una tabla
            System.out.println("________________________________________________________");
            rs=datos.getColumns(null, null, "PRODUCTOS", null);
            while (rs.next()) {                
                System.out.println("Nombre tabla: "+rs.getString("COLUMN_NAME"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();//muestre la linea de error
            Logger.getLogger(Meta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Meta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
