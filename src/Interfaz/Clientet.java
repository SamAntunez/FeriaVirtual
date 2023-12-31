
package Interfaz;

import Widget.TextPrompt;
import java.awt.event.KeyEvent;
import ws.Comuna;
import Widget.TextPrompt;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import ws.AgregarClienteNormal;
import ws.Consultor;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import ws.ListarClientes;
import ws.Cliente;
import ws.Modelo;
import ws.Producto;
import ws.Pais;
import ws.ProductorProducto;
import ws.Region;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import util.IconoUtil;
import ws.Marca;


public class Clientet extends javax.swing.JFrame {
    
    // Mapa para asociar nombres de países con sus IDs
private Map<String, String> paisesMap = new HashMap<>();

// Mapa para asociar nombres de regiones con sus IDs
private Map<String, String> regionesMap = new HashMap<>();

// Mapa para asociar nombres de comunas con sus IDs
private Map<String, String> comunasMap = new HashMap<>();
    
    
   private void limpiarCampos() {
    txtRut.setText("");
    txtPassword.setText("");
    txtNombre.setText("");
    txtApellidoP.setText("");
    txtApellidoM.setText("");
    txtDireccion.setText("");
    txtFecha.setText("");
    txtCorreo.setText("");
    txtDV.setText("");
    cmbComuna.setSelectedItem(null); 
    }
  /* private void cargarRegiones(String idPais) {
        // Lógica para cargar las regiones según el ID del país
        List<Region> listaRegiones = servicioWeb.listarRegionesPorIDPais(idPais);

        // Limpiar cmbRegion y agregar "Seleccione Región"
        cmbRegion.removeAllItems();
        cmbRegion.addItem("Seleccione Región");

        // Llenar cmbRegion con los nombres de las regiones y asociarlos con sus IDs
        for (Region region : listaRegiones) {
            cmbRegion.addItem(region.getNombreregion());
            // Asociar el nombre de la región con su ID en el mapa
            regionesMap.put(region.getNombreregion(), region.getIdregion());
        }
    }
   ¿private void cargarComunas(String idRegion) {
    // Lógica para cargar las comunas según el ID de la región
    List<Comuna> listaComunas = servicioWeb.listarComuna(idRegion);

    // Limpiar cmbComuna y agregar "Seleccione Comuna"
    cmbComuna.removeAllItems();
    cmbComuna.addItem("Seleccione Comuna");

    // Llenar cmbComuna con los nombres de las comunas y asociarlos con sus IDs
    for (Comuna comuna : listaComunas) {
        cmbComuna.addItem(comuna.getNombrecomuna());
        // Asociar el nombre de la comuna con su ID en el mapa
        comunasMap.put(comuna.getNombrecomuna(), comuna.getIdcomuna());
    }
   }*/
   
    private WebServiceFV servicioWeb;

    public Clientet() {
        initComponents();
        
        TextPrompt prueba2 = new TextPrompt("Solo si eliminara", txtId);        
        
        setIconImage(IconoUtil.obtenerIcono());
         txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });
         
    
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
         WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
         servicioWeb = servicio.getWebServiceFVPort(); 
         
         tblCliente.setRowSelectionAllowed(false);
         tblCliente.setDefaultEditor(Object.class, null);
         
         TextPrompt prueba = new TextPrompt("dd-mm-yyyy", txtFecha);
        
    
    //Agregar el event listener al cmbTipoCliente después de ocultar los componentes
        cmbTipoCliente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbTipoClienteActionPerformed(evt);
        }
    });
        
       setSize(1320, 850);
       setResizable(false);
        
        
        
        cmbPaisActionPerformed(null);
        cmbPais.removeAllItems();
        cmbRegionActionPerformed(null);
        cmbRegion.removeAllItems();
        cmbComunaActionPerformed(null);
        cmbRegion.removeAllItems();
        
        
        addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        confirmarCerrarPrograma();
    }
});
        carga_datos_empresa();
        carga_datos_normal();
        txtDV.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        txtDVKeyTyped(evt);
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
        
            cmbPais.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              cmbPaisActionPerformed(evt);
                      }
                  }
            );
        }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lvlApellidoP = new javax.swing.JLabel();
        lvlApellidoM = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoCliente = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        cmbComuna = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmbRegion = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\ICONOS\\cliente.png")); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ingresar datos");

        lblRut.setText("Rut");

        lblNombre.setText("Nombre");

        lvlApellidoP.setText("Apellido paterno");

        lvlApellidoM.setText("Apellido materno");

        jLabel8.setText("Correo electronico");

        jLabel9.setText("Direccion");

        jLabel3.setText("Tipo cliente ");

        cmbTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persona", "Empresa" }));
        cmbTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoClienteActionPerformed(evt);
            }
        });

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
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

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre cliente", "Rut", "correo", "Comuna", "Direccion", "Fecha nacimientol"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        lblFecha.setText("Fecha nacimiento");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel6.setText("Contraseña");

        jLabel7.setText("Comuna");

        txtDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel12.setText("-");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Documents\\NetBeansProjects\\ClienteJAVA\\img\\logo__1_-removebg-preview.png")); // NOI18N

        lblId.setText("ID");

        cmbComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComunaActionPerformed(evt);
            }
        });

        jLabel11.setText("Region");

        cmbRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegionActionPerformed(evt);
            }
        });

        jLabel13.setText("Pais");

        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Razon social", "Identificador Unico", "Correo", "Comuna", "Direccion", "Fundacion"
            }
        ));
        jScrollPane2.setViewportView(tblEmpresa);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Listado Cliente normal");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Listado Cliente empresa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lvlApellidoM)
                                        .addComponent(lblRut)
                                        .addComponent(lblId)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(lvlApellidoP)))))
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFecha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbComuna, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbRegion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreo)
                                .addComponent(cmbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addGap(24, 24, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(140, 140, 140))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(cmbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblId)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblRut)))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlApellidoP)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlApellidoM)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecha)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addGap(40, 40, 40)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     
     String tipoCliente = (String) cmbTipoCliente.getSelectedItem();
     String identificadorEliminar = txtRut.getText(); // El campo de texto contiene el identificador a eliminar
     String ideliminar = txtId.getText();
     if (tipoCliente.equals("Persona")) {
    // Lógica para eliminar cliente normal
    int rutEliminar = Integer.parseInt(identificadorEliminar);

    boolean eliminado = servicioWeb.eliminarDefinitivoClienteNormal(rutEliminar, ideliminar);

    if (eliminado) {
        JOptionPane.showMessageDialog(this, "Cliente normal eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();
        // Actualiza la tabla después de eliminar el cliente normal
        carga_datos_normal();
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el cliente normal. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    } else if (tipoCliente.equals("Empresa")) {
    // Lógica para eliminar cliente empresa
    String rutEliminar = identificadorEliminar;
    String idEliminar =  ideliminar;

    boolean eliminado = servicioWeb.eliminarDefinitivoClienteEmpresa(rutEliminar,ideliminar);

    if (eliminado) {
        JOptionPane.showMessageDialog(this, "Cliente empresa eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();
        // Actualiza la tabla después de eliminar el cliente empresa
        carga_datos_empresa();
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el cliente empresa. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
    }

        }
        carga_datos_normal();
        carga_datos_empresa();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String tipoCliente = (String) cmbTipoCliente.getSelectedItem();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        String contrasena = new String(txtPassword.getPassword());
        String comuna_idcomuna = cmbComuna.getSelectedItem().toString();

        if (tipoCliente.equals("Persona")) {
            // Lógica para modificar cliente normal
            int rut = Integer.parseInt(txtRut.getText());
            String nombre = txtNombre.getText();
            String apellidoPaterno = txtApellidoP.getText();
            String apellidoMaterno = txtApellidoM.getText();
            String fechaNacimiento = txtFecha.getText();

            // Verificar si los campos obligatorios están llenos
            if (rut == 0 || nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || fechaNacimiento.isEmpty() || direccion.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || comuna_idcomuna.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar modificar el cliente normal.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean modificado = servicioWeb.modificarClientenormal(rut, nombre, apellidoPaterno, apellidoMaterno, direccion, fechaNacimiento, correo, contrasena, comuna_idcomuna);

                if (modificado) {
                    JOptionPane.showMessageDialog(this, "Cliente normal modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos(); // Limpia los campos después de modificar el cliente si lo deseas
                    // Actualiza la tabla después de modificar el cliente
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar el cliente normal. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (tipoCliente.equals("Empresa")) {
            // Lógica para modificar cliente empresa
            String identificadorEmpresa = txtRut.getText(); // Utiliza el mismo campo para el identificador de empresa
            String razonSocial = txtNombre.getText(); // Utiliza el mismo campo para la razón social

            // Verificar si los campos obligatorios están llenos
            if (identificadorEmpresa.isEmpty() || razonSocial.isEmpty() || direccion.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || comuna_idcomuna.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar modificar el cliente empresa.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean modificado = servicioWeb.modificarClienteEmpresa(identificadorEmpresa, direccion, correo, contrasena, razonSocial, comuna_idcomuna);

                if (modificado) {
                    JOptionPane.showMessageDialog(this, "Cliente empresa modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos(); // Limpia los campos después de modificar el cliente si lo deseas
                    // Actualiza la tabla después de modificar el cliente
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar el cliente empresa. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            carga_datos_normal();
            carga_datos_empresa();

        }
    }//GEN-LAST:event_btnModificarActionPerformed
    private String obtenerIdComunaSeleccionado() {
    String nombreComunaSeleccionada = (String) cmbComuna.getSelectedItem();
    String idComunaSeleccionada = comunasMap.get(nombreComunaSeleccionada);
    return idComunaSeleccionada;
}
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String idComunaleccionada = obtenerIdComunaSeleccionado();
        String tipoCliente = (String) cmbTipoCliente.getSelectedItem();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        String contrasena = new String(txtPassword.getPassword());

        if (tipoCliente.equals("Persona")) {
            // Lógica para agregar cliente normal
            int rut = Integer.parseInt(txtRut.getText());
            String dv = txtDV.getText();
            String nombre = txtNombre.getText();
            String apellidoP = txtApellidoP.getText();
            String apellidoM = txtApellidoM.getText();
            String fechaNacimiento = txtFecha.getText();

            boolean resultado = servicioWeb.agregarClienteNormal(rut, dv, nombre, apellidoP, apellidoM, direccion, fechaNacimiento, correo, contrasena, idComunaleccionada);

            if (resultado) {
                JOptionPane.showMessageDialog(this, "Cliente normal agregado correctamente a la base de datos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el cliente normal a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (tipoCliente.equals("Empresa")) {
            // Lógica para agregar cliente empresa
            String identificadorEmpresa = txtRut.getText(); // Utiliza el mismo campo para el identificador de empresa
            String razonSocial = txtNombre.getText(); // Utiliza el mismo campo para la razón social

            boolean resultado = servicioWeb.agregarClienteEmp(direccion, correo, contrasena, identificadorEmpresa, razonSocial, idComunaleccionada);

            if (resultado) {
                JOptionPane.showMessageDialog(this, "Cliente empresa agregado correctamente a la base de datos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el cliente empresa a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
        carga_datos_normal();
        carga_datos_empresa();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoClienteActionPerformed
        String tipoCliente = (String) cmbTipoCliente.getSelectedItem();

        if (tipoCliente.equals("Empresa")) {
           
            lvlApellidoP.setVisible(false);
            lvlApellidoM.setVisible(false);
            txtApellidoP.setVisible(false);
            txtApellidoM.setVisible(false);
            lblFecha.setVisible(false);
            txtFecha.setVisible(false);

            lblRut.setText("Identificador Único");
            lblNombre.setText("Razón Social");
        } else {
            lblFecha.setVisible(true);
            txtFecha.setVisible(true);
            lvlApellidoP.setVisible(true);
            lvlApellidoM.setVisible(true);
            txtApellidoP.setVisible(true);
            txtApellidoM.setVisible(true);
            lblRut.setText("Rut");
            lblNombre.setText("Nombre");
        }
    }//GEN-LAST:event_cmbTipoClienteActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed
    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {                                       
    char c = evt.getKeyChar();

    if (!Character.isDigit(c) || txtRut.getText().length() >= 8) {
        evt.consume();  // Consumir el evento, lo que evita que el carácter se introduzca en el campo de texto
    }
}
    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
    String texto = txtRut.getText().replaceAll("[^0-9]", ""); // Eliminar caracteres no numéricos
    if (texto.length() > 8) {
        texto = texto.substring(0, 8); // Limitar a 8 caracteres
    }
    txtRut.setText(texto);  
    }//GEN-LAST:event_txtRutActionPerformed
    private boolean esCaracterValido(String texto) {
    return texto.length() == 1 && (Character.isDigit(texto.charAt(0)) || texto.equalsIgnoreCase("k"));
}
    private void txtDVKeyTyped(java.awt.event.KeyEvent evt) {                                       
    char c = evt.getKeyChar();

    if (!esCaracterValido(String.valueOf(c))) {
        evt.consume();  // Consumir el evento, evitando que el carácter se introduzca en el campo de texto
    }
    }   
    private void txtDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVActionPerformed
   String texto = txtDV.getText().toLowerCase(); // Convertir a minúsculas para manejar tanto 'K' como 'k'

    if (esCaracterValido(texto)) {
        // El texto cumple con las condiciones
        // Puedes realizar las acciones necesarias aquí

        // Por ejemplo, imprimir el carácter válido
        System.out.println("Carácter válido: " + texto);
    } else {
        // El texto no cumple con las condiciones, puedes mostrar un mensaje de error o realizar otra acción
        System.out.println("Entrada no válida");
        // También puedes agregar un mensaje o hacer alguna acción para informar al usuario que la entrada no es válida.
    }
    }//GEN-LAST:event_txtDVActionPerformed
   
    public void carga_datos_normal(){
     // Obtener el rut desde el campo de texto txtRut
        try {
            // Llamar al método para obtener la lista de productos por el rut del productor
            List<Cliente> clienteN = servicioWeb.listarTodosLosClientesNormales();
            
            // Mostrar los datos en un componente visual (por ejemplo, una tabla)
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Nombre cliente", "Rut", "Correo", "Comuna","Direccion","Fecha nacimiento"});
            
            for (Cliente cliente : clienteN) {
                model.addRow(new Object[]{cliente.getIdCliente(),cliente.getNombre(), cliente.getRut(), cliente.getCorreoelectronico(), cliente.getComunaIdcomuna(), cliente.getDireccion(), cliente.getFechanacimiento()});
            }
            
            // Asignar el modelo de datos a la tabla (reemplaza "tblProductosProductor" con el nombre de tu tabla)
            tblCliente.setModel(model);
        } catch (Exception ex) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
        }


   }    
    public void carga_datos_empresa(){
   // Obtener el rut desde el campo de texto txtRut
        try {
            // Llamar al método para obtener la lista de productos por el rut del productor
            List<Cliente> clienteE= servicioWeb.listarTodosLosClientesEx();
            
            // Mostrar los datos en un componente visual (por ejemplo, una tabla)
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID","Razon social", "Identificador Unico", "Correo", "Direccion", "Contraseña"});
            
            for (Cliente clientee : clienteE) {
                model.addRow(new Object[]{clientee.getIdCliente(),clientee.getRazonsocial(), clientee.getIdentificadorempresa(), clientee.getCorreoelectronico(),  clientee.getDireccion(), clientee.getContrasena()});
            }
            
            // Asignar el modelo de datos a la tabla (reemplaza "tblProductosProductor" con el nombre de tu tabla)
            tblEmpresa.setModel(model);
        } catch (Exception ex) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // o muestra un mensaje de error en lugar de imprimir la traza
        }


   }    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbRegion;
    private javax.swing.JComboBox<String> cmbTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lvlApellidoM;
    private javax.swing.JLabel lvlApellidoP;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblEmpresa;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
