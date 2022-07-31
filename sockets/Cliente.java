
package Sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente {
    public static void main(String[] args) {
        frame app=new frame();
    }
}
class frame extends JFrame{

    public frame()  {
        setTitle("App Cliente");
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lamina panel=new lamina();
        add(panel);
    }
    
}
class lamina extends JPanel implements Runnable{//para que permanezca el puerto abierto
    private JLabel te;
    private JTextField txt,nick,ip;
    private  JButton btn;
    private JTextArea campo1;
    
    public lamina() {
        te=new JLabel("CLIENTE");
        txt=new JTextField(20);
        btn=new JButton("Enviar");
        nick=new JTextField(10);
        add(nick);
        ip=new JTextField(10);
        
        add(te);
        add(ip);
        
        campo1=new JTextArea(10,40);
        add(campo1);
        add(txt);
        Envia op1=new Envia();
        btn.addActionListener(op1);
        add(btn);
        
        //hilo
    }
//instrucion del hilo
    @Override
    public void run() {
        try {
            //poner a la escucha la app
            ServerSocket serviCliente=new ServerSocket(9090);//escuchando
            Socket cliente;
            Envia paqueteResibido;
            //parq uie este a la escucha siempre
            while (true) {                
                cliente=serviCliente.accept();
                ObjectOutputStream flujoEntrda=new ObjectOutputStream(cliente.getOutputStream());
                //leer lo que hay en su interior
                
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    //clase interna
    private class Envia implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                //ip local--puerto 80: navegador: 9999
                Socket n=new Socket("192.168.1.13", 9999);//contrucion de socket
                //crear los stream los flujo de datos para trasladar informacion 
                //DataOutputStream flujoSalida=new DataOutputStream(n.getOutputStream());//objeto autputstream
                //indicar que es lo que va salir por el socket
                //flujoSalida.writeUTF(txt.getText());//escribir en el flujo de salida el texto para el servidor
                //cerrar el flujo
                //flujoSalida.close();
                paqueteEnvio datos=new paqueteEnvio();//para enpaquetar datos
                datos.setNick(nick.getText());
                datos.setIp(ip.getText());
                datos.setMsj(txt.getText());//lo que vamos a envisr ya lo tenemos dentro de datosenpaquetado
                //enviar paquete al servidorpor la red
                ObjectOutputStream paquete=new ObjectOutputStream(n.getOutputStream());
                //indicar que se enviara en ese flujo
                paquete.writeObject(datos);
                n.close();//cerrar socket
            } catch (IOException ex) {
                System.out.println("No se pudo conectar: "+ ex.getMessage());
                Logger.getLogger(lamina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}//para convertir paquete en un grupo de bytes
class paqueteEnvio implements Serializable{
    //propiedades
    private String nick;
    private String ip;
    private String msj;
    //metodos get set

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
}
