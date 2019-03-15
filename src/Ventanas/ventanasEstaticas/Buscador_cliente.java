
package Ventanas.ventanasEstaticas;

import Clases.Conexion;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Buscador_cliente extends javax.swing.JFrame {
    public Buscador_cliente() {
        System.out.println("Buscar cliente");
        initComponents();
        this.setLocationRelativeTo(null);
        this.traerClientes();
    }
    
    public void traerClientes(){
        DefaultTableModel tabla = (DefaultTableModel) this.tabla_buscador.getModel();
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
        boton_cerrar = new javax.swing.JButton();
        crear_buscador = new javax.swing.JButton();
        editar_buscador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_buscador.setText(" Modificar cliente");
        buscar_buscador.setToolTipText("");
        buscar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        getContentPane().add(buscar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 210, 50));

        razonsocial_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar(evt);
            }
        });
        getContentPane().add(razonsocial_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 650, 50));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("RAZON SOCIAL O DNI");
        getContentPane().add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        tabla_buscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOCUMENTO", "RAZÓN SOCIALl", "TELÉFONO", "DIRECCIÓN"
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

        getContentPane().add(scroll_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 860, 410));

        boton_cerrar.setBackground(new java.awt.Color(163, 11, 16));
        boton_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cerrar.setText("SALIR");
        boton_cerrar.setBorder(null);
        boton_cerrar.setBorderPainted(false);
        boton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 110, 40));

        crear_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        crear_buscador.setText(" BUSCAR CLIENTE (F5)");
        crear_buscador.setToolTipText("");
        crear_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        crear_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_buscadorActionPerformed(evt);
            }
        });
        getContentPane().add(crear_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 210, 50));

        editar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        editar_buscador.setText(" Crear nuevo cliente");
        editar_buscador.setToolTipText("");
        editar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        editar_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_buscadorActionPerformed(evt);
            }
        });
        getContentPane().add(editar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 210, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_boton_cerrarActionPerformed

    private void buscar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar
        filtro(this.razonsocial_buscador.getText().toUpperCase());
    }//GEN-LAST:event_buscar

    private void crear_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crear_buscadorActionPerformed

    private void editar_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_buscadorActionPerformed
    
    private void filtro(String consulta){
        DefaultTableModel modelo = (DefaultTableModel) this.tabla_buscador.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        this.tabla_buscador.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
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
            java.util.logging.Logger.getLogger(Buscador_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cerrar;
    private javax.swing.JButton buscar_buscador;
    private javax.swing.JButton crear_buscador;
    private javax.swing.JButton editar_buscador;
    private javax.swing.JTextField razonsocial_buscador;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    private javax.swing.JScrollPane scroll_buscador;
    private javax.swing.JTable tabla_buscador;
    // End of variables declaration//GEN-END:variables
}
