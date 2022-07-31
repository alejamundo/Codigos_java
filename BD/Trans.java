
package Transacciones;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Trans {
    public static Connection con=null;
    public static void main(String[] args) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql","root","");
            con.setAutoCommit(false);//indico que se trataran sentencias sql en bloque
            Statement st=con.createStatement();
            String sql1="DELETE FROM PRODUCTOS WHERE PAÌSDEORIGEN='ITALIA'";
            String sql2="DELETE FROM PRODUCTOS WHERE PRECIO>300.0";
            String sql3="UPDATE PRODUCTOS SET PRECIO=PRECIO*1.15";
            //metodo que preguntara
            boolean ejecutar=ejecutar_trasnsaccion();
            if (ejecutar) {
                st.executeUpdate(sql1);
                st.executeUpdate(sql2);
                st.executeUpdate(sql3);
                con.commit();//para informar quehasta ahi va el bloque
                System.out.println("se ejecuto la trasacciòn");
            }else{
                System.out.println("No se realizo la transacción");
            }
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Trans.class.getName()).log(Level.SEVERE, null, ex1);
            }
            System.out.println("No se conecto");   
        }
    }

    public static boolean ejecutar_trasnsaccion() {
        String ejecucion=JOptionPane.showInputDialog("Desea ejecutar transacción");
        if (ejecucion.equalsIgnoreCase("si")) return true;
        else return false;
       
    }
}
