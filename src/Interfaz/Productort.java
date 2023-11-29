package Interfaz;

import Widget.TextPrompt;
import java.awt.Image;
import java.awt.Toolkit;
import ws.Productor;
import java.util.Calendar;
import javax.swing.JOptionPane;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import util.IconoUtil;
import ws.Comuna;
import ws.Pais;
import ws.Region;

public class Productort extends javax.swing.JFrame {
    // Mapa para asociar nombres de países con sus IDs
private Map<String, String> paisesMap = new HashMap<>();

// Mapa para asociar nombres de regiones con sus IDs
private Map<String, String> regionesMap = new HashMap<>();

// Mapa para asociar nombres de comunas con sus IDs
private Map<String, String> comunasMap = new HashMap<>();

 private void limpiarCampos() {
        txtRut.setText("");
        txtDV.setText("");
        txtNombre.setText("");
        txtApellidop.setText("");
        txtApellidom.setText("");
        
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtFecha.setText("");
        txtContra.setText("");
 }
    private WebServiceFV servicioWeb;
    
    public Productort() {
        initComponents();
        
        setIconImage(IconoUtil.obtenerIcono());
        tblProductor.setRowSelectionAllowed(false);
        tblProductor.setDefaultEditor(Object.class, null);
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort(); 
        DefaultTableModel model = (DefaultTableModel) tblProductor.getModel();
        tblProductor.setDefaultEditor(Object.class, null);
        tblProductor.setRowSelectionAllowed(false);
         TextPrompt prueba = new TextPrompt("dd-mm-yyyy", txtFecha);
        // TextPrompt prueba2 = new TextPrompt("1 a 346", txtComuna);
      
        
  tblProductor.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int filaSeleccionada = tblProductor.getSelectedRow();
        int columnaRut = 0; // Índice de la columna del rut en la tabla
        int columnaNombre = 2; // Índice de la columna del nombre en la tabla
       
        // Verifica si se hizo clic en la columna del rut
        if (tblProductor.columnAtPoint(e.getPoint()) == columnaRut) {
            // Obtiene el valor del rut de la fila seleccionada
            Integer rutInt = (Integer) tblProductor.getValueAt(filaSeleccionada, columnaRut);
            String rut = String.valueOf(rutInt);

            // Obtiene el valor del nombre de la fila seleccionada
            String nombre = (String) tblProductor.getValueAt(filaSeleccionada, columnaNombre);

            // Abre la ventana Productos.java pasando el rut y el nombre como parámetros
            Productost productosVentana = new Productost(rut, nombre);
            productosVentana.setVisible(true);
        }
    }
});
    //ancho,alto
    setSize(1380, 800);
    setResizable(false);
    
    cmbPaisActionPerformed(null);
    cmbPais.removeAllItems();
    cmbRegionActionPerformed(null);
    cmbRegion.removeAllItems();
    cmbComunaActionPerformed(null);
    cmbComuna.removeAllItems();
  
        
    
    cargar_productores();
    
       addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        confirmarCerrarPrograma();
                    }
                }
            );
     
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
 @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logo.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductor = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        btnBuscarProductor = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApellidop = new javax.swing.JTextField();
        txtApellidom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        cmbRegion = new javax.swing.JComboBox<>();
        cmbComuna = new javax.swing.JComboBox<>();
        txtPais = new javax.swing.JLabel();
        txtRegion = new javax.swing.JLabel();
        txtComunacmb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Productor");

        jLabel3.setText("Rut");

        jLabel4.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ingresar datos");

        tblProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut ", "DV", "Nombre", "Apellido P", "Apellido M", "Fecha nacimiento", "Direccion", "Correo", "Contraseña", "Ciudad"
            }
        ));
        jScrollPane2.setViewportView(tblProductor);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscarProductor.setText("Buscar Productor");
        btnBuscarProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductorActionPerformed(evt);
            }
        });

        jLabel11.setText("Apellido paterno");

        jLabel12.setText("Apellido materno");

        jLabel13.setText("Direccion");

        jLabel14.setText("Correo");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel15.setText("Fecha nacimiento");

        jLabel5.setText("Contraseña");

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("-");

        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        cmbRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegionActionPerformed(evt);
            }
        });

        cmbComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComunaActionPerformed(evt);
            }
        });

        txtPais.setText("Pais");

        txtRegion.setText("Region");

        txtComunacmb.setText("Comuna");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(559, 559, 559))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6))
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(txtPais)
                            .addComponent(txtRegion)
                            .addComponent(txtComunacmb)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidom, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRut, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(txtNombre))
                                .addGap(12, 12, 12)
                                .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnBuscarProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProductor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComunacmb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

private String obtenerIdComunaSeleccionado() {
    String nombreComunaSeleccionada = (String) cmbComuna.getSelectedItem();
    String idComunaSeleccionada = comunasMap.get(nombreComunaSeleccionada);
    return idComunaSeleccionada;
}
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
   //String idComunaleccionada = obtenerIdComunaSeleccionado();
   String idComunaleccionada = obtenerIdComunaSeleccionado();
    String rutString = txtRut.getText();
    String dv = txtDV.getText();
    String nombre = txtNombre.getText();
    String apellidop = txtApellidop.getText();
    String apellidom = txtApellidom.getText();
    String fechaNacimiento = txtFecha.getText();
    String direccion = txtDireccion.getText();
    String correo = txtCorreo.getText();
    String contrasena = new String(txtContra.getPassword());
   // String comuna = txtComuna.getText(); // Debes establecer el valor de comuna_idcomuna correctamente

    // Verifica si los campos obligatorios están llenos
    if (rutString.isEmpty() || dv.isEmpty() || nombre.isEmpty() || apellidop.isEmpty() || apellidom.isEmpty() || 
        fechaNacimiento.isEmpty() || direccion.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || idComunaleccionada.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar agregar el productor.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        int rut;
        try {
            // Intenta convertir el RUT a un número entero
            rut = Integer.parseInt(rutString);
        } catch (NumberFormatException e) {
            // Si no se puede convertir a un número, muestra un mensaje de error y sale del método
            JOptionPane.showMessageDialog(this, "El RUT debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Llama al método del servicio web para agregar el productor
       boolean registrado = servicioWeb.agregarProductor(rut, dv, nombre, apellidop, apellidom, fechaNacimiento, direccion, correo, contrasena, idComunaleccionada);

        if (registrado) {
            // El productor se registró correctamente
            JOptionPane.showMessageDialog(this, "Productor registrado correctamente.");
            // Puedes limpiar los campos después de registrar el productor si lo deseas
            limpiarCampos();
            // Actualiza la tabla después de registrar el productor
        } else {
            // Hubo un error al registrar el productor
            JOptionPane.showMessageDialog(this, "Error al registrar el productor. Inténtalo de nuevo.");
        }
    }
    cargar_productores();
                                              
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  //  String idComunaleccionada = obtenerIdComunaSeleccionado(); 
    String idComunaleccionada = obtenerIdComunaSeleccionado();
    String rutString = txtRut.getText();
    String nombre = txtNombre.getText();
    String apellidop = txtApellidop.getText();
    String apellidom = txtApellidom.getText();
    String fechaNacimiento = txtFecha.getText();
    String direccion = txtDireccion.getText();
    String correo = txtCorreo.getText();
    String contrasena = new String(txtContra.getPassword());
   // String comuna = txtComuna.getText();
     // Obtener el valor de la comuna
    
    // Verificar si los campos obligatorios están llenos
    if (rutString.isEmpty() || nombre.isEmpty() || apellidop.isEmpty() || apellidom.isEmpty() || 
        fechaNacimiento.isEmpty() || direccion.isEmpty() || correo.isEmpty() || 
        contrasena.isEmpty() || idComunaleccionada.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar modificar el productor.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Intentar convertir el RUT a un número entero
            int rutabuscar = Integer.parseInt(rutString);

            // Llamar al método del servicio web para modificar el productor
            boolean modificado = servicioWeb.modificarProductor(rutabuscar, nombre, apellidop, apellidom, fechaNacimiento, direccion, correo, contrasena, idComunaleccionada);

            if (modificado) {
                // El productor se modificó correctamente
                JOptionPane.showMessageDialog(this, "Productor modificado correctamente.");
                // Puedes limpiar los campos después de modificar el productor si lo deseas
                limpiarCampos();
                // Actualizar la tabla después de modificar el productor
            } else {
                // Hubo un error al modificar el productor
                JOptionPane.showMessageDialog(this, "Error al modificar el productor. Inténtalo de nuevo.");
            }
        } catch (NumberFormatException e) {
            // Si no se puede convertir el RUT a un número, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El RUT debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    cargar_productores();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductorActionPerformed
        
    }//GEN-LAST:event_btnBuscarProductorActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       String rutEliminar = txtRut.getText();
    
    // Verificar si el campo RUT está lleno
    if (rutEliminar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa el RUT del productor que deseas eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Intentar convertir el RUT a un número entero
            int rutAEliminar = Integer.parseInt(rutEliminar);
            
            // Llamar al método del servicio web para eliminar definitivamente el productor
            boolean eliminado = servicioWeb.eliminarDefinitivoProductor(rutAEliminar);
            
            if (eliminado) {
                // El productor se eliminó definitivamente correctamente
                JOptionPane.showMessageDialog(this, "Productor eliminado definitivamente correctamente.");
                // Puedes limpiar los campos después de eliminar el productor si lo deseas
                limpiarCampos();
                // Actualizar la tabla después de eliminar el productor
            } else {
                // Hubo un error al eliminar el productor
                JOptionPane.showMessageDialog(this, "Error al eliminar el productor. Verifica el RUT e inténtalo de nuevo.");
            }
        } catch (NumberFormatException e) {
            // Si no se puede convertir el RUT a un número, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El RUT debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    cargar_productores();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
         try {
        cmbPais.addItem("Seleccione país");
        // Llamar al método para obtener la lista de países desde el servicio web
        int selectedIndex = cmbPais.getSelectedIndex();
        List<Pais> listarpaises = servicioWeb.listarPais();

        // Limpiar cmbPais y agregar "Seleccione País"
        cmbPais.removeAllItems();

        // Llenar cmbPais con los nombres de los países y asociarlos con sus IDs
        for (Pais pais : listarpaises) {
            cmbPais.addItem(pais.getNombrepais());
            // Asociar el nombre del país con su ID en el mapa
            paisesMap.put(pais.getNombrepais(), pais.getIdpais());
        }

        // Actualizar cmbRegion automáticamente al seleccionar un país
        cmbRegionActionPerformed(null);

        cmbPais.setSelectedIndex(selectedIndex);

        // Actualizar la tabla aquí llamando al método que maneja la actualización de la tabla
       

    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los países: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void cmbRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRegionActionPerformed
         try {
        // Obtener el nombre del país seleccionado en cmbPais
        String nombrePaisSeleccionado = (String) cmbPais.getSelectedItem();
        // Obtener el ID del país seleccionado desde el mapa de países
        String idPaisSeleccionado = paisesMap.get(nombrePaisSeleccionado);

        // Llamar al método para obtener la lista de regiones según el ID del país
        List<Region> listaRegiones = servicioWeb.listarRegionesPorIDPais(idPaisSeleccionado);

        // Limpiar cmbRegion y agregar "Seleccione Región"
        //cmbRegion.removeAllItems();
      

        // Llenar cmbRegion con los nombres de las regiones
        for (Region region : listaRegiones) {
            cmbRegion.addItem(region.getNombreregion());
            // Asociar el nombre de la región con su ID en el mapa
            regionesMap.put(region.getNombreregion(), region.getIdregion());
        }

        // Actualizar la tabla aquí llamando al método que maneja la actualización de la tabla
        

    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar las regiones: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    }//GEN-LAST:event_cmbRegionActionPerformed

    private void cmbComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComunaActionPerformed
        try {
        // Obtener el nombre de la región seleccionada en cmbRegion
        String nombreRegionSeleccionada = (String) cmbRegion.getSelectedItem();

        // Verificar si se ha seleccionado una región
        if (nombreRegionSeleccionada != null && !nombreRegionSeleccionada.isEmpty() && !nombreRegionSeleccionada.equals("Seleccione Región")) {
            // Obtener el ID de la región seleccionada desde el mapa de regiones
            String idRegionSeleccionada = regionesMap.get(nombreRegionSeleccionada);

            // Llamar al método para obtener la lista de comunas según el ID de la región
            List<Comuna> listaComunas = servicioWeb.listarComuna(idRegionSeleccionada);

            // Limpiar cmbComuna
            //cmbComuna.removeAllItems();

            // Llenar cmbComuna con los nombres de las comunas
            for (Comuna comuna : listaComunas) {
                cmbComuna.addItem(comuna.getNombrecomuna());
                // No es necesario asociar el nombre de la comuna con su ID en el mapa aquí
                comunasMap.put(comuna.getNombrecomuna(), comuna.getIdcomuna());
            }
        }
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar las comunas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_cmbComunaActionPerformed

    private void cargar_productores(){
    // Llama al método del servicio web para obtener la lista de productores desde la base de datos
     List<ws.Productor> productores = servicioWeb.listarProductor();


    // Verifica si la lista de productores no está vacía
    if (productores != null && !productores.isEmpty()) {
        // Obtiene el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblProductor.getModel();

        // Limpia la tabla antes de agregar nuevos datos
        model.setRowCount(0);

        // Agrega los datos de los productores al modelo de datos de la tabla
        for (Productor productor : productores) {
            Object[] rowData = {productor.getRut(), productor.getDv(), productor.getNombre(), productor.getApellidopat(), productor.getApellidomat(), 
                                productor.getDireccion(), productor.getFechanacimiento(), productor.getCorreoelectronico(), productor.getContrasena(), 
                                productor.getComunaIdcomuna()};
            model.addRow(rowData);
        }
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
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProductor;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblProductor;
    private javax.swing.JTextField txtApellidom;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JLabel txtComunacmb;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtPais;
    private javax.swing.JLabel txtRegion;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
