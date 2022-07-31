package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Modificar_Tablas {

    public static void main(String[] args) {
        try {
            //1. crear conexion
            Connection conectaBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql", "root", "");
            //2. crear objecto statemen
            Statement st=conectaBD.createStatement();
            //String sql = "Insert into productos(CÓDIGOARTÍCULO,NOMBREARTÍCULO,PRECIO)value('AR77','aLEJA',26.7)";
            //String sql="update productos set PRECIO=PRECIO*2 where CÓDIGOARTÍCULO='AR77'";
            String sql="delete from productos where CÓDIGOARTÍCULO='AR77'";
            st.executeUpdate(sql);
            //System.out.println("Datos insertados");
            //System.out.println("dato actualizado");
            System.out.println("registro eliminado");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
