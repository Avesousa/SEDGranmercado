
package Ventanas.ventanasEstaticas;

import Clases.Conexion;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Buscador_cliente extends javax.swing.JFrame {
    Facturar_admin v;
    
    DefaultTableModel tabla;
    
    public Buscador_cliente(Facturar_admin ventana) {
        System.out.println("Buscar cliente");
        initComponents();
        this.setLocationRelativeTo(null);
        this.traerClientes();
        v = ventana;
    }
    
    
    
    private void traerClientes(){
        tabla = (DefaultTableModel) this.tabla_buscador.getModel();
        Conexion conectador = new Conexion();
        conectador.traer_clientes(tabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar_buscador = new javax.swing.JButton();
        razonsocial_buscador = new javax.swing.JTextField();
        razonsocial_titulo_facturar1 = new javax.swing.JLabel();
        scroll_buscador = new javax.swing.JScrollPane();
        tabla_buscador = new javax.swing.JTable();
        seleccionar_buscador = new javax.swing.JButton();
        crear_buscador = new javax.swing.JButton();
        editar_buscador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_buscador.setText(" BUSCAR CLIENTE");
        buscar_buscador.setToolTipText("");
        buscar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        getContentPane().add(buscar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 210, 50));

        razonsocial_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar(evt);
            }
        });
        getContentPane().add(razonsocial_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 650, 50));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("RAZON SOCIAL O DNI");
        getContentPane().add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        tabla_buscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOCUMENTO", "RAZÓN SOCIAL", "TELÉFONO", "DIRECCIÓN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll_buscador.setViewportView(tabla_buscador);

        getContentPane().add(scroll_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 860, 300));

        seleccionar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        seleccionar_buscador.setText(" Seleccionar cliente");
        seleccionar_buscador.setToolTipText("");
        seleccionar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        seleccionar_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarCliente(evt);
            }
        });
        getContentPane().add(seleccionar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 50));

        crear_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        crear_buscador.setText(" Crear nuevo cliente");
        crear_buscador.setToolTipText("");
        crear_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        getContentPane().add(crear_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 210, 50));

        editar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list.png"))); // NOI18N
        editar_buscador.setText(" Modificar cliente");
        editar_buscador.setToolTipText("");
        editar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        getContentPane().add(editar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 210, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar
        filtro(this.razonsocial_buscador.getText().toUpperCase());
    }//GEN-LAST:event_buscar

    private void seleccionarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarCliente
        int fila = this.tabla_buscador.getSelectedRow();
        v.documento_facturar.setText(this.tabla_buscador.getValueAt(fila,0).toString());
        v.razonsocial_facturar.setText(this.tabla_buscador.getValueAt(fila,1).toString());
        v.telefono_facturar.setText(this.tabla_buscador.getValueAt(fila,2).toString());
        v.direccion_facturar.setText(this.tabla_buscador.getValueAt(fila,3).toString());
        this.dispose();
    }//GEN-LAST:event_seleccionarCliente
    
    private void filtro(String consulta){
        DefaultTableModel modelo = (DefaultTableModel) this.tabla_buscador.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        this.tabla_buscador.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_buscador;
    private javax.swing.JButton crear_buscador;
    private javax.swing.JButton editar_buscador;
    private javax.swing.JTextField razonsocial_buscador;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    private javax.swing.JScrollPane scroll_buscador;
    private javax.swing.JButton seleccionar_buscador;
    private javax.swing.JTable tabla_buscador;
    // End of variables declaration//GEN-END:variables
}
