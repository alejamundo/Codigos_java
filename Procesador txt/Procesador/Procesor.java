package Procesador;

import javax.swing.JMenuItem;
import javax.swing.text.StyledEditorKit;

public class Procesor extends javax.swing.JFrame {
    
 
    
    public static void main(String args[]) {
        System.out.println("Exelente");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Procesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Procesor().setVisible(true);
            }
        });
    }

    public Procesor() {
        
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fuente = new javax.swing.JMenu();
        arial = new javax.swing.JMenuItem();
        currier = new javax.swing.JMenuItem();
        verdana = new javax.swing.JMenuItem();
        estilo = new javax.swing.JMenu();
        negrita = new javax.swing.JMenuItem();
        cursiva = new javax.swing.JMenuItem();
        tamagno = new javax.swing.JMenu();
        tam12 = new javax.swing.JMenuItem();
        tam16 = new javax.swing.JMenuItem();
        tam20 = new javax.swing.JMenuItem();
        tam24 = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        pegar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Archivo = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de texto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fuente.setText("Fuente");
        fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteActionPerformed(evt);
            }
        });

        arial.setText("Arial");
        arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arialActionPerformed(evt);
            }
        });
        fuente.add(arial);

        currier.setText("Courier");
        currier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currierActionPerformed(evt);
            }
        });
        fuente.add(currier);

        verdana.setText("Verdana");
        verdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdanaActionPerformed(evt);
            }
        });
        fuente.add(verdana);

        jMenuBar1.add(fuente);

        estilo.setText("Estilo");

        negrita.setText("Negrita");
        negrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negritaActionPerformed(evt);
            }
        });
        estilo.add(negrita);

        cursiva.setText("Cursiva");
        cursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursivaActionPerformed(evt);
            }
        });
        estilo.add(cursiva);

        jMenuBar1.add(estilo);

        tamagno.setText("Tamaño");

        tam12.setText("12");
        tam12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam12ActionPerformed(evt);
            }
        });
        tamagno.add(tam12);

        tam16.setText("16");
        tam16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam16ActionPerformed(evt);
            }
        });
        tamagno.add(tam16);

        tam20.setText("20");
        tam20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam20ActionPerformed(evt);
            }
        });
        tamagno.add(tam20);

        tam24.setText("24");
        tam24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam24ActionPerformed(evt);
            }
        });
        tamagno.add(tam24);

        jMenuBar1.add(tamagno);

        edicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/stile.gif"))); // NOI18N
        edicion.setText("Edicion");

        pegar.setText("Pegar");
        edicion.add(pegar);

        jMenuItem3.setText("cortar");
        edicion.add(jMenuItem3);

        jMenuBar1.add(edicion);

        Archivo.setText("Archivo");
        jMenuBar1.add(Archivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void arialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arialActionPerformed
        arial.addActionListener(new StyledEditorKit.FontFamilyAction("Fuente", "Arial"));
    }//GEN-LAST:event_arialActionPerformed

    private void currierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currierActionPerformed
        currier.addActionListener(new StyledEditorKit.FontFamilyAction("Fuente", "Courier"));
    }//GEN-LAST:event_currierActionPerformed

    private void verdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdanaActionPerformed
        verdana.addActionListener(new StyledEditorKit.FontFamilyAction("Fuente", "Verdana"));
    }//GEN-LAST:event_verdanaActionPerformed

    private void fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuenteActionPerformed

    private void negritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negritaActionPerformed
        negrita.addActionListener(new StyledEditorKit.BoldAction());
    }//GEN-LAST:event_negritaActionPerformed

    private void cursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursivaActionPerformed
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
    }//GEN-LAST:event_cursivaActionPerformed

    private void tam12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam12ActionPerformed
        tam12.addActionListener(new StyledEditorKit.FontSizeAction("Tamaño", 12));
    }//GEN-LAST:event_tam12ActionPerformed

    private void tam16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam16ActionPerformed
        tam16.addActionListener(new StyledEditorKit.FontSizeAction("Tamaño", 16));
    }//GEN-LAST:event_tam16ActionPerformed

    private void tam20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam20ActionPerformed
        tam20.addActionListener(new StyledEditorKit.FontSizeAction("Tamaño", 20));
    }//GEN-LAST:event_tam20ActionPerformed

    private void tam24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam24ActionPerformed
        tam24.addActionListener(new StyledEditorKit.FontSizeAction("Tamaño", 24));
    }//GEN-LAST:event_tam24ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JTextPane area;
    private javax.swing.JMenuItem arial;
    private javax.swing.JMenuItem currier;
    private javax.swing.JMenuItem cursiva;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenu estilo;
    private javax.swing.JMenu fuente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem negrita;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenuItem tam12;
    private javax.swing.JMenuItem tam16;
    private javax.swing.JMenuItem tam20;
    private javax.swing.JMenuItem tam24;
    private javax.swing.JMenu tamagno;
    private javax.swing.JMenuItem verdana;
    // End of variables declaration//GEN-END:variables
}
