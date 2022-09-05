/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Compra;
import Clases.Lider;
import Clases.Proyecto;
import Controlador.CtCompra;
import Controlador.CtLider;
import Controlador.CtProyecto;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 *
 * @author Katherin
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    
    CtLider ctlider;
    CtProyecto ctproyecto;
    CtCompra ctcompra;
    
    //Método para llenar el jtable de líderes con la info consultada y almacenada en el array    
    public void rellenarLideres(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ArrayList<Object>nombreColumna = new ArrayList<>(); //array que almacena los nombres de columnas   
        ctlider = new CtLider();
        
        //Lleno la lista nombreColumnas con los nombres que necesito        
        nombreColumna.add("ID Líder");
        nombreColumna.add("Nombre");
        nombreColumna.add("Primer Apellido");
        nombreColumna.add("Ciudad Residencia");
        
        //Añado al modelo de la tabla las columnas que defini
        for(Object columna: nombreColumna){
            modelo.addColumn(columna);
        }        
        //Le paso al jtable el modelo con los datos de las columnas        
        this.tblLideres.setModel(modelo);
        
        //Creo un array para almacenar la consulta de lideres de la bd
        ArrayList<Lider> arrList = new ArrayList<>();
        arrList = ctlider.listarLideres();
                       
        //recorro el array para mandarle al modelo en las filas todo lo que hay allí
        for(Lider arr: arrList){
            Object rowData[] = {arr.getId_lider(), arr.getNombre(), arr.getPrimer_apellido(), arr.getCiudad_residencia()};
            modelo.addRow(rowData);
        }  
        
        //Le llevo a jtable "tbLideres" lo que almacene en el modelo
         tblLideres.setModel(modelo);
        
        
    }
    
    
    //Método para llenar el jtable de proyectos con la info consultada y almacenada en el array    
    public void rellenarProyectos(){
        DefaultTableModel modelop = new DefaultTableModel();
        
        ArrayList<Object>nombreColumna = new ArrayList<>(); //array que almacena los nombres de columnas   
        ctproyecto = new CtProyecto();
        
        //Lleno la lista nombreColumnas con los nombres que necesito        
        nombreColumna.add("ID Proyecto");
        nombreColumna.add("Constructora");
        nombreColumna.add("Número Habitaciones");
        nombreColumna.add("Ciudad");
        
        //Añado al modelo de la tabla las columnas que defini
        for(Object columna: nombreColumna){
            modelop.addColumn(columna);
        }        
        //Le paso al jtable el modelo con los datos de las columnas   
        this.tblProyectos.setModel(modelop);
                
        //Creo un array para almacenar la consulta de proyectos de la bd
        ArrayList<Proyecto> arrList = new ArrayList<>();
        arrList = ctproyecto.listarProyecto();
                        
        //recorro el array para mandarle al modelo en las filas todo lo que hay allí
        for(Proyecto arr: arrList){
            Object rowData[] = {arr.getId_proyecto(), arr.getConstructora(), arr.getNumero_habitaciones(), arr.getCiudad()};
            modelop.addRow(rowData);
        }  
        
        //Le llevo a jtable "tblProyectos" lo que almacene en el modelo
        tblProyectos.setModel(modelop);        
                
    }
    
    //Método para llenar el jtable de compras con la info consultada y almacenada en el array    
    public void rellenarCompras(){
        DefaultTableModel modeloc = new DefaultTableModel();
        
        ArrayList<Object>nombreColumna = new ArrayList<>(); //array que almacena los nombres de columnas   
        ctcompra = new CtCompra();
        
        //Lleno la lista nombreColumnas con los nombres que necesito        
        nombreColumna.add("ID Compra");
        nombreColumna.add("Constructora");
        nombreColumna.add("Banco Vinculado");
                
        //Añado al modelo de la tabla las columnas que defini
        for(Object columna: nombreColumna){
            modeloc.addColumn(columna);
        }        
        //Le paso al jtable el modelo con los datos de las columnas        
        this.tblCompras.setModel(modeloc);
        
        //Creo un array para almacenar la consulta de compras de la bd
        ArrayList<Compra> arrList = new ArrayList<>();
        arrList = ctcompra.listarCompra();
                       
        //recorro el array para mandarle al modelo en las filas todo lo que hay allí
        for(Compra arr: arrList){
            Object rowData[] = {arr.getId_compra(), arr.getConstructora(), arr.getBanco_vinculado()};
            modeloc.addRow(rowData);
        }  
        
        //Le llevo a jtable "tblCompras" lo que almacene en el modelo
         tblCompras.setModel(modeloc);
        
        
    }
    

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        rellenarLideres();
        rellenarProyectos();
        rellenarCompras();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInforme1 = new javax.swing.JPanel();
        jLabelInforme1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLideres = new javax.swing.JTable();
        btnExportarLideres = new javax.swing.JButton();
        jPanelInforme2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        btnExportarProyectos = new javax.swing.JButton();
        jPanelInforme3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        jLabelInforme3 = new javax.swing.JLabel();
        btnExportarCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelInforme1.setBackground(new java.awt.Color(204, 204, 255));
        jLabelInforme1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelInforme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInforme1.setText("Informe de Lideres");

        tblLideres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLideres);

        btnExportarLideres.setText("Exportar");
        btnExportarLideres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarLideresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInforme1Layout = new javax.swing.GroupLayout(jPanelInforme1);
        jPanelInforme1.setLayout(jPanelInforme1Layout);
        jPanelInforme1Layout.setHorizontalGroup(
            jPanelInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInforme1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(jPanelInforme1Layout.createSequentialGroup()
                .addGroup(jPanelInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInforme1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInforme1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(btnExportarLideres)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInforme1Layout.setVerticalGroup(
            jPanelInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInforme1Layout.createSequentialGroup()
                .addComponent(jLabelInforme1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportarLideres)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe 1", jPanelInforme1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informe Proyectos");

        tblProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProyectos);

        btnExportarProyectos.setText("Exportar");
        btnExportarProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarProyectosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInforme2Layout = new javax.swing.GroupLayout(jPanelInforme2);
        jPanelInforme2.setLayout(jPanelInforme2Layout);
        jPanelInforme2Layout.setHorizontalGroup(
            jPanelInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme2Layout.createSequentialGroup()
                .addGroup(jPanelInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInforme2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInforme2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInforme2Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btnExportarProyectos)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelInforme2Layout.setVerticalGroup(
            jPanelInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnExportarProyectos)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe 2", jPanelInforme2);

        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblCompras);

        jLabelInforme3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelInforme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInforme3.setText("Informe Compras");

        btnExportarCompras.setText("Exportar");
        btnExportarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInforme3Layout = new javax.swing.GroupLayout(jPanelInforme3);
        jPanelInforme3.setLayout(jPanelInforme3Layout);
        jPanelInforme3Layout.setHorizontalGroup(
            jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme3Layout.createSequentialGroup()
                .addGroup(jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInforme3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                            .addComponent(jLabelInforme3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelInforme3Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnExportarCompras)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelInforme3Layout.setVerticalGroup(
            jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelInforme3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportarCompras)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe 3", jPanelInforme3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarLideresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarLideresActionPerformed
        // TODO add your handling code here:
        
        String nombre_archivo = JOptionPane.showInputDialog("Por favor ingrese el nombre del archivo");
        
        //Inicio validación si el nombre del archivo es null
        boolean opcionInvalida = true; //que no sea null y que tenga menos de un caracter

        if (nombre_archivo == null) {
            opcionInvalida = false;
        } else if (nombre_archivo.length() >= 1) {
            opcionInvalida = false;
        }

        while (opcionInvalida) {
            JOptionPane.showMessageDialog(null, "El nombre de archivo debe tener al menos un caracter");
            nombre_archivo = JOptionPane.showInputDialog("Por favor ingrese el nombre del archivo");

            if (nombre_archivo == null) {
                opcionInvalida = false;
            } else if (nombre_archivo.length() >= 1) {
                opcionInvalida = false;
            }            

        }
        
        if(nombre_archivo == null){
            return;
        }        
        //Fin validación si el nombre del archivo es null

        
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet();
        book.setSheetName(0, "Lideres");

        String[] headers = new String[]{
            "ID Lider",
            "Nombre",
            "Primer Apellido",
            "Ciudad de Residencia"            
        };

        //Estilo fondo Header
        CellStyle headerCellStyle = book.createCellStyle();        
        headerCellStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
        headerCellStyle.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);       
       
        //Estilo fuente header
        HSSFFont font = book.createFont();
        font.setBold(true);
        font.setFontName("Century Gothic");
        headerCellStyle.setFont(font);
        
        //Crear objeto row
        HSSFRow headerRow = sheet.createRow(0);        
        
        //estilo filas        
        HSSFFont fontRow = book.createFont();      
        fontRow.setFontName("Century Gothic");        
        CellStyle headerCellStyleRow = book.createCellStyle();        
        headerCellStyleRow.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        headerCellStyleRow.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        headerCellStyleRow.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyleRow.setFont(fontRow);

        //for para crear los encabezados, nombres de las columnas
        for (int i = 0; i < headers.length; i++) {
            String header = headers[i];
            HSSFCell cell = headerRow.createCell(i);
            cell.setCellStyle(headerCellStyle);
            cell.setCellValue(header);
        }
        
        //Creo un array para almacenar la consulta de lideres de la bd
        ArrayList<Lider> arrList = new ArrayList<>();
        arrList = ctlider.listarLideres();
        
        for (int i = 0; i < arrList.size(); i++) {
            
            HSSFRow row = sheet.createRow(i + 1); //Creo la fila i+1, porque en la primera estarían los headers        
            
            //Creo unas variables para almacenar cada campo del array    
            int id_lider = arrList.get(i).getId_lider();
            String nombre = arrList.get(i).getNombre();
            String primer_apellido = arrList.get(i).getPrimer_apellido();
            String ciudad_residencia = arrList.get(i).getCiudad_residencia();
            
           
            //A cada celda le asigno el valor de las variables
            row.createCell(0).setCellValue(id_lider);
            row.getCell(0).setCellStyle(headerCellStyleRow);                        
            row.createCell(1).setCellValue(nombre);
            row.getCell(1).setCellStyle(headerCellStyleRow);            
            row.createCell(2).setCellValue(primer_apellido);
            row.getCell(2).setCellStyle(headerCellStyleRow);            
            row.createCell(3).setCellValue(ciudad_residencia);
            row.getCell(3).setCellStyle(headerCellStyleRow);               
            
        }        

        try {
            FileOutputStream file = new FileOutputStream(nombre_archivo + ".xls");
            try {
                book.write(file);
                file.close();
                JOptionPane.showMessageDialog(null, "Archivo creado");
            } catch (IOException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarLideresActionPerformed

    private void btnExportarProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarProyectosActionPerformed
        // TODO add your handling code here:
        
         String nombre_archivo = JOptionPane.showInputDialog("Por favor ingrese el nombre del archivo");
        
        //Inicio validación si el nombre del archivo es null
        boolean opcionInvalida = true; //que no sea null y que tenga menos de un caracter

        if (nombre_archivo == null) {
            opcionInvalida = false;
        } else if (nombre_archivo.length() >= 1) {
            opcionInvalida = false;
        }

        while (opcionInvalida) {
            JOptionPane.showMessageDialog(null, "El nombre de archivo debe tener al menos un caracter");
            nombre_archivo = JOptionPane.showInputDialog("Por favor ingrese el nombre del archivo");

            if (nombre_archivo == null) {
                opcionInvalida = false;
            } else if (nombre_archivo.length() >= 1) {
                opcionInvalida = false;
            }            

        }
        
        if(nombre_archivo == null){
            return;
        }        
        //Fin validación si el nombre del archivo es null

        
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet();
        book.setSheetName(0, "Proyectos");

        String[] headers = new String[]{
            "ID Proyecto",
            "Constructora",
            "Número de Habitaciones",
            "Ciudad"            
        };

        //Estilo fondo Header
        CellStyle headerCellStyle = book.createCellStyle();        
        headerCellStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
        headerCellStyle.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);       
       
        //Estilo fuente header
        HSSFFont font = book.createFont();
        font.setBold(true);
        font.setFontName("Century Gothic");
        headerCellStyle.setFont(font);
        
        //Crear objeto row
        HSSFRow headerRow = sheet.createRow(0);        
        
        //estilo filas        
        HSSFFont fontRow = book.createFont();      
        fontRow.setFontName("Century Gothic");        
        CellStyle headerCellStyleRow = book.createCellStyle();        
        headerCellStyleRow.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        headerCellStyleRow.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        headerCellStyleRow.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyleRow.setFont(fontRow);

        //for para crear los encabezados, nombres de las columnas
        for (int i = 0; i < headers.length; i++) {
            String header = headers[i];
            HSSFCell cell = headerRow.createCell(i);
            cell.setCellStyle(headerCellStyle);
            cell.setCellValue(header);
        }
        
        //Creo un array para almacenar la consulta de lideres de la bd
        ArrayList<Proyecto> arrList = new ArrayList<>();
        arrList = ctproyecto.listarProyecto();
        
        for (int i = 0; i < arrList.size(); i++) {
            
            HSSFRow row = sheet.createRow(i + 1); //Creo la fila i+1, porque en la primera estarían los headers        
            
            //Creo unas variables para almacenar cada campo del array    
            int id_proyecto = arrList.get(i).getId_proyecto();
            String constructora = arrList.get(i).getConstructora();
            double numero_habitaciones = arrList.get(i).getNumero_habitaciones();
            String ciudad = arrList.get(i).getCiudad();
            
           
            //A cada celda le asigno el valor de las variables
            row.createCell(0).setCellValue(id_proyecto);
            row.getCell(0).setCellStyle(headerCellStyleRow);                        
            row.createCell(1).setCellValue(constructora);
            row.getCell(1).setCellStyle(headerCellStyleRow);            
            row.createCell(2).setCellValue(numero_habitaciones);
            row.getCell(2).setCellStyle(headerCellStyleRow);            
            row.createCell(3).setCellValue(ciudad);
            row.getCell(3).setCellStyle(headerCellStyleRow);               
            
        }        

        try {
            FileOutputStream file = new FileOutputStream(nombre_archivo + ".xls");
            try {
                book.write(file);
                file.close();
                JOptionPane.showMessageDialog(null, "Archivo creado");
            } catch (IOException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarProyectosActionPerformed

    private void btnExportarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarComprasActionPerformed
        // TODO add your handling code here:
        
        String nombre_archivo = JOptionPane.showInputDialog("Por favor ingrese el nombre del archivo");
        
        //Inicio validación si el nombre del archivo es null
        boolean opcionInvalida = true; //que no sea null y que tenga menos de un caracter

        if (nombre_archivo == null) {
            opcionInvalida = false;
        } else if (nombre_archivo.length() >= 1) {
            opcionInvalida = false;
        }

        while (opcionInvalida) {
            JOptionPane.showMessageDialog(null, "El nombre de archivo debe tener al menos un caracter");
            nombre_archivo = JOptionPane.showInputDialog("Por favor ingrese el nombre del archivo");

            if (nombre_archivo == null) {
                opcionInvalida = false;
            } else if (nombre_archivo.length() >= 1) {
                opcionInvalida = false;
            }            

        }
        
        if(nombre_archivo == null){
            return;
        }        
        //Fin validación si el nombre del archivo es null

        
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet();
        book.setSheetName(0, "Compras");

        String[] headers = new String[]{
            "ID Compra",
            "Constructora",
            "Banco Vinculado"                  
        };

        //Estilo fondo Header
        CellStyle headerCellStyle = book.createCellStyle();        
        headerCellStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
        headerCellStyle.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);       
       
        //Estilo fuente header
        HSSFFont font = book.createFont();
        font.setBold(true);
        font.setFontName("Century Gothic");
        headerCellStyle.setFont(font);
        
        //Crear objeto row
        HSSFRow headerRow = sheet.createRow(0);        
        
        //estilo filas        
        HSSFFont fontRow = book.createFont();      
        fontRow.setFontName("Century Gothic");        
        CellStyle headerCellStyleRow = book.createCellStyle();        
        headerCellStyleRow.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        headerCellStyleRow.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        headerCellStyleRow.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyleRow.setFont(fontRow);

        //for para crear los encabezados, nombres de las columnas
        for (int i = 0; i < headers.length; i++) {
            String header = headers[i];
            HSSFCell cell = headerRow.createCell(i);
            cell.setCellStyle(headerCellStyle);
            cell.setCellValue(header);
        }
        
        //Creo un array para almacenar la consulta de lideres de la bd
        ArrayList<Compra> arrList = new ArrayList<>();
        arrList = ctcompra.listarCompra();
        
        for (int i = 0; i < arrList.size(); i++) {
            
            HSSFRow row = sheet.createRow(i + 1); //Creo la fila i+1, porque en la primera estarían los headers        
            
            //Creo unas variables para almacenar cada campo del array    
            int id_compra = arrList.get(i).getId_compra();
            String constructora = arrList.get(i).getConstructora();
            String banco_vinculado = arrList.get(i).getBanco_vinculado();
            
           
            //A cada celda le asigno el valor de las variables
            row.createCell(0).setCellValue(id_compra);
            row.getCell(0).setCellStyle(headerCellStyleRow);                        
            row.createCell(1).setCellValue(constructora);
            row.getCell(1).setCellStyle(headerCellStyleRow);            
            row.createCell(2).setCellValue(banco_vinculado);
            row.getCell(2).setCellStyle(headerCellStyleRow);            
             
            
        }        

        try {
            FileOutputStream file = new FileOutputStream(nombre_archivo + ".xls");
            try {
                book.write(file);
                file.close();
                JOptionPane.showMessageDialog(null, "Archivo creado");
            } catch (IOException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarComprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportarCompras;
    private javax.swing.JButton btnExportarLideres;
    private javax.swing.JButton btnExportarProyectos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInforme1;
    private javax.swing.JLabel jLabelInforme3;
    private javax.swing.JPanel jPanelInforme1;
    private javax.swing.JPanel jPanelInforme2;
    private javax.swing.JPanel jPanelInforme3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTable tblLideres;
    private javax.swing.JTable tblProyectos;
    // End of variables declaration//GEN-END:variables
}
