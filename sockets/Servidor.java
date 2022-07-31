package Sockets;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
//resivir texto y en segunda plano permanecer a lña escucha y terner puerto abierto

public class Servidor {

    public static void main(String[] args) {
        frame2 app = new frame2();
        app.setTitle("App servidor");
        app.setSize(500, 500);
        app.setLocationRelativeTo(null);
        app.setResizable(false);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}

class frame2 extends JFrame implements Runnable {

    private JTextArea area;

    public frame2() {
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new BorderLayout());
        area = new JTextArea();
        lamina2.add(area, BorderLayout.CENTER);
        add(lamina2);
        setVisible(true);
        
        Thread hilo = new Thread(this);
        hilo.start();
        
    }

    //crear hilo
    @Override
    public void run() {
        //JOptionPane.showMessageDialog(null, "escucha");
        try {
            //direccion a la escucha
            ServerSocket servidor = new ServerSocket(9999);
            String nick,ip,mesj;
            //instanciar paquete envio
            paqueteEnvio resibido;
            //acepte las conexiones del puerto 999
            while (true) {//buque se ejecuta constantemente

                Socket puerta = servidor.accept();//flujo que acepta las conexiones
                //resibir objetos
                ObjectInputStream datos=new ObjectInputStream(puerta.getInputStream());
                //almacenar lo leido
                resibido=(paqueteEnvio) datos.readObject();
                //acceder a la info del pQUETE
                nick=resibido.getNick();
                ip=resibido.getIp();
                mesj=resibido.getMsj();
                //poner en el arrea de texto
                area.append("\n"+nick+": "+mesj+" para "+ip);
                //crear un puente por donde viaje la informacion
                Socket enviaDestinatario=new Socket(ip,9090);//por donde viaja la info del servidor a el otro cliente
                //enviar el paquete por ese socket
                ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaDestinatario.getOutputStream());
                //meter la info dentro de ese flujo que hemos creado y esta vacío
                paqueteReenvio.writeObject(resibido);
                //cerra
                enviaDestinatario.close();
                //crear flujo de datos de entrada para recojer lo que a enviado el cliente
                //DataInputStream flijoEntrada = new DataInputStream(puerta.getInputStream());//por que socket viaja la info
                //saber leer el mensaje
                //String mensaje = flijoEntrada.readUTF();
                //decirle que lo escriba en el jtext area
                //area.append("\n" + mensaje);
                //cerrar socket
                puerta.close();
                
            }
        } catch (IOException ex) {
            Logger.getLogger(frame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
