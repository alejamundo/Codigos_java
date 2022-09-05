
package Clases;

/**
 *
 * @author Katherin
 */
public class Lider {
    
    private int id_lider;
    private String nombre;
    private String primer_apellido;
    private String ciudad_residencia;
    
    
    //Constructores
    
    public Lider() {
    }

    public Lider(int id_lider, String nombre, String primer_apellido, String ciudad_residencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.ciudad_residencia = ciudad_residencia;
    }
    
    //Métodos Getter y Setter

    /**
     * @return the id_lider
     */
    public int getId_lider() {
        return id_lider;
    }

    /**
     * @param id_lider the id_lider to set
     */
    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primer_apellido
     */
    public String getPrimer_apellido() {
        return primer_apellido;
    }

    /**
     * @param primer_apellido the primer_apellido to set
     */
    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    /**
     * @return the ciudad_residencia
     */
    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    /**
     * @param ciudad_residencia the ciudad_residencia to set
     */
    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }
    
    
}
