
package Clases;

/**
 *
 * @author Katherin
 */
public class Proyecto {
    
    private int id_proyecto;
    private String constructora;
    private double numero_habitaciones;
    private String ciudad;
    
    //Constructores

    public Proyecto() {
    }

    public Proyecto(int id_proyecto, String constructora, double numero_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.numero_habitaciones = numero_habitaciones;
        this.ciudad = ciudad;
    }
    
    
    
    //Métodos Getter y Setter

    /**
     * @return the id_proyecto
     */
    public int getId_proyecto() {
        return id_proyecto;
    }

    /**
     * @param id_proyecto the id_proyecto to set
     */
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numero_habitaciones
     */
    public double getNumero_habitaciones() {
        return numero_habitaciones;
    }

    /**
     * @param numero_habitaciones the numero_habitaciones to set
     */
    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
