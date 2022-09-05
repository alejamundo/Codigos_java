
package Clases;

/**
 *
 * @author Katherin
 */
public class Compra {
    
    private int id_compra;
    private String constructora;
    private String banco_vinculado;
    
    //Constructores

    public Compra() {
    }

    public Compra(int id_compra, String constructora, String banco_vinculado) {
        this.id_compra = id_compra;
        this.constructora = constructora;
        this.banco_vinculado = banco_vinculado;
    }
    
    

    /**
     * @return the id_compra
     */
    public int getId_compra() {
        return id_compra;
    }

    /**
     * @param id_compra the id_compra to set
     */
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
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
     * @return the banco_vinculado
     */
    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    /**
     * @param banco_vinculado the banco_vinculado to set
     */
    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }

       
    
}
