
package Ventanas;
public class Sistema extends javax.swing.JFrame {
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_salir.setBackground(new java.awt.Color(255, 51, 51));
        boton_salir.setForeground(new java.awt.Color(255, 255, 255));
        boton_salir.setText("Salir");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 40));

        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 350, 250));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background2.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(2000, 1200));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -40, 1080, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_boton_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
