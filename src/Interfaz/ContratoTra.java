
package Interfaz;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ws.ContratoClienteExterno;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import ws.ContratoTransporte;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.IconoUtil;


public class ContratoTra extends javax.swing.JFrame {
        private WebServiceFV servicioWeb;

    
    public ContratoTra() {
        initComponents();
        
        setIconImage(IconoUtil.obtenerIcono());
         WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort();
        tblTransporte.setRowSelectionAllowed(false);
          tblTransporte.setDefaultEditor(Object.class, null);
        
        cargar_transporte();
          addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        confirmarCerrarPrograma();
    }
});
    //ancho,alto
    setSize(1150, 690);
    setResizable(false);
    
    cargar_transporte();
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
        cargar_transporte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblTransporte = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Contratos transportista");

        tblTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Contrato", "Fecha contrato", "ID orden"
            }
        ));
        jScrollPane8.setViewportView(tblTransporte);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logologo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
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
        Contrato pantalla = new Contrato();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
public void cargar_transporte() {    
        try {
    
        // Obtener la lista de transportistas del servicio web
        List<ContratoTransporte> transportes = servicioWeb.listarContratosTransporte();

        // Verifica si la lista de transportistas no está vacía
        if (transportes != null && !transportes.isEmpty()) {
            // Obtiene el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblTransporte.getModel();

            // Limpia la tabla antes de agregar nuevos datos
            model.setRowCount(0);

            // Agrega los datos de los transportistas al modelo de datos de la tabla
            for (ContratoTransporte transporte : transportes) {
                Object[] rowData = {
                    transporte.getIdContrato(),
                    transporte.getFechacontrato(),
                    transporte.getIdordent(),
  
                };
                model.addRow(rowData);
            }
        } else {
            // No hacer nada si la lista de transportistas está vacía
        }
    } catch (Exception ex) {
        // Manejar cualquier excepción que pueda ocurrir durante la obtención de datos
        ex.printStackTrace(); // Imprimir el rastreo de la pila en 
    }
 }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratoTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tblTransporte;
    // End of variables declaration//GEN-END:variables
}
