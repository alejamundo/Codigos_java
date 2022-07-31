package Serealizable_toString;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class LeerArchivosDeObjecto implements Serializable {

    private String cedula;
    private String nombre;
    private String apellidos;

    public LeerArchivosDeObjecto(String cedula, String nombre,
            String apellidos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getAtributos() {
        return this.getCedula() + " "
                + this.getApellidos() + ", "
                + this.getNombre();
    }

    public static void main(String[] args) {
        var nombre = "src/Serealizable_toString/Objetos.dat";
        try {
            var archivo = new FileInputStream(nombre);
            var ois = new ObjectInputStream(archivo);
            var p1 = (EscribirArchivosDeObjetos) ois.readObject();
            var p2 = (EscribirArchivosDeObjetos) ois.readObject();
            ois.close();
            System.out.println("Cedula\t Nombre");
            System.out.println(p1.getAtributos());
            System.out.println(p2.getAtributos());
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
