
package conectaBD;

import java.sql.*;


public class ConsultPreparada {
    public static void main(String[] args) {
        try {
            //1. CREAR CONEXION
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql","root","");
            //2 PREPARAR CONSULTA
            String sql="SELECT NOMBREARTÍCULO,SECCIÓN,PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=? AND PAÍSDEORIGEN=?";
            PreparedStatement pst=con.prepareStatement(sql);
            //3. ESTABLECER PARAMETROS DE CONSULTA
            pst.setString(1, "DEPORTES");//aqui ? va el deporte
            pst.setString(2, "USA");
            //4.  EJECUTAR Y RECORRE
            ResultSet rs=pst.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            rs.close();//libero recurso
            //REUTILIZACIÓN
            System.out.println("\nEJECUCION SEGUNDA CONSULTA");
            pst.setString(1, "CERAMICA");//aqui ? va el deporte
            pst.setString(2, "CHINA");
            
            rs=pst.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
}
