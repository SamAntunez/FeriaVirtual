package Interfaz;

import com.itextpdf.text.Font; 
import org.jdatepicker.JDatePicker;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import Widget.TextPrompt;
import com.itextpdf.text.Chunk;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import sw.Reporte;  
import sw.WSFV;
import sw.WSREPORTERIAFV;
import ws.Subasta;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import util.IconoUtil;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.print.*;
import javax.swing.JTable;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

import java.io.IOException;
import java.util.Date;
import javax.swing.text.AbstractDocument;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;

public class ReportePDF extends javax.swing.JFrame {
    
    private boolean mensajeMostrado = false;
    private WebServiceFV servicioWeb;
    private WSFV servicioWeb3;
    private JDatePicker datePickerInicio;
    private JDatePicker datePickerTermino;
    
    
    public ReportePDF() {
        
        initComponents();
        
       // btnCSV.setEnabled(false);
        agregarKeyListenerAno() ;
        agregarKeyListenerAnoo();
        agregarKeyListenerFechaInicio();
        agregarKeyListenerFechaTermino();
        TextPrompt prueba = new TextPrompt("dd_MM-yyyy", txtFechaInicio);
        TextPrompt prueba2 = new TextPrompt("dd_MM-yyyy", txtFechaTermino);
        
        
        
        rdbVentaRechazada.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdbVentaRechazadaActionPerformed(evt);
    }
});
        rdbVenta.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdbVentaActionPerformed(evt);
    }
});

rdbVentaRechazada.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdbVentaRechazadaActionPerformed(evt);
    }
});

         
        // No se pueden presionar a la misma vez
        ButtonGroup grupoRadioButtons = new ButtonGroup();
        grupoRadioButtons.add(rdbVenta);
        grupoRadioButtons.add(rdbVentaRechazada);
        //Solo numeros
        aplicarFiltroNumerico(txtAno);
        aplicarFiltroNumerico(txtAnoInicio);
        aplicarFiltroNumerico(txtAnoTermino);
        //Solo numeros
   
        setIconImage(IconoUtil.obtenerIcono());
        txtAno.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        manejarActualizaciones();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        manejarActualizaciones();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener,
        // pero no es relevante para JTextField
    }
});

//////////////////// Agregar DocumentListener para txtAno2----------------------------------------------------
txtAno2.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarPorAno();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarPorAnoCancelados();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
          if (rdbVenta.isSelected()) {
            actualizarPorAno();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarPorAnoCancelados();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener, 
        // pero no es relevante para JTextField
    }
});
//---------------------------------------------------------------------------------------------------------//
/////LISTENER AÑO INICIO Y TERMINO        
// Para txtAnoInicio
txtAnoInicio.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaAno();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaAno2();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaAno();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaAno2();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener, 
        // pero no es relevante para JTextField
    }
});

// Para txtAnoTermino
txtAnoTermino.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaAno();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaAno2();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaAno();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaAno2();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener, 
        // pero no es relevante para JTextField
    }
});
/////LISTENER AÑO INICIO Y TERMINO
//---------------------------------------------------------------------------------------------------------//
//////////Listeener FECHA inicio y termino       
// Para txtFechaInicio
txtFechaInicio.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaInicioTermino();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaInicioTermino2();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaInicioTermino();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaInicioTermino2();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener,
        // pero no es relevante para JTextField
    }
});

// Para txtFechaTermino
txtFechaTermino.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaInicioTermino();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaInicioTermino2();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (rdbVenta.isSelected()) {
            actualizarTablaInicioTermino();
        } else if (rdbVentaRechazada.isSelected()) {
            actualizarTablaInicioTermino2();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener,
        // pero no es relevante para JTextField
    }
});
//////////Listeener FECHA inicio y termino-- 
//---------------------------------------------------------------------------------------------------------//
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        WSREPORTERIAFV servicio3 = new WSREPORTERIAFV();
        
////////////////////// no escribir en celdaas
        servicioWeb = servicio.getWebServiceFVPort(); 
        servicioWeb3 = servicio3.getWSFVPort();
        //tblReporte2.setRowSelectionAllowed(false);
        tblReporte2.setDefaultEditor(Object.class, null);   
        tblReporte.setRowSelectionAllowed(false);
        tblReporte.setDefaultEditor(Object.class, null);   
/////////////////// Listener txtAno
        txtAno.getDocument().addDocumentListener(new DocumentListener() {
            
        @Override
        public void insertUpdate(DocumentEvent e) {
             actualizarTabla();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            actualizarTabla();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        // Este método se usa en situaciones específicas con DocumentListener, pero no es relevante para JTextField
                }
            }
        );
/////////////////// Listener txtAno
        
        tblReporte.setRowSelectionAllowed(true);
   
        tblReporte.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
   
        
/////////////////// Seleccionar fila completa
        ListSelectionModel selectionModel = tblReporte.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                // Este código se ejecutará cuando la selección cambie
                int selectedRow = tblReporte.getSelectedRow();
            if (selectedRow != -1) {
                // Lógica para tratar con la fila seleccionada
                // ...
                     }
                }
            }
        }
    );
     ListSelectionModel selectionModel2 = tblReporte2.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                // Este código se ejecutará cuando la selección cambie
                int selectedRow = tblReporte2.getSelectedRow();
            if (selectedRow != -1) {
                // Lógica para tratar con2 la fila seleccionada
                // ...
                     }
                }
            }
        }
    );
        
/////////////////// Seleccionar fila completa


         
         
    //ancho,alto
    setSize(980, 835);
    setResizable(false);
    //cargar_detalle_reporte();
     actualizarTabla();
    }
    
    //Solo numeros
    private static class NumberOnlyFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        // Permitir solo dígitos
        if (string.matches("\\d+")) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {
        // Permitir solo dígitos
        if (text.matches("\\d+")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    //Solo numeros
    
    
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAnoTermino = new javax.swing.JTextField();
        txtAnoInicio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        btnPDF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdbVenta = new javax.swing.JRadioButton();
        rdbVentaRechazada = new javax.swing.JRadioButton();
        btnImprimir = new javax.swing.JButton();
        btnCSV = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReporte2 = new javax.swing.JTable();
        btnPDF2 = new javax.swing.JButton();
        btnImprimir2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaTermino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAno2 = new javax.swing.JTextField();
        cbxTodo = new javax.swing.JCheckBox();
        cbxTodo2 = new javax.swing.JCheckBox();
        btnCSV2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("Año");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        jLabel4.setText("Año inicio");

        jLabel5.setText("Año termino");

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fruta", "Calibre", "Cantidad vendida"
            }
        ));
        jScrollPane1.setViewportView(tblReporte);

        btnPDF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF.png"))); // NOI18N
        btnPDF.setText("Generar PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logologo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Generar reportes");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Reporte de pedidos");

        rdbVenta.setBackground(new java.awt.Color(204, 255, 204));
        rdbVenta.setText("Venta");
        rdbVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVentaActionPerformed(evt);
            }
        });

        rdbVentaRechazada.setBackground(new java.awt.Color(204, 255, 204));
        rdbVentaRechazada.setText("Venta rechazadas");
        rdbVentaRechazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVentaRechazadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(396, 396, 396))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbVenta)
                        .addGap(50, 50, 50)
                        .addComponent(rdbVentaRechazada)
                        .addGap(96, 96, 96))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbVentaRechazada)
                    .addComponent(rdbVenta)))
        );

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCSV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        btnCSV.setText("Generar CSV");
        btnCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Reporte detalles del pedido");

        tblReporte2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID cliente", "ID pedido", "Peso Total", "Comision", "Estado", "Tipo seguro", "Total pedido", "Total transportista", "IVA", "Total final"
            }
        ));
        jScrollPane2.setViewportView(tblReporte2);

        btnPDF2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPDF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PDF.png"))); // NOI18N
        btnPDF2.setText("Generar PDF");
        btnPDF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF2ActionPerformed(evt);
            }
        });

        btnImprimir2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnImprimir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        btnImprimir2.setText("Imprimir");
        btnImprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha inicio");

        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha termino");

        txtFechaTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaTerminoActionPerformed(evt);
            }
        });

        jLabel6.setText("Año");

        txtAno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAno2ActionPerformed(evt);
            }
        });

        cbxTodo.setBackground(new java.awt.Color(204, 255, 204));
        cbxTodo.setText("Seleccionar todo");

        cbxTodo2.setBackground(new java.awt.Color(204, 255, 204));
        cbxTodo2.setText("Seleccionar todo");

        btnCSV2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCSV2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        btnCSV2.setText("Generar CSV");
        btnCSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSV2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAno2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAnoTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxTodo2))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCSV2)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxTodo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPDF2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCSV)
                            .addComponent(btnImprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtAnoTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cbxTodo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbxTodo))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPDF2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void aplicarFiltroNumerico(JTextField textField) {
    ((AbstractDocument) textField.getDocument()).setDocumentFilter(new NumberOnlyFilter());
}
    private void actualizarTabla() {
      try {
        String arg0 = txtAno.getText(); // Obtén el texto actual del txtAno
        List<Reporte> report;

        if (arg0.isEmpty()) {
            report = servicioWeb3.reporteDetallePedidos();
        } else {
            report = servicioWeb3.reporteDetallePedidosxAnio(arg0);
        }

        // Actualizar la tabla con los nuevos datos
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nombre producto", "Calibre", "Cantidad total"});

        for (Reporte reporte : report) {
            model.addRow(new Object[]{reporte.getNombreproducto(), reporte.getDesccalibre(), reporte.getCantidad()});
        }

        tblReporte.setModel(model);

        // Permitir selección múltiple
        tblReporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Agregar listener al checkbox
        cbxTodo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Checkbox seleccionado, seleccionar todas las filas
                    tblReporte.selectAll();
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    // Checkbox desmarcado, deseleccionar todas las filas
                    tblReporte.clearSelection();
                }
            }
        });
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
   
}
        
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    private void actualizarPorAnoCancelados() { //CHECKBOX OK
       try {
        // Obtener el año desde txtAno2
        String ano = txtAno2.getText();

        List<Reporte> reportes;

        if (ano.isEmpty()) {
            // Si txtAno2 está vacío, carga todos los reportes
            reportes = servicioWeb3.reporteDetallePedidos();
        } else {
            // Si txtAno2 tiene valor, carga los reportes con ese año
            reportes = servicioWeb3.reportePedidosCancelados2(ano);
        }

        // Actualizar la tabla con los nuevos datos
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID cliente", "ID pedido", "Peso total", "Comision Maipo", "Estado", "Tipo seguro", "Total Pedido", "Total transportista", "IVA", "Total Final"});

        for (Reporte reporte : reportes) {
            model.addRow(new Object[]{reporte.getClienteIdCliente(), reporte.getIdpedido(), reporte.getPesototalpedido(), reporte.getComisionmaipogrande(),
                    reporte.getEstadopedidoIdestado(), reporte.getTiposeguroIdtiposeguro(), reporte.getTotalpedido(), reporte.getTotaltransporte(),
                    reporte.getIva(), reporte.getTotalfinal()});
        }

        tblReporte2.setModel(model);

        // Agregar listener al checkbox cbxTodo2
        cbxTodo2.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                // Checkbox seleccionado, seleccionar todas las filas
                tblReporte2.selectAll();
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                // Checkbox desmarcado, deseleccionar todas las filas
                tblReporte2.clearSelection();
            }
        });

    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
}
    private void manejarActualizaciones() {
    if (rdbVenta.isSelected()) {
        actualizarTablaInicioTermino();
        actualizarTablaAno();
        actualizarPorAno();
    } else if (rdbVentaRechazada.isSelected()) {
        actualizarTablaInicioTermino2();
        actualizarTablaAno2();
        actualizarPorAnoCancelados();
    } else {
        limpiarTabla(tblReporte2);
    }
}
    private void actualizarPorAno() { //checkbox ok
      try {
        // Obtener el año desde txtAno2
        String ano = txtAno2.getText();

        List<Reporte> reportes;

        if (ano.isEmpty()) {
            // Si txtAno2 está vacío, carga todos los reportes
            reportes = servicioWeb3.reporteDetallePedidos();
        } else {
            // Si txtAno2 tiene valor, carga los reportes con ese año
            reportes = servicioWeb3.reportePedidosOK2(ano);
        }

        // Actualizar la tabla con los nuevos datos
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID cliente", "ID pedido", "Peso total", "Comision Maipo", "Estado", "Tipo seguro", "Total Pedido", "Total transportista", "IVA", "Total Final"});

        for (Reporte reporte : reportes) {
            model.addRow(new Object[]{reporte.getClienteIdCliente(), reporte.getIdpedido(), reporte.getPesototalpedido(), reporte.getComisionmaipogrande(),
                    reporte.getEstadopedidoIdestado(), reporte.getTiposeguroIdtiposeguro(), reporte.getTotalpedido(), reporte.getTotaltransporte(),
                    reporte.getIva(), reporte.getTotalfinal()});
        }

        tblReporte2.setModel(model);

        // Agregar listener al checkbox cbxTodo2
        cbxTodo2.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                // Checkbox seleccionado, seleccionar todas las filas
                tblReporte2.selectAll();
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                // Checkbox desmarcado, deseleccionar todas las filas
                tblReporte2.clearSelection();
            }
        });

    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
} //ok
    private void actualizarTablaAno(){ ///checklisto ((ok
         try {
        // Verificar si rdbVenta está seleccionado
        if (rdbVenta.isSelected()) {
            // Obtener años
            String anoInicio = txtAnoInicio.getText();
            String anoTermino = txtAnoTermino.getText();

            List<Reporte> reportes;

            if (anoInicio.isEmpty() || anoTermino.isEmpty()) {
                // Si alguna de las fechas está vacía, carga todos los reportes
                reportes = servicioWeb3.reporteDetallePedidos();
            } else {
                // Si ambos años tienen valores, carga los reportes con esos años
                reportes = servicioWeb3.reportePedidosOK3(anoInicio, anoTermino);
            }

            // Actualizar la tabla con los nuevos datos
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID cliente", "ID pedido", "Peso total","Comision Maipo","Estado","Tipo seguro","Total Pedido","Total transportista","IVA","Total Final"});

            for (Reporte reporte : reportes) {
                model.addRow(new Object[]{reporte.getClienteIdCliente(), reporte.getIdpedido(), reporte.getPesototalpedido(),reporte.getComisionmaipogrande(),
                                          reporte.getEstadopedidoIdestado(),reporte.getTiposeguroIdtiposeguro(),reporte.getTotalpedido(),reporte.getTotaltransporte(),
                                          reporte.getIva(),reporte.getTotalfinal()});
            }

            tblReporte2.setModel(model);

            // Agregar listener al checkbox cbxTodo2
            cbxTodo2.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Checkbox seleccionado, seleccionar todas las filas
                    tblReporte2.selectAll();
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    // Checkbox desmarcado, deseleccionar todas las filas
                    tblReporte2.clearSelection();
                }
            });

        } else {
            // Si rdbVenta no está seleccionado, limpiar la tabla
            limpiarTabla(tblReporte2);
        }
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    } // ok
    private void actualizarTablaAno2(){ //checkboxlisto
     try {
        // Verificar si rdbVentaRechazada está seleccionado
        if (rdbVentaRechazada.isSelected()) {
            // Obtener años
            String anoInicio = txtAnoInicio.getText();
            String anoTermino = txtAnoTermino.getText();

            List<Reporte> reportes;

            if (anoInicio.isEmpty() || anoTermino.isEmpty()) {
                // Si alguna de las fechas está vacía, carga todos los reportes cancelados
                reportes = servicioWeb3.reportePedidosCancelados3("", "");
            } else {
                // Si ambos años tienen valores, carga los reportes cancelados con esos años
                reportes = servicioWeb3.reportePedidosCancelados3(anoInicio, anoTermino);
            }

            // Actualizar la tabla con los nuevos datos
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID cliente", "ID pedido", "Peso total", "Comision Maipo", "Estado", "Total Pedido", "IVA"});

            for (Reporte reporte : reportes) {
                model.addRow(new Object[]{reporte.getClienteIdCliente(), reporte.getIdpedido(), reporte.getPesototalpedido(), reporte.getComisionmaipogrande(),
                        reporte.getEstadopedidoIdestado(), reporte.getTotalpedido(), reporte.getIva()});
            }

            tblReporte2.setModel(model);

            // Agregar listener al checkbox cbxTodo2
            cbxTodo2.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Checkbox seleccionado, seleccionar todas las filas
                    tblReporte2.selectAll();
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    // Checkbox desmarcado, deseleccionar todas las filas
                    tblReporte2.clearSelection();
                }
            });

        } else {
            // Si rdbVentaRechazada no está seleccionado, limpiar la tabla
            limpiarTabla(tblReporte2);
        }
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    } //ok
    private void actualizarTablaInicioTermino2(){
    try {
        // Verificar si rdbVentaRechazada está seleccionado
        if (rdbVentaRechazada.isSelected()) {
            // Obtener fechas
            String fechaInicio = txtFechaInicio.getText();
            String fechaTermino = txtFechaTermino.getText();

            List<Reporte> reportes;

            if (fechaInicio.isEmpty() || fechaTermino.isEmpty()) {
                // Si alguna de las fechas está vacía, carga todos los reportes cancelados
                reportes = servicioWeb3.reportePedidosCancelados1(fechaInicio, fechaTermino);
            } else {
                // Si ambas fechas tienen valores, carga los reportes cancelados con esas fechas
                reportes = servicioWeb3.reportePedidosCancelados1(fechaInicio, fechaTermino);
            }

            // Actualizar la tabla con los nuevos datos
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID cliente", "ID pedido", "Peso total","Comision Maipo","Estado","Tipo seguro","Total Pedido","Total transportista","IVA","Total Final"});

            for (Reporte reporte : reportes) {
                model.addRow(new Object[]{reporte.getClienteIdCliente(), reporte.getIdpedido(), reporte.getPesototalpedido(),reporte.getComisionmaipogrande(),
                                          reporte.getEstadopedidoIdestado(),reporte.getTiposeguroIdtiposeguro(),reporte.getTotalpedido(),reporte.getTotaltransporte(),
                                          reporte.getIva(),reporte.getTotalfinal()});
            }

            tblReporte2.setModel(model);

            // Agregar listener al checkbox cbxTodo2
            cbxTodo2.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Checkbox seleccionado, seleccionar todas las filas
                    tblReporte2.selectAll();
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    // Checkbox desmarcado, deseleccionar todas las filas
                    tblReporte2.clearSelection();
                }
            });

        } else {
            // Si rdbVentaRechazada no está seleccionado, limpiar la tabla
            limpiarTabla(tblReporte2);
        }
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    } //ok
    private void actualizarTablaInicioTermino() {
     try {
        // Verificar si rdbVenta está seleccionado
        if (rdbVenta.isSelected()) {
            // Obtener fechas
            String fechaInicio = txtFechaInicio.getText();
            String fechaTermino = txtFechaTermino.getText();

            System.out.println("Fecha Inicio: " + fechaInicio);
            System.out.println("Fecha Termino: " + fechaTermino);

            List<Reporte> reportes;

            if (fechaInicio.isEmpty() || fechaTermino.isEmpty()) {
                // Si alguna de las fechas está vacía, carga todos los reportes
                reportes = servicioWeb3.reporteDetallePedidos();
            } else {
                // Si ambas fechas tienen valores, carga los reportes con esas fechas
                reportes = servicioWeb3.reportePedidosOK1(fechaInicio, fechaTermino);
            }

            // Actualizar la tabla con los nuevos datos
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ID cliente", "ID pedido", "Peso total","Comision Maipo","Estado","Tipo seguro","Total Pedido","Total transportista","IVA","Total Final"});

            for (Reporte reporte : reportes) {
                model.addRow(new Object[]{reporte.getClienteIdCliente(), reporte.getIdpedido(), reporte.getPesototalpedido(),reporte.getComisionmaipogrande(),
                                          reporte.getEstadopedidoIdestado(),reporte.getTiposeguroIdtiposeguro(),reporte.getTotalpedido(),reporte.getTotaltransporte(),
                                          reporte.getIva(),reporte.getTotalfinal()});
            }

            tblReporte2.setModel(model);

            // Agregar listener al checkbox cbxTodo2
            cbxTodo2.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Checkbox seleccionado, seleccionar todas las filas
                    tblReporte2.selectAll();
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    // Checkbox desmarcado, deseleccionar todas las filas
                    tblReporte2.clearSelection();
                }
            });

        } else {
            // Si rdbVenta no está seleccionado, limpiar la tabla
            limpiarTabla(tblReporte2);
        }
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }
    }   
    
    private void rdbVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbVentaActionPerformed
    if (rdbVenta.isSelected()) {
        // Actualizar la tabla por inicio/termino
        actualizarTablaInicioTermino();

        // Verificar si hay datos en txtAnoInicio y txtAnoTermino
        if (!txtAnoInicio.getText().isEmpty() && !txtAnoTermino.getText().isEmpty()) {
            // Si hay datos, actualizar la tabla por año
            actualizarTablaAno();
        }

        // Verificar si hay datos en txtAno2
        if (!txtAno2.getText().isEmpty()) {
            // Si hay datos, actualizar la tabla por año (puede ajustarse según tus necesidades)
            actualizarPorAno();
        }
    } else {
        limpiarTabla(tblReporte2);
    }
    }//GEN-LAST:event_rdbVentaActionPerformed
    private void limpiarTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
    }

    // Método para agregar datos a la tabla
    private void agregarDatosATabla(JTable tabla, List<Reporte> reportes) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        for (Reporte reporte : reportes) {
            model.addRow(new Object[]{reporte.getDesccalibre(), reporte.getCantidad(), /* ...otros campos... */});
        }
    }
    private void btnPDF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF2ActionPerformed
   int[] selectedRows = tblReporte.getSelectedRows();
    String pdfFileName = null; // Declarar pdfFileName fuera del bloque try

    // Verificar si hay filas seleccionadas
    if (selectedRows.length > 0) {
        // Crear un documento PDF
        Document document = new Document();

        try {
            // Crear un objeto JFileChooser
            JFileChooser fileChooser = new JFileChooser();
            // Mostrar el diálogo de guardar archivo
            int userSelection = fileChooser.showSaveDialog(this);

            // Verificar si el usuario seleccionó un lugar para guardar
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Obtener la ruta seleccionada
                File fileToSave = fileChooser.getSelectedFile();

                // Agregar la extensión .pdf si no está presente en el nombre del archivo
                if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".pdf")) {
                    fileToSave = new File(fileToSave.getAbsolutePath() + ".pdf");
                }

                // Establecer el nombre del archivo PDF
                pdfFileName = fileToSave.getAbsolutePath();

                // Crear el archivo PDF
                PdfWriter.getInstance(document, new FileOutputStream(pdfFileName));
                document.open();

                // Iterar sobre las filas seleccionadas
                for (int selectedRow : selectedRows) {
                    // Obtener los datos de la fila seleccionada
                    String[] columnNames = new String[]{"Nombre producto", "Calibre", "Cantidad total"};
                    Object[] rowData = new Object[]{tblReporte.getValueAt(selectedRow, 0), tblReporte.getValueAt(selectedRow, 1), tblReporte.getValueAt(selectedRow, 2)};

                    // Agregar título e imagen en la misma línea
                    Paragraph titleAndImage = new Paragraph();
                    int titleOffset = -20; // Ajusta este valor según sea necesario para mover a la izquierda

                    // Agregar espacios al principio del título para desplazarlo
                    for (int i = 0; i < Math.abs(titleOffset); i++) {
                        titleAndImage.add(new Chunk(" ", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD)));
                    }

                    titleAndImage.add(new Phrase("Departamento de consultorías", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD)));

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
                    document.add(new Paragraph(" "));
                    // Agregar contenido al PDF (informe de detalle de pedidos)
                    document.add(new Paragraph("Informe de Detalle de Pedido"));
                    document.add(new Paragraph(" "));

                    PdfPTable table = new PdfPTable(columnNames.length);

                    // Agregar encabezados de columna al PDF
                    for (String columnName : columnNames) {
                        table.addCell(columnName);
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

                    // Agregar detalles adicionales
                    document.add(new Paragraph(" "));
                    document.add(new Paragraph("Información detallada de la tabla:"));
                    document.add(new Paragraph(" "));
                    document.add(new Paragraph("- Nombre de producto: " + tblReporte.getValueAt(selectedRow, 0)));
                    document.add(new Paragraph("- Descripción calibre: " + tblReporte.getValueAt(selectedRow, 1)));
                    document.add(new Paragraph("- Cantidad total vendida del producto: " + tblReporte.getValueAt(selectedRow, 2)));

                    // Agregar una página nueva para la siguiente fila (si existe)
                    if (selectedRow < selectedRows.length - 1) {
                        document.newPage();
                    }
                }
            } else {
                // Si el usuario cancela el diálogo, salir del método
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar el documento fuera del bloque try
            if (document != null && document.isOpen()) {
                document.close();
            }
        }

        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "PDF generado correctamente: " + pdfFileName, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Si no hay filas seleccionadas, mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Selecciona al menos una fila antes de generar el PDF", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnPDF2ActionPerformed

    private void btnImprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir2ActionPerformed
    // Obtener las filas seleccionadas
    int[] selectedRows = tblReporte.getSelectedRows();

    // Verificar si hay al menos una fila seleccionada
    if (selectedRows.length > 0) {
        try {
            // Crear un objeto PrinterJob
            PrinterJob printerJob = PrinterJob.getPrinterJob();

            // Establecer el contenido a imprimir
            printerJob.setPrintable(new Printable() {
                @Override
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex >= selectedRows.length) {
                        return Printable.NO_SUCH_PAGE;
                    }

                    // Obtener el índice de la fila actual
                    int rowIndex = selectedRows[pageIndex];

                    // Obtener los datos de la fila seleccionada
                    String[] columnNames = {"Nombre producto", "Calibre", "Cantidad total"};
                    Object[] rowData = new Object[]{
                            tblReporte.getValueAt(rowIndex, 0),
                            tblReporte.getValueAt(rowIndex, 1),
                            tblReporte.getValueAt(rowIndex, 2)
                    };

                    // Crear una tabla con los datos
                    DefaultTableModel model = new DefaultTableModel();
                    model.setColumnIdentifiers(columnNames);
                    model.addRow(rowData);
                    JTable table = new JTable(model);

                    // Obtener el objeto Graphics2D del objeto Graphics
                    Graphics2D g2d = (Graphics2D) graphics;

                    // Definir el área de impresión
                    double width = pageFormat.getImageableWidth();
                    double height = pageFormat.getImageableHeight();
                    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                    // Escalar la tabla para que quepa en el área de impresión
                    double scaleX = width / table.getWidth();
                    double scaleY = height / table.getHeight();
                    double scale = Math.min(scaleX, scaleY);
                    g2d.scale(scale, scale);

                    // Imprimir la tabla en el área de impresión
                    table.print(g2d);

                    return Printable.PAGE_EXISTS;
                }
            });

            // Mostrar el diálogo de impresión
            if (printerJob.printDialog()) {
                printerJob.print();
            }

        } catch (PrinterException ex) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(null, "Error al imprimir: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    } else {
        // Si no hay filas seleccionadas, mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Selecciona al menos una fila antes de imprimir", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnImprimir2ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       // Obtener las filas seleccionadas
    int[] selectedRows = tblReporte2.getSelectedRows();

    // Verificar si hay al menos una fila seleccionada
    if (selectedRows.length > 0) {
        try {
            // Crear un objeto PrinterJob
            PrinterJob printerJob = PrinterJob.getPrinterJob();

            // Establecer el contenido a imprimir
            printerJob.setPrintable(new Printable() {
                @Override
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex >= selectedRows.length) {
                        return Printable.NO_SUCH_PAGE;
                    }

                    // Obtener el índice de la fila actual
                    int rowIndex = selectedRows[pageIndex];

                    // Obtener los datos de la fila seleccionada
                    String[] columnNames = {"ID cliente", "ID pedido", "Peso total","Comision Maipo","Estado","Tipo seguro","Total Pedido","Total transportista","IVA","Total Final"};
                    Object[] rowData = new Object[]{
                            tblReporte.getValueAt(rowIndex, 0),
                            tblReporte.getValueAt(rowIndex, 1),
                            tblReporte.getValueAt(rowIndex, 2),
                            tblReporte.getValueAt(rowIndex, 3),
                            tblReporte.getValueAt(rowIndex, 4),
                            tblReporte.getValueAt(rowIndex, 5),
                            tblReporte.getValueAt(rowIndex, 6),
                            tblReporte.getValueAt(rowIndex, 7),
                            tblReporte.getValueAt(rowIndex, 8),
                            tblReporte.getValueAt(rowIndex, 9)                          
                    };

                    // Crear una tabla con los datos
                    DefaultTableModel model = new DefaultTableModel();
                    model.setColumnIdentifiers(columnNames);
                    model.addRow(rowData);
                    JTable table = new JTable(model);

                    // Obtener el objeto Graphics2D del objeto Graphics
                    Graphics2D g2d = (Graphics2D) graphics;

                    // Definir el área de impresión
                    double width = pageFormat.getImageableWidth();
                    double height = pageFormat.getImageableHeight();
                    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                    // Escalar la tabla para que quepa en el área de impresión
                    double scaleX = width / table.getWidth();
                    double scaleY = height / table.getHeight();
                    double scale = Math.min(scaleX, scaleY);
                    g2d.scale(scale, scale);

                    // Imprimir la tabla en el área de impresión
                    table.print(g2d);

                    return Printable.PAGE_EXISTS;
                }
            });

            // Mostrar el diálogo de impresión
            if (printerJob.printDialog()) {
                printerJob.print();
            }

        } catch (PrinterException ex) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(null, "Error al imprimir: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    } else {
        // Si no hay filas seleccionadas, mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Selecciona al menos una fila antes de imprimir", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void rdbVentaRechazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbVentaRechazadaActionPerformed
       if (rdbVentaRechazada.isSelected()) {
        // Actualizar la tabla por inicio/termino
        actualizarTablaInicioTermino2();

        // Verificar si hay datos en txtAnoInicio y txtAnoTermino
        if (!txtAnoInicio.getText().isEmpty() && !txtAnoTermino.getText().isEmpty()) {
            // Si hay datos, actualizar la tabla por año
            actualizarTablaAno2();
        }

        // Verificar si hay datos en txtAno2
        if (!txtAno2.getText().isEmpty()) {
            // Si hay datos, actualizar la tabla por año (puede ajustarse según tus necesidades)
            actualizarPorAnoCancelados();
        }
    } else {
        limpiarTabla(tblReporte2);
    }
    }//GEN-LAST:event_rdbVentaRechazadaActionPerformed

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
                    // Obtener los datos de la fila seleccionada
                    String[] columnNames;
                    Object[] rowData;

                    // Verificar qué radiobutton está seleccionado
                    if (rdbVenta.isSelected()) {
                        // Acciones específicas para el informe de ventas
                        pdfFileName = "Informe_Venta_" + tblReporte2.getValueAt(selectedRow, 0) + ".pdf";
                        columnNames = new String[]{"ID cliente", "ID pedido", "Peso total", "Comision Maipo", "Estado", "Tipo seguro", "Total Pedido", "Total transportista", "IVA", "Total Final"};
                        rowData = new Object[]{tblReporte2.getValueAt(selectedRow, 0), tblReporte2.getValueAt(selectedRow, 1), tblReporte2.getValueAt(selectedRow, 2), tblReporte2.getValueAt(selectedRow, 3), tblReporte2.getValueAt(selectedRow, 4),
                                tblReporte2.getValueAt(selectedRow, 5), tblReporte2.getValueAt(selectedRow, 6), tblReporte2.getValueAt(selectedRow, 7), tblReporte2.getValueAt(selectedRow, 8), tblReporte2.getValueAt(selectedRow, 9)};
                    } else if (rdbVentaRechazada.isSelected()) {
                        // Acciones específicas para el informe de ventas rechazadas
                        pdfFileName = "Informe_VentaRechazada_" + tblReporte2.getValueAt(selectedRow, 0) + ".pdf";
                        columnNames = new String[]{"ID cliente", "ID pedido", "Peso total", "Comision Maipo", "Estado", "Total Pedido", "IVA"};
                        rowData = new Object[]{tblReporte2.getValueAt(selectedRow, 0), tblReporte2.getValueAt(selectedRow, 1), tblReporte2.getValueAt(selectedRow, 2), tblReporte2.getValueAt(selectedRow, 3), tblReporte2.getValueAt(selectedRow, 4),
                                tblReporte2.getValueAt(selectedRow, 5), tblReporte2.getValueAt(selectedRow, 6)};
                    } else {
                        // Manejar el caso en que ninguno de los radiobuttons esté seleccionado
                        JOptionPane.showMessageDialog(null, "Selecciona un tipo de informe antes de generar el PDF", "Información", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Crear una nueva página para cada fila
                    document.newPage();

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

                    PdfPTable table = new PdfPTable(columnNames.length);
                    document.add(new Paragraph(" "));

                    // Agregar encabezados de columna al PDF
                    for (String columnName : columnNames) {
                        table.addCell(columnName);
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
                    document.add(new Paragraph("- ID Cliente: " + tblReporte2.getValueAt(selectedRow, 0)));
                    document.add(new Paragraph("- ID Pedido: " + tblReporte2.getValueAt(selectedRow, 1)));
                    document.add(new Paragraph("- Peso total: " + tblReporte2.getValueAt(selectedRow, 2)));
                    document.add(new Paragraph("- Comision Maipo Grande: " + tblReporte2.getValueAt(selectedRow, 3)));
                    document.add(new Paragraph("- Estado del pedido: " + tblReporte2.getValueAt(selectedRow, 4)));
                    document.add(new Paragraph("- Tipo de seguro: " + tblReporte2.getValueAt(selectedRow, 5)));
                    document.add(new Paragraph("- Total pedido: " + tblReporte2.getValueAt(selectedRow, 6)));
                    document.add(new Paragraph("- Total transporte: " + tblReporte2.getValueAt(selectedRow, 7)));
                    document.add(new Paragraph("- IVA: " + tblReporte2.getValueAt(selectedRow, 8)));
                    document.add(new Paragraph("- Total final: " + tblReporte2.getValueAt(selectedRow, 9)));

                    // Agrega más líneas según sea necesario
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
private void agregarKeyListenerFechaInicio() {
   // Agrega un KeyListener al campo txtFechaInicio
    txtFechaInicio.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            // Obtén el carácter ingresado
            char caracter = e.getKeyChar();
            
            // Verifica si el carácter no es un número ni la barra "/" o la longitud es mayor a 10
            if (!Character.isDigit(caracter) && caracter != '-' || txtFechaInicio.getText().length() >= 10) {
                // Consumir el evento para evitar que se ingrese el carácter
                e.consume();
            }
        }
    });
}
    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioActionPerformed
private void agregarKeyListenerFechaTermino() {
   // Agrega un KeyListener al campo txtFechaInicio
    txtFechaTermino.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            // Obtén el carácter ingresado
            char caracter = e.getKeyChar();
            
            // Verifica si el carácter no es un número ni la barra "/" o la longitud es mayor a 10
            if (!Character.isDigit(caracter) && caracter != '-' || txtFechaTermino.getText().length() >= 10) {
                // Consumir el evento para evitar que se ingrese el carácter
                e.consume();
            }
        }
    });
}
    private void txtFechaTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaTerminoActionPerformed
private void agregarKeyListenerAnoo() {
    // Agrega un KeyListener al campo txtRut
    txtAno2.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            // Obtén el carácter ingresado
            char caracter = e.getKeyChar();
            
            // Verifica si el carácter no es un número o la longitud es mayor a 8
            if (!Character.isDigit(caracter) || txtAno2.getText().length() >= 4) {
                // Consumir el evento para evitar que se ingrese el carácter
                e.consume();
            }
        }
    });
}
    private void txtAno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno2ActionPerformed
private void agregarKeyListenerAno() {
    // Agrega un KeyListener al campo txtRut
    txtAno.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            // Obtén el carácter ingresado
            char caracter = e.getKeyChar();
            
            // Verifica si el carácter no es un número o la longitud es mayor a 8
            if (!Character.isDigit(caracter) || txtAno.getText().length() >= 4) {
                // Consumir el evento para evitar que se ingrese el carácter
                e.consume();
            }
        }
    });
}
    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void btnCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVActionPerformed
      try {
        // Obtener las filas seleccionadas
        int[] selectedRows = tblReporte.getSelectedRows();

        // Verificar si hay filas seleccionadas
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona al menos una fila antes de generar el CSV", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Crear un objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        // Mostrar el diálogo de guardar archivo
        int userSelection = fileChooser.showSaveDialog(null);

        // Verificar si el usuario seleccionó un lugar para guardar
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obtener la ruta seleccionada
            File fileToSave = fileChooser.getSelectedFile();

            // Agregar la extensión .csv si no está presente en el nombre del archivo
            if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".csv")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
            }

            // Establecer el nombre del archivo CSV
            String csvFileName = fileToSave.getAbsolutePath();

            // Crear el archivo CSV
            FileWriter csvWriter = new FileWriter(csvFileName);

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblReporte.getModel();

            // Obtener el número de columnas en la tabla
            int numCols = model.getColumnCount();

            // Escribir encabezados de columna al archivo CSV
            for (int i = 0; i < numCols; i++) {
                csvWriter.append(model.getColumnName(i));
                if (i < numCols - 1) {
                    csvWriter.append(",");
                }
            }
            csvWriter.append("\n");

            // Escribir datos de fila seleccionada al archivo CSV
            for (int selectedRow : selectedRows) {
                for (int col = 0; col < numCols; col++) {
                    csvWriter.append(model.getValueAt(selectedRow, col).toString());
                    if (col < numCols - 1) {
                        csvWriter.append(",");
                    }
                }
                csvWriter.append("\n");
            }

            // Cerrar el escritor de CSV
            csvWriter.close();

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "CSV generado correctamente: " + csvFileName, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si el usuario cancela el diálogo, salir del método
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al generar el CSV: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnCSVActionPerformed

    private void btnCSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSV2ActionPerformed
     try {
        // Obtener las filas seleccionadas
        int[] selectedRows = tblReporte2.getSelectedRows();

        // Verificar si hay filas seleccionadas
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona al menos una fila antes de generar el CSV", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Crear un objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        // Mostrar el diálogo de guardar archivo
        int userSelection = fileChooser.showSaveDialog(null);

        // Verificar si el usuario seleccionó un lugar para guardar
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obtener la ruta seleccionada
            File fileToSave = fileChooser.getSelectedFile();

            // Agregar la extensión .csv si no está presente en el nombre del archivo
            if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".csv")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
            }

            // Establecer el nombre del archivo CSV
            String csvFileName = fileToSave.getAbsolutePath();

            // Crear el archivo CSV
            FileWriter csvWriter = new FileWriter(csvFileName);

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblReporte2.getModel();

            // Obtener el número de columnas en la tabla
            int numCols = model.getColumnCount();

            // Escribir encabezados de columna al archivo CSV
            for (int i = 0; i < numCols; i++) {
                csvWriter.append(model.getColumnName(i));
                if (i < numCols - 1) {
                    csvWriter.append(",");
                }
            }
            csvWriter.append("\n");

            // Escribir datos de fila seleccionada al archivo CSV
            for (int selectedRow : selectedRows) {
                for (int col = 0; col < numCols; col++) {
                    csvWriter.append(model.getValueAt(selectedRow, col).toString());
                    if (col < numCols - 1) {
                        csvWriter.append(",");
                    }
                }
                csvWriter.append("\n");
            }

            // Cerrar el escritor de CSV
            csvWriter.close();

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "CSV generado correctamente: " + csvFileName, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si el usuario cancela el diálogo, salir del método
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al generar el CSV: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCSV2ActionPerformed

    
    /* public void cargar_detalle_reporte(){
       try {
        // Obtener el texto actual del txtAno
        String arg0 = txtAno.getText();

        // Método para mostrar todos los reportes cuando el txtAno esté vacío
        List<Reporte> report;

        if (arg0.isEmpty()) {
            report = servicioWeb3.reporteDetallePedidos();
        } else {
            // Método para mostrar los mismos reportes anteriores pero ahora cuando se ingrese un txt ano lo filtre por el año
            report = servicioWeb3.reporteDetallePedidosxAnio(arg0);
        }

        // Mostrar los datos en un componente visual (por ejemplo, una tabla)
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nombre producto", "Calibre", "Cantidad total"});

        for (Reporte reporte : report) {
            model.addRow(new Object[]{reporte.getNombreproducto(), reporte.getDesccalibre(), reporte.getCantidad()});
        }

        // Asignar el modelo de datos a la tabla (reemplaza "tblReporte" con el nombre de tu tabla)
        tblReporte.setModel(model);
    } catch (Exception ex) {
        // Manejar la excepción aquí
        JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // O muestra un mensaje de error en lugar de imprimir la traza
    }*/


       
     public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportePDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCSV;
    private javax.swing.JButton btnCSV2;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir2;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPDF2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox cbxTodo;
    private javax.swing.JCheckBox cbxTodo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbVenta;
    private javax.swing.JRadioButton rdbVentaRechazada;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTable tblReporte2;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAno2;
    private javax.swing.JTextField txtAnoInicio;
    private javax.swing.JTextField txtAnoTermino;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtFechaTermino;
    // End of variables declaration//GEN-END:variables
}
