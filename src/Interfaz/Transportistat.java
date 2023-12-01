/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Widget.TextPrompt;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ws.Transportista;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import util.IconoUtil;

public class Transportistat extends javax.swing.JFrame {

    private WebServiceFV servicioWeb;
    
    public Transportistat() {
        initComponents();
        agregarKeyListenerRut();
        agregaKeyListenerDV();
        //llamar logo 
        setIconImage(IconoUtil.obtenerIcono());
        DefaultTableModel model = (DefaultTableModel) tblTransportista.getModel();
       
        
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort();   
        tblTransportista.setRowSelectionAllowed(false);
        tblTransportista.setDefaultEditor(Object.class, null);
       
      //   TextPrompt prueba = new TextPrompt("1 a 346", );
        
        
        
        tblTransportista.addMouseListener(new MouseAdapter()
        {
            
    @Override
    
    public void mouseClicked(MouseEvent e) {
        int filaSeleccionada = tblTransportista.getSelectedRow();
        int columnaRut = 0; // Índice de la columna del rut en la tabla
        int columnaNombre = 1; // Índice de la columna del nombre en la tabla
       
        // Verifica si se hizo clic en la columna del rut
        if (tblTransportista.columnAtPoint(e.getPoint()) == columnaRut) {
            // Obtiene el valor del rut de la fila seleccionada
            Integer rutInt = (Integer) tblTransportista.getValueAt(filaSeleccionada, columnaRut);
            String rut = String.valueOf(rutInt);

            // Obtiene el valor del nombre de la fila seleccionada
            String nombre = (String) tblTransportista.getValueAt(filaSeleccionada, columnaNombre);

            // Abre la ventana Productos.java pasando el rut y el nombre como parámetros
            Transportet productosVentana = new Transportet(rut, nombre);
            
            productosVentana.setVisible(true);
        }
        
        
    }
    }
                
        );
    //ancho,alto
    setSize(1320, 750);
    setResizable(false);
    
    cargar_transportistas();
        
    addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        confirmarCerrarPrograma();
    }
});
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
        // Si el usuario elige "No" o cierra la ventana de diálogo, se cancela el cierre de la aplicación.
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransportista = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtApeM = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtApeP = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtDV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dtchFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tblTransportista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Rut transportista", "Nombre Transportista", "Apellido P", "Apellido M", "Correo", "Fecha Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransportista);

        jLabel8.setText("Direccion");

        txtApeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeMActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel7.setText("Fecha nacimiento");

        jLabel3.setText("Rut");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jLabel10.setText("Contraseña");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel6.setText("Apellido paterno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Transportista");

        jLabel5.setText("Apellido materno");

        jLabel9.setText("Correo");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtApeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVActionPerformed(evt);
            }
        });

        jLabel14.setText("-");

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Ingresar datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtApeM)
                                    .addComponent(txtApeP)
                                    .addComponent(txtNombre)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel15)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(220, 220, 220)))
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(dtchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
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

    private void txtApePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtApeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeMActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    String rutString = txtRut.getText();
    String dv = txtDV.getText();
    String nombre = txtNombre.getText();
    String apellidoPaterno = txtApeP.getText();
    String apellidoMaterno = txtApeM.getText();
    
    // Obtener la fecha seleccionada del componente DateChooser
    Date fechaNacimientoDate = dtchFechaNacimiento.getDate();

    String direccion = txtDireccion.getText();
    String correoElectronico = txtCorreo.getText();
    char[] contrasenaChars = txtPassword.getPassword();
    String contrasena = new String(contrasenaChars);

    // Validar que todos los campos obligatorios estén llenos
    if (rutString.isEmpty() || dv.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty()
            || apellidoMaterno.isEmpty() || fechaNacimientoDate == null || direccion.isEmpty()
            || correoElectronico.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar agregar el transportista.", "Error", JOptionPane.ERROR_MESSAGE);
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

        // Formatear la fecha en el formato deseado (dd-MM-yyyy)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fechaNacimiento = dateFormat.format(fechaNacimientoDate);

        try {
            // Llama al método del servicio web para agregar el transportista
            boolean resultado = servicioWeb.agregarTransportista(rut, dv, nombre, apellidoPaterno,
                    apellidoMaterno, fechaNacimiento, direccion, correoElectronico, contrasena);

            if (resultado) {
                // El transportista se registró correctamente
                JOptionPane.showMessageDialog(this, "Transportista registrado correctamente.");
                // Puedes limpiar los campos después de registrar el transportista si lo deseas
                limpiarCampos();
                // Limpia el JDateChooser
                dtchFechaNacimiento.setDate(null);
                // Actualiza la tabla después de registrar el transportista
            } else {
                // Hubo un error al registrar el transportista
                JOptionPane.showMessageDialog(this, "Error al registrar el transportista. Inténtalo de nuevo.");
            }
        } catch (Exception e) {
            // Muestra el mensaje de la excepción en un cuadro de diálogo
            JOptionPane.showMessageDialog(this, "Error al agregar el transportista: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // Imprime la traza de la excepción en la consola
            e.printStackTrace();
        }
    }
    cargar_transportistas();
}

private void limpiarCampos() {
    txtRut.setText("");
    txtDV.setText("");
    txtNombre.setText("");
    txtApeP.setText("");
    txtApeM.setText("");
    dtchFechaNacimiento.setDateFormatString("");
    txtDireccion.setText("");
    txtCorreo.setText("");
    txtPassword.setText("");

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
   // Verificar si no hay nada escrito en los campos de texto
    if (txtRut.getText().isEmpty() && txtNombre.getText().isEmpty() && txtApeP.getText().isEmpty()
            && txtApeM.getText().isEmpty() && txtDireccion.getText().isEmpty() && txtCorreo.getText().isEmpty()
            && txtPassword.getPassword().length == 0 && dtchFechaNacimiento.getDate() == null) {
        JOptionPane.showMessageDialog(this, "No hay cambios para modificar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        return;  // Salir del método si no hay cambios para modificar
    }

    // Obtener valores de los campos de texto y del JDateChooser
    int rutBuscar = Integer.parseInt(txtRut.getText());
    String nombre = txtNombre.getText();
    String apellidoPaterno = txtApeP.getText();
    String apellidoMaterno = txtApeM.getText();
    
    // Obtener la fecha seleccionada del componente DateChooser
    Date fechaNacimientoDate = dtchFechaNacimiento.getDate();

    // Verifica si los campos obligatorios están llenos
    if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || fechaNacimientoDate == null) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar modificar el transportista.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Resto del código para modificar el transportista...
    }
    cargar_transportistas();
    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   String rutEliminarString = txtRut.getText();
    
    if (!rutEliminarString.isEmpty()) {
        try {
            int rutEliminar = Integer.parseInt(rutEliminarString);
            
            // Llama al método del servicio web para eliminar el transportista definitivamente
            boolean resultado = servicioWeb.eliminarDefinitivoTransportista(rutEliminar);
            
            if (resultado) {
                JOptionPane.showMessageDialog(this, "Transportista eliminado definitivamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Limpiar el campo de texto después de eliminar el transportista
                txtRut.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el transportista.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un número de rut válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el transportista: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa el rut del transportista que deseas eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    cargar_transportistas();

    }//GEN-LAST:event_btnEliminarActionPerformed
 private void agregaKeyListenerDV() {
    // Agrega un KeyListener al campo txtDV
    txtDV.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            // Obtén el carácter ingresado
            char caracter = e.getKeyChar();

            // Verifica si el carácter no es un número ni la letra "k" o la longitud es mayor a 1
            if (!(Character.isDigit(caracter) || (caracter == 'k' || caracter == 'K')) || txtDV.getText().length() >= 1) {
                // Consumir el evento para evitar que se ingrese el carácter
                e.consume();
            }
        }
    });
}
    private void txtDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDVActionPerformed
private void agregarKeyListenerRut() {
    // Agrega un KeyListener al campo txtRut
    txtRut.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            // Obtén el carácter ingresado
            char caracter = e.getKeyChar();
            
            // Verifica si el carácter no es un número o la longitud es mayor a 8
            if (!Character.isDigit(caracter) || txtRut.getText().length() >= 8) {
                // Consumir el evento para evitar que se ingrese el carácter
                e.consume();
            }
        }
    });
}
    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed
    public void cargar_transportistas() {    
        try {
    
        // Obtener la lista de transportistas del servicio web
        List<Transportista> transportistas = servicioWeb.listarTransportista();

        // Verifica si la lista de transportistas no está vacía
        if (transportistas != null && !transportistas.isEmpty()) {
            // Obtiene el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblTransportista.getModel();

            // Limpia la tabla antes de agregar nuevos datos
            model.setRowCount(0);

            // Agrega los datos de los transportistas al modelo de datos de la tabla
            for (Transportista transportista : transportistas) {
                Object[] rowData = {
                    transportista.getRut(),
                    transportista.getNombre(),
                    transportista.getApellidopat(),
                    transportista.getApellidomat(),
                    transportista.getCorreoelectronico(),
                    transportista.getDireccion()
                };
                model.addRow(rowData);
            }
        } else {
            // No hacer nada si la lista de transportistas está vacía
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
            java.util.logging.Logger.getLogger(Transportistat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transportistat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transportistat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transportistat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transportistat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser dtchFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransportista;
    private javax.swing.JTextField txtApeM;
    private javax.swing.JTextField txtApeP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
