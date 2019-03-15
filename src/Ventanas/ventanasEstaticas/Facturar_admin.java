     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.ventanasEstaticas;
import Ventanas.ventanasEstaticas.Buscador_cliente;


/**
 *
 * @author 20956852766
 */
public class Facturar_admin extends javax.swing.JFrame {

    /**
     * Creates new form Facturar_admin
     */
    public Facturar_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar_facturar = new javax.swing.JButton();
        razonsocial_titulo_facturar = new javax.swing.JLabel();
        razonsocial_facturar = new javax.swing.JTextField();
        razonsocial_titulo_facturar1 = new javax.swing.JLabel();
        documento_facturar = new javax.swing.JTextField();
        telefono_facturar = new javax.swing.JTextField();
        telefono_titulo_facturar = new javax.swing.JLabel();
        direccion_facturar = new javax.swing.JTextField();
        direccion_titulo_facturar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        boton_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_facturar.setText(" BUSCAR CLIENTE (F5)");
        buscar_facturar.setToolTipText("");
        buscar_facturar.setPreferredSize(new java.awt.Dimension(210, 50));
        buscar_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_facturarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 50));

        razonsocial_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar.setText("DOCUMENTO");
        getContentPane().add(razonsocial_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(razonsocial_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 650, 50));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("RAZON SOCIAL");
        getContentPane().add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));
        getContentPane().add(documento_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 50));
        getContentPane().add(telefono_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 250, 50));

        telefono_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefono_titulo_facturar.setText("TELEFONO");
        getContentPane().add(telefono_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));
        getContentPane().add(direccion_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 340, 50));

        direccion_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direccion_titulo_facturar.setText("DIRECCIÓN");
        getContentPane().add(direccion_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 160, -1));

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 860, 380));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_facturarActionPerformed
        System.out.println("Entro en facturar, en el buscador directo");
        Buscador_cliente buscador = new Buscador_cliente();
        System.out.println("creo el objeto");
        buscador.setVisible(true);
    }//GEN-LAST:event_buscar_facturarActionPerformed

    private void boton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_boton_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Facturar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturar_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cerrar;
    private javax.swing.JButton buscar_facturar;
    private javax.swing.JTextField direccion_facturar;
    private javax.swing.JLabel direccion_titulo_facturar;
    private javax.swing.JTextField documento_facturar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField razonsocial_facturar;
    private javax.swing.JLabel razonsocial_titulo_facturar;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    private javax.swing.JTextField telefono_facturar;
    private javax.swing.JLabel telefono_titulo_facturar;
    // End of variables declaration//GEN-END:variables
}
