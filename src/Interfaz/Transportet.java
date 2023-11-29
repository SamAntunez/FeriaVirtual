
package Interfaz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import ws.Modelo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import java.sql.SQLException;
import ws.Marca;
import javax.swing.JOptionPane;
import java.util.HashMap;
import javax.swing.JFrame;
import ws.AgregarNuevoProducto;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ws.ProductorProducto;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JComboBox;
import ws.ListarProductosxIdyNombre;
import ws.Transporte;
import javax.swing.JFrame;
import ws.Calibre;
import ws.Comuna;
import ws.Pais;
import ws.Region;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import util.IconoUtil;

public class Transportet extends javax.swing.JFrame {
    private Map<String, String> marcaMap = new HashMap<>();
    private Map<String, String> modeloMap = new HashMap<>();  
    private WebServiceFV servicioWeb;
    private String rut;
    private String nombre;
   
    
    public Transportet(String rut, String nombre) {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        
        setIconImage(IconoUtil.obtenerIcono());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultTableModel model = (DefaultTableModel) tblTransporte.getModel();
        tblTransporte.setDefaultEditor(Object.class, null);
        tblTransporte.setRowSelectionAllowed(false);
        
        this.rut = rut;
        this.nombre = nombre;
          
        // Lógica para mostrar el rut y el nombre en txtAreaProductor
        txtAreaTransportista.setText("RUT: " + rut + "\nNombre: " + nombre );
        txtAreaTransportista.setEditable(false);
        
        int rutTrans = Integer.parseInt(rut); // Convierte el rut a entero
        // Llama a cmbProductoActionPerformed para cargar los productos al inicio
        try {
            WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
            servicioWeb = servicio.getWebServiceFVPort();
            System.out.println("Servicio web inicializado correctamente: " + (servicioWeb != null));
        } catch (Exception ex) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(null, "Error al inicializar el servicio web: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Imprime la traza de la excepción para diagnóstico
        }
       
     //ancho,alto
    setSize(1200, 670);
    setResizable(false);
        // Llama a cmbMarcaActionPerformed para cargar los productos al inicio
        
        cmbMarcaActionPerformed(null);
        cmbMarca.removeAllItems();
        cmbModeloActionPerformed(null);
        cmbModelo.removeAllItems();
        cargar_datos();
                         
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarCerrarPrograma();
            }
            
            
        });
         
         
    }
    

    private void confirmarCerrarPrograma() {
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea salir de transporte?", "Confirmar Cierre",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransporte = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtCapacidad = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        cmbFrigorifico = new javax.swing.JComboBox<>();
        cmbPermiso = new javax.swing.JComboBox<>();
        cmbModelo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaTransportista = new javax.swing.JTextArea();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        tblTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Permiso", "Patente", "Modelo", "Capacidad de carga"
            }
        ));
        jScrollPane1.setViewportView(tblTransporte);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Transporte");

        jLabel3.setText("Patente");

        jLabel4.setText("Capacidad");

        jLabel5.setText("Frigorificos");

        jLabel6.setText("Permiso circulacion");

        jLabel7.setText("Transporte de:");

        jLabel8.setText("Modelo");

        btnAgregar.setText("Agregar transporte");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        cmbFrigorifico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cmbFrigorifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFrigorificoActionPerformed(evt);
            }
        });

        cmbPermiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cmbPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPermisoActionPerformed(evt);
            }
        });

        cmbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModeloActionPerformed(evt);
            }
        });

        txtAreaTransportista.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaTransportista.setColumns(20);
        txtAreaTransportista.setRows(5);
        jScrollPane2.setViewportView(txtAreaTransportista);

        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        jLabel9.setText("Marca");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbModelo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPermiso, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE)
                                    .addComponent(cmbFrigorifico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbFrigorifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed
private String obtenerIdModeloSeleccionado() {
    String nombreModeloSeleccionado = (String) cmbModelo.getSelectedItem();
    String idModeloSeleccionado = modeloMap.get(nombreModeloSeleccionado);
    return idModeloSeleccionado;
}
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try {
        // Obtener los valores del producto desde los campos de texto y ComboBox        
        
        String frigorificoTrans = (String) cmbFrigorifico.getSelectedItem();
        String permisoCirculacion = (String) cmbPermiso.getSelectedItem();
        String idModeloSeleccionado = obtenerIdModeloSeleccionado();
        int ruti = Integer.parseInt(rut);
        String patente = txtPatente.getText();
        int capacidadCarga = Integer.parseInt(txtCapacidad.getText());
        
        

        // Convertir valores de frigorífico y permiso de circulación a 1 y 0 y luego a cadenas
        String valorFrigorifico = frigorificoTrans.equalsIgnoreCase("Si") ? "1" : "0";
        String valorPermiso = permisoCirculacion.equalsIgnoreCase("Si") ? "1" : "0";

        // Obtener el valor de rut directamente como entero
        
        // Llamar al método para agregar un nuevo transporte
        boolean resultado = servicioWeb.agregarTransporte(patente, capacidadCarga, valorFrigorifico, valorPermiso, ruti, idModeloSeleccionado);

        // Verificar el resultado y realizar acciones apropiadas
        if (resultado) {
            // El transporte se agregó correctamente, puedes mostrar un mensaje de éxito o realizar alguna otra acción
            JOptionPane.showMessageDialog(this, "Transporte agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
             cargar_datos();
            // Aquí puedes agregar código para limpiar los campos de texto después de agregar el transporte si es necesario
        } else {
            // Hubo un problema al agregar el transporte, muestra un mensaje de error o realiza acciones apropiadas
            JOptionPane.showMessageDialog(this, "Error al agregar el transporte", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        // Manejar la excepción si los valores ingresados no son números válidos
        JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos para Capacidad de carga", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        // Manejar otras excepciones aquí
        JOptionPane.showMessageDialog(this, "Error al agregar el transporte: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbFrigorificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFrigorificoActionPerformed
    String seleccion = cmbFrigorifico.getSelectedItem().toString();
        int valorFrigorifico;
    
    if (seleccion.equals("SI")) {
        valorFrigorifico = 1;
    } else {
        valorFrigorifico = 0;
        }
    }//GEN-LAST:event_cmbFrigorificoActionPerformed

    private void cmbPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPermisoActionPerformed
    String seleccion = cmbPermiso.getSelectedItem().toString();
        int valorPermiso;
    
    if (seleccion.equals("SI")) {
        valorPermiso = 1;
    } else {
        valorPermiso = 0;
        }
    }//GEN-LAST:event_cmbPermisoActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
    try {
        cmbMarca.addItem("Seleccione marca");
        // Llamar al método para obtener la lista de países desde el servicio web
        int selectedIndex = cmbMarca.getSelectedIndex();
        List<Marca> listarmarcas = servicioWeb.listarMarcas();

        //Limpiar cmbPais y agregar "Seleccione País"
        cmbMarca.removeAllItems();
        
        // Llenar cmbPais con los nombres de los países y asociarlos con sus IDs
        for (Marca marca : listarmarcas) {
            cmbMarca.addItem(marca.getDescmarca());
            // Asociar el nombre del país con su ID en el mapa
            marcaMap.put(marca.getDescmarca(), marca.getIdmarca());
        }

        cmbModeloActionPerformed(null); // Llamada para cargar las regiones
        
        cmbMarca.setSelectedIndex(selectedIndex);

    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los marcas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void cmbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeloActionPerformed
     try {
        // Obtener el nombre de la marca seleccionada en el cmbMarca
        String nombreMarcaSeleccionada = (String) cmbMarca.getSelectedItem();
        // Obtener el id de la marca seleccionada desde el mapa de marcas
        String idMarcaSeleccionada = marcaMap.get(nombreMarcaSeleccionada);

        // Llamar al método para obtener la lista de modelos según el id de la marca
        List<Modelo> listaModelos = servicioWeb.listarModelos(idMarcaSeleccionada);

        // Limpiar cmbModelo y agregar "Seleccione Modelo"
        //cmbModelo.removeAllItems();
        cmbModelo.addItem("Seleccione Modelo");

        // Llenar cmbModelo con los nombres de los modelos
        for (Modelo modelo : listaModelos) {
            cmbModelo.addItem(modelo.getDescmodelo());
            // Asociar el nombre del modelo con su ID en el mapa
            modeloMap.put(modelo.getDescmodelo(), modelo.getIdmodelo());
        }
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los modelos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
    }
 
    }//GEN-LAST:event_cmbModeloActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
         Transportistat pantalla = new Transportistat();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
     

  private void cargar_datos(){
    // Obtener el rut desde el campo de texto txtRut
        int rutTransportista = Integer.parseInt(rut);

        try {
            // Llamar al método para obtener la lista de productos por el rut del productor
            List<Transporte> listaTransportes = servicioWeb.listarTransportexRut(rutTransportista);
            
            // Mostrar los datos en un componente visual (por ejemplo, una tabla)
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"Permiso", "Patente", "Modelo", "Capacidad carga"});
            
            for (Transporte transporte : listaTransportes) {
                model.addRow(new Object[]{transporte.getPermisocirculacion(), transporte.getPatente(), transporte.getModeloIdmodelo(), transporte.getCapacidadcarga()});
            }
            
            // Asignar el modelo de datos a la tabla (reemplaza "tblProductosProductor" con el nombre de tu tabla)
            tblTransporte.setModel(model);
            
        } catch (Exception ex) {
            // Manejar la excepción aquí
           
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
            java.util.logging.Logger.getLogger(Transportet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transportet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transportet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transportet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbFrigorifico;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbPermiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTransporte;
    private javax.swing.JTextArea txtAreaTransportista;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
