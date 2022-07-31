
package Almacenados;
import java.sql.*;
public class ConsultaClientes {
    public static void main(String[] args) {
        
        //conectar bd
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql","root","");
            //utilizar objeto callebleStatement
            CallableStatement procedimiento=con.prepareCall("{call MUESTRA_CLIENTES}");
            ResultSet rs=procedimiento.executeQuery();//que ejecute esa sentencia
            while (rs.next()) {                
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("No se conecto");          
        }
    }
}
