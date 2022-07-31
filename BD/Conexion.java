
package conectaBD;

import java.sql.*;

public class Conexion {
    public static void main(String[] args) {
        //1.crear la conexion
        try {
            //driver manager para manejar drivers getconection para sql es perfecto ya que pide tres datos 
            //usuario root, contrasela "",mysql: retorna unobjecto de tipo conection
            //la cual es una interfaz que pertenece a sql
            //1.Crear conexion
            Connection coneccion=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql", "root", "");
            //2.objecto statement para hacer consulata sql
            Statement stat=coneccion.createStatement();//
            //3.Ejecutar la instrucion sql
            ResultSet res=stat.executeQuery("select *from productos");//guardadao en forma de tabla
            //4.recorrer la tabla virtual que genero el resulset
            //firs()=mover el cursor al inicio de la tabla
            //next()mueve el cursoso en una linea
            while (res.next()) {    //mientras haya un registro más
                //parale el nombre d ela columna de la bd O EL INDICE DE LA COLUMNA
                System.out.println(res.getString("NOMBREARTÍCULO")+" "
                        +res.getString(1)+" "+res.getDouble("PRECIO")*2+" "+res.getString(5));//tenemos todos los campos de los productos  
                //PUEDO TRAER TAMBIEN DATOS DE TIPO gerDauble()
            }     
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
