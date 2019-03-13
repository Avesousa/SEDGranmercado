
package Ventanas;
public class Sistema extends javax.swing.JFrame {
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        menu_sistema = new javax.swing.JMenuBar();
        archivo_sistema = new javax.swing.JMenu();
        salir_archivo_sistema = new javax.swing.JMenuItem();
        facturas_sistema = new javax.swing.JMenu();
        facturar_facturas_sistema = new javax.swing.JMenuItem();
        devolver_facturas_sistema = new javax.swing.JMenuItem();
        producto_sistema = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background2.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(2000, 1200));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -40, 1080, -1));

        menu_sistema.setBackground(new java.awt.Color(30, 45, 59));
        menu_sistema.setBorder(new javax.swing.border.MatteBorder(null));

        archivo_sistema.setText("ARCHIVO");
        archivo_sistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        salir_archivo_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        salir_archivo_sistema.setText("Salir");
        salir_archivo_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_archivo_sistemaActionPerformed(evt);
            }
        });
        archivo_sistema.add(salir_archivo_sistema);

        menu_sistema.add(archivo_sistema);

        facturas_sistema.setText("FACTURAS");
        facturas_sistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        facturar_facturas_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        facturar_facturas_sistema.setText("Facturar");
        facturar_facturas_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturar_facturas_sistemaActionPerformed(evt);
            }
        });
        facturas_sistema.add(facturar_facturas_sistema);

        devolver_facturas_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        devolver_facturas_sistema.setText("Devolución");
        facturas_sistema.add(devolver_facturas_sistema);

        menu_sistema.add(facturas_sistema);

        producto_sistema.setText("PRODUCTOS");
        producto_sistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setText("jMenuItem1");
        producto_sistema.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        producto_sistema.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        producto_sistema.add(jMenuItem3);

        menu_sistema.add(producto_sistema);

        setJMenuBar(menu_sistema);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturar_facturas_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturar_facturas_sistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturar_facturas_sistemaActionPerformed

    private void salir_archivo_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_archivo_sistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_archivo_sistemaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo_sistema;
    private javax.swing.JMenuItem devolver_facturas_sistema;
    private javax.swing.JMenuItem facturar_facturas_sistema;
    private javax.swing.JMenu facturas_sistema;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menu_sistema;
    private javax.swing.JMenu producto_sistema;
    private javax.swing.JMenuItem salir_archivo_sistema;
    // End of variables declaration//GEN-END:variables
}
