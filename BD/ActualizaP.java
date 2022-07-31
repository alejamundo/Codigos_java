
package Almacenados;

import java.sql.*;
public class ActualizaP {
    public static void main(String[] args) {
        int precio=2000;
        String articulo="DESTORNILLADOR";
        try {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql","root","");
            //utilizar objeto callebleStatement
            CallableStatement procedimiento=con.prepareCall("{call ACTUALIZA_PRODUCTOS(?,?)}");
            procedimiento.setInt(1, precio);
            procedimiento.setString(2, articulo);
            procedimiento.execute();//retorna boolean lo uso cuando no necesito retornar nada
            ResultSet rs=procedimiento.executeQuery();//que ejecute esa sentencia
            System.out.println("Actualizado");
        } catch (Exception e) {
            System.out.println("No se conecto");          
        }
    }
}
