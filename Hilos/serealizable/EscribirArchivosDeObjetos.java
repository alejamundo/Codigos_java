package Serealizable_toString;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EscribirArchivosDeObjetos implements Serializable {

    private String dni;
    private String nombre;
    private String apellidos;

    public EscribirArchivosDeObjetos(String dni, String nombre,
            String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getAtributos() {
        return this.getDNI() + " "
                + this.getApellidos() + ", "
                + this.getNombre();
    }

    public static void main(String[] args) {
        var nombre = "src/Serealizable_toString/Objetos.dat";
        try {
            var archivo = new FileOutputStream(nombre);
            var oos = new ObjectOutputStream(archivo);
            oos.writeObject(new EscribirArchivosDeObjetos("552871883", "María", "Ruiz Ramos"));
            oos.writeObject(new EscribirArchivosDeObjetos("403020104", "Juan", "González López"));
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
