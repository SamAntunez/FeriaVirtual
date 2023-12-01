/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import util.IconoUtil;
import ws.Subasta;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;

public class Subastat extends javax.swing.JFrame {
    private WebServiceFV servicioWeb;

    
    public Subastat() {
        initComponents();
        //  btnPDF.setEnabled(false);
        
        setIconImage(IconoUtil.obtenerIcono());
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort();   
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tblReporte2.setRowSelectionAllowed(false);
        tblReporte2.setDefaultEditor(Object.class, null);
        
        
        cargar_subastas();
        
        
          addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        confirmarCerrarPrograma();
                }
             }
       );
    //ancho,alto
    setSize(1170, 650);
    setResizable(false);
    }
private void confirmarCerrarPrograma() {
    int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Seguro desea cerrar el programa?", "Confirmar Cierre",
            JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        // Si el usuario elige "Sí", cierra la aplicación
        JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación. Hasta luego.");
        System.exit(0);
    } else {
        // Si el usuario elige "No" o cierra la ventana de diálogo, se cancela el cierre de la ventana.
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte2 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxTodo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Subasta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Listado de subastas");

        tblReporte2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre cliente", "Cliente Empresa", "Origen", "Destino", "Cantida total", "Peso Total", "Horario termino", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tblReporte2);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF.png"))); // NOI18N
        btnPDF.setText("Generar PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logologo.png"))); // NOI18N

        cbxTodo.setBackground(new java.awt.Color(204, 255, 204));
        cbxTodo.setText("Seleccionar todo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(81, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)))
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbxTodo)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
   int[] selectedRows = tblReporte2.getSelectedRows();

    // Verificar si hay filas seleccionadas
    if (selectedRows.length > 0) {
        // Crear un documento PDF
        Document document = new Document();

        try {
            // Crear un objeto JFileChooser
            JFileChooser fileChooser = new JFileChooser();
            // Mostrar el diálogo de guardar archivo
            int userSelection = fileChooser.showSaveDialog(null);

            // Verificar si el usuario seleccionó un lugar para guardar
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Obtener la ruta seleccionada
                File fileToSave = fileChooser.getSelectedFile();

                // Agregar la extensión .pdf si no está presente en el nombre del archivo
                if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".pdf")) {
                    fileToSave = new File(fileToSave.getAbsolutePath() + ".pdf");
                }

                // Establecer el nombre del archivo PDF
                String pdfFileName = fileToSave.getAbsolutePath();

                // Crear el archivo PDF
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFileName));
                document.open();

                // Iterar sobre las filas seleccionadas
                for (int selectedRow : selectedRows) {
                    // Crear una nueva página para cada informe
                    document.newPage();

                    // Obtener los datos de la fila seleccionada
                    Object[] rowData = new Object[tblReporte2.getColumnCount()];
                    for (int i = 0; i < tblReporte2.getColumnCount(); i++) {
                        rowData[i] = tblReporte2.getValueAt(selectedRow, i);
                    }

                    // Resto del código para agregar contenido al PDF
                    // ...

                    // Agregar contenido al PDF
                    // ...

                    Paragraph titleAndImage = new Paragraph();
                    int titleOffset = 10; // Ajusta este valor según sea necesario

                    // Agregar espacios al principio del título para desplazarlo a la derecha
                    for (int i = 0; i < titleOffset; i++) {
                        titleAndImage.add(new Chunk(" ", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD)));
                    }

                    titleAndImage.add(new Phrase("Departamento de consultorias", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD)));

                    String imagePath = "src/Imagenes/logopdf.png"; // Ruta relativa al proyecto
                    Image image = Image.getInstance(imagePath);
                    image.scaleToFit(120, 70); // Ajustar el tamaño de la imagen según tus necesidades

                    // Ajustar la posición del logo (experimenta con este valor)
                    float logoOffsetX = 20; // Puedes ajustar este valor según sea necesario

                    titleAndImage.add(new Chunk(image, logoOffsetX, 0, true));
                    // Centrar el párrafo
                    titleAndImage.setAlignment(Element.ALIGN_CENTER);

                    // Agregar título e imagen al documento
                    document.add(titleAndImage);

                    // Agregar una línea en blanco después del título
                    document.add(new Paragraph(" "));

                    // Agregar contenido al PDF
                    document.add(new Paragraph(" "));
                    document.add(new Paragraph(" "));
                    document.add(new Paragraph("Reporte de pedido"));
                    document.add(new Paragraph(" "));

                    PdfPTable table = new PdfPTable(tblReporte2.getColumnCount());
                    document.add(new Paragraph(" "));

                    // Agregar encabezados de columna al PDF
                    for (int i = 0; i < tblReporte2.getColumnCount(); i++) {
                        table.addCell(tblReporte2.getColumnName(i));
                    }

                    // Agregar datos de fila al PDF
                    for (Object value : rowData) {
                        if (value != null) {
                            table.addCell(value.toString());
                        } else {
                            // Manejar el caso en que el valor sea null (puedes agregar un valor predeterminado o simplemente no agregarlo)
                            table.addCell("Valor Nulo");
                        }
                    }

                    document.add(table);

                    // Agregar más información debajo de la tabla
                    document.add(new Paragraph(" "));
                    document.add(new Paragraph("Informacion detallada de la tabla:"));
                    document.add(new Paragraph(" "));

                    for (int i = 0; i < tblReporte2.getColumnCount(); i++) {
                        document.add(new Paragraph("- " + tblReporte2.getColumnName(i) + ": " + rowData[i]));
                    }

                    // Agrega más líneas según sea necesario

                    // Agregar un salto de página después de cada informe
                    document.newPage();
                }

                // Mensaje de éxito
                JOptionPane.showMessageDialog(null, "PDF generado correctamente: " + pdfFileName, "Éxito", JOptionPane.INFORMATION_MESSAGE);

            } else {
                // Si el usuario cancela el diálogo, salir del método
                return;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar el documento fuera del bloque try
            if (document != null && document.isOpen()) {
                document.close();
            }
        }

    } else {
        // Si no hay filas seleccionadas, mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Selecciona al menos una fila antes de generar el PDF", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnPDFActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    public void cargar_subastas() {    
     try {
        // Obtener la lista de subastas del servicio web
        List<Subasta> subastas = servicioWeb.listarSubastas();

        // Verifica si la lista de subastas no está vacía
        if (subastas != null && !subastas.isEmpty()) {
            // Obtiene el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblReporte2.getModel();

            // Configura la tabla para permitir la selección de filas
            tblReporte2.setRowSelectionAllowed(true);
            tblReporte2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

            // Limpia la tabla antes de agregar nuevos datos
            model.setRowCount(0);

            // Agrega los datos de las subastas al modelo de datos de la tabla
            for (Subasta subasta : subastas) {
                Object[] rowData = {
                    subasta.getIdSubasta(),
                    subasta.getIdPedido(),
                    subasta.getNombreCliente(),
                    subasta.getNombreClienteEmp(),
                    subasta.getComunaOrigen(),
                    subasta.getComunaDestino(),
                    subasta.getCantidadTotal(),
                    subasta.getPesototalpedido(),
                    subasta.getHorarioTermino(),
                    subasta.getFechaSubasta()
                };
                model.addRow(rowData);
            }

            // Agrega el ListSelectionListener
            ListSelectionModel selectionModel = tblReporte2.getSelectionModel();
            selectionModel.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    // Verifica si la selección ha cambiado y si no está ajustando
                    if (!e.getValueIsAdjusting() && tblReporte2.getSelectedRow() != -1) {
                        // Obtén el índice de la fila seleccionada
                        int selectedRowIndex = tblReporte2.getSelectedRow();

                        // Obtén los datos de la fila seleccionada
                        Object[] rowData = new Object[model.getColumnCount()];
                        for (int i = 0; i < model.getColumnCount(); i++) {
                            rowData[i] = tblReporte2.getValueAt(selectedRowIndex, i);
                        }

                        // Realiza acciones con los datos de la fila seleccionada si es necesario
                        // ...

                        // Ejemplo: Imprimir los datos en la consola
                        System.out.println("Fila seleccionada: " + Arrays.toString(rowData));
                    }
                }
            });

            // Agrega el ItemListener al JCheckBox cbxTodo
            cbxTodo.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    // Verifica si el JCheckBox está seleccionado
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        // Selecciona todas las filas
                        tblReporte2.selectAll();
                    } else {
                        // Deselecciona todas las filas
                        tblReporte2.clearSelection();
                    }
                }
            });
        } else {
            // No hacer nada si la lista de subastas está vacía
        }
    } catch (Exception ex) {
        // Manejar cualquier excepción que pueda ocurrir durante la obtención de datos
        ex.printStackTrace(); // Imprimir el rastreo de la pila en la consola para depuración
    }
    }
    
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
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subastat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox cbxTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporte2;
    // End of variables declaration//GEN-END:variables
}
