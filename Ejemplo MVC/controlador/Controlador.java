
package controlador;
import modelo.Modelo;
import vista.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//dectecta los click con action listener
public class Controlador implements ActionListener{
    //declarar variables tipo objeto
    private GUI view;
    private Modelo model;

    public Controlador(GUI view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnM.addActionListener(this);
    }
    public void iniciarVista(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    //accion del boton
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setN1(Integer.parseInt(view.n1.getText()));
        model.setN2(Integer.parseInt(view.n2.getText()));
        model.multiplicar();
        view.result.setText(String.valueOf(model.getResultado()));
    }
    
}
