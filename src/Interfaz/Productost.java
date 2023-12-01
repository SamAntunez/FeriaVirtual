package Interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import java.sql.SQLException;
import ws.Calibre;
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
import ws.ListarCalibre;
import javax.swing.JComboBox;
import util.IconoUtil;
import ws.ListarProductosxIdyNombre;
import ws.Producto;


public class Productost extends javax.swing.JFrame {
    private Map<String, String> productosMap = new HashMap<>();
    private Map<String, String> calibreMap = new HashMap<>();

    private WebServiceFV servicioWeb;
    private String rut;
    private String nombre;
    private String apellidop;

    public Productost(String rut, String nombre) {
        
        initComponents();
        setIconImage(IconoUtil.obtenerIcono());
        cmbProducto.addItem("Seleccione un producto");
        cmbProducto.setPrototypeDisplayValue("Seleccione un producto");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultTableModel model = (DefaultTableModel) tblProductosProductor.getModel();
        tblProductosProductor.setDefaultEditor(Object.class, null);
        tblProductosProductor.setRowSelectionAllowed(false);
        
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort(); 

        this.rut = rut;
        this.nombre = nombre;
        
        // Lógica para mostrar el rut y el nombre en txtAreaProductor
        txtAreaProductor.setText("RUT: " + rut + "\nNombre: " + nombre );
        txtAreaProductor.setEditable(false);
        int rutProductor = Integer.parseInt(rut); // Convierte el rut a entero
        // Llama a cmbProductoActionPerformed para cargar los productos al inicio
        cmbProductoActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Seleccione producto"));
        cmbCalibreActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Seleccione calibre"));
      
        cmbProducto.removeAllItems();
        
        cmbCalibre.removeAllItems();
        cargar_datos();
        
        
        //ancho,alto
        setSize(1210, 670);
        setResizable(false);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaProductor = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosProductor = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        cmbProducto = new javax.swing.JComboBox<>();
        cmbCalibre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Productos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ingresar productos de :");

        txtAreaProductor.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaProductor.setColumns(20);
        txtAreaProductor.setRows(5);
        jScrollPane1.setViewportView(txtAreaProductor);

        jLabel7.setText("Producto");

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel8.setText("Precio ");

        jLabel10.setText("Calibre");

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Stock");

        tblProductosProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre producto", "Stock producto", "Precio", "Tipo producto", "Calibre", "img"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductosProductor);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sele" }));
        cmbProducto.setActionCommand("wqw");
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        cmbCalibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalibreActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logologo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Registro de productos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbCalibre, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbCalibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
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
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Productort pantalla = new Productort();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
       dispose(); 
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
   System.out.println("cmbProductoActionPerformed se está ejecutando"); // Mensaje de depuración
    try {
        cmbProducto.addItem("Seleccione Producto");
        // Obtener el índice de selección actual
        int selectedIndex = cmbProducto.getSelectedIndex();

        // Llamar al método para obtener la lista de productos basados en el ID del calibre seleccionado
        List<Producto> listaProductos = servicioWeb.listarProductosxIdyNombre();

        // Limpiar el combo box de productos antes de agregar nuevos elementos
        cmbProducto.removeAllItems();

        // Agregar los nombres de los productos al combo box y asociarlos con sus IDs en el Map
        for (Producto producto : listaProductos) {
            cmbProducto.addItem(producto.getNombreproducto());
            productosMap.put(producto.getNombreproducto(), producto.getIdproducto());
        }

        // Restaurar el índice de selección
        cmbProducto.setSelectedIndex(selectedIndex);
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
    }
    }//GEN-LAST:event_cmbProductoActionPerformed
private String obtenerIdProductoSeleccionado() {
    String nombreProductoSeleccionado = (String) cmbProducto.getSelectedItem();
    String idProductoSeleccionado = productosMap.get(nombreProductoSeleccionado);
    return idProductoSeleccionado;
}
private String obtenerIdCalibreSeleccionado() {
    String nombreCalibreSeleccionado = (String) cmbCalibre.getSelectedItem();
    String idCalibreSeleccionado = calibreMap.get(nombreCalibreSeleccionado);
    return idCalibreSeleccionado;
}
    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
     try {
        // Obtener los valores seleccionados de los combo boxes
        String idCalibreseleccionado = obtenerIdCalibreSeleccionado();
        String idProductoSeleccionado = obtenerIdProductoSeleccionado();
        int precio = Integer.parseInt(txtPrecio.getText()); // Obtener el valor del precio desde el campo de texto
        int stock = Integer.parseInt(txtStock.getText()); // Obtener el valor del stock desde el campo de texto
        int productor_rut = Integer.parseInt(rut); // Usar el valor predefinido del RUT
    //    String img = txtImg.getText(); // Obtener el valor de la imagen desde el campo de texto

        // Llamar al método para agregar un nuevo producto
        boolean resultado = servicioWeb.agregarNuevoProducto(precio, stock, idProductoSeleccionado, productor_rut,idCalibreseleccionado );

        // Verificar el resultado y realizar acciones apropiadas
        if (resultado) {
            // El producto se agregó correctamente, puedes mostrar un mensaje de éxito o realizar alguna otra acción
            JOptionPane.showMessageDialog(this, "Producto agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            cargar_datos();
        } else {
            // Hubo un problema al agregar el producto, muestra un mensaje de error o realiza acciones apropiadas
            JOptionPane.showMessageDialog(this, "Error al agregar el producto", "Error", JOptionPane.ERROR_MESSAGE);
            cargar_datos();
        }
    } catch (NumberFormatException ex) {
        // Manejar la excepción si los valores ingresados no son números válidos
        JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos para Precio, Stock y RUT", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        // Manejar otras excepciones aquí
        ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
        cargar_datos();
    }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed
private void cargar_datos(){
    // Obtener el rut desde el campo de texto txtRut
        int rutProductor = Integer.parseInt(rut);

        try {
            // Llamar al método para obtener la lista de productos por el rut del productor
            List<ProductorProducto> listaProductos = servicioWeb.listarproductosporrutproductor(rutProductor);
            
            // Mostrar los datos en un componente visual (por ejemplo, una tabla)
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"Nombre producto", "Calibre", "Stock", "Precio"});
            
            for (ProductorProducto producto : listaProductos) {
                model.addRow(new Object[]{producto.getProductoIdproducto(), producto.getCalibreIdcalibre(), producto.getStock(), producto.getPrecio()});
            }
            
            // Asignar el modelo de datos a la tabla (reemplaza "tblProductosProductor" con el nombre de tu tabla)
            tblProductosProductor.setModel(model);
        } catch (Exception ex) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
        }

}
    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed

    }//GEN-LAST:event_txtStockActionPerformed

    private void cmbCalibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalibreActionPerformed
   System.out.println("cmbProductoActionPerformed se está ejecutando"); // Mensaje de depuración
    try {
        // Obtener el índice de selección actual
       
        cmbCalibre.addItem("Seleccione calibre");

        int selectedIndex = cmbCalibre.getSelectedIndex();

        // Llamar al método para obtener la lista de productos basados en el ID del calibre seleccionado
        List<Calibre> listaCalibres = servicioWeb.listarCalibre();

        // Limpiar el combo box de productos antes de agregar nuevos elementos
        cmbCalibre.removeAllItems();

        // Agregar los nombres de los productos al combo box y asociarlos con sus IDs en el Map
        for (Calibre calibre : listaCalibres) {
            cmbCalibre.addItem(calibre.getDesccalibre());
            calibreMap.put(calibre.getDesccalibre(), calibre.getIdcalibre());
        }

        // Restaurar el índice de selección
        cmbCalibre.setSelectedIndex(selectedIndex);
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
    }
    }//GEN-LAST:event_cmbCalibreActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCalibre;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductosProductor;
    private javax.swing.JTextArea txtAreaProductor;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
