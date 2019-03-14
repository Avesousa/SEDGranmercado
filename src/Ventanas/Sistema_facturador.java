
package Ventanas;

import Clases.Usuario;

public class Sistema_facturador extends javax.swing.JFrame {
    public Sistema_facturador(String u, String na, int c) {
        initComponents();
        Usuario user = new Usuario(u,na,c);
        this.setLocationRelativeTo(null);
         
         System.out.println("El cargo es facturador");
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
        lista_producto_sistema = new javax.swing.JMenuItem();
        agregar_producto_sistema = new javax.swing.JMenuItem();
        modificar_producto_sistema = new javax.swing.JMenuItem();
        eliminar_producto_sistema = new javax.swing.JMenuItem();
        reporte_sistema = new javax.swing.JMenu();
        accion_no_disponible = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background2.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(2000, 1200));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -40, 1080, -1));

        menu_sistema.setBackground(new java.awt.Color(30, 45, 59));
        menu_sistema.setBorder(new javax.swing.border.MatteBorder(null));

        archivo_sistema.setForeground(new java.awt.Color(255, 255, 255));
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

        facturas_sistema.setForeground(new java.awt.Color(255, 255, 255));
        facturas_sistema.setText("FACTURAS");
        facturas_sistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        facturar_facturas_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        facturar_facturas_sistema.setText("Facturar");
        facturas_sistema.add(facturar_facturas_sistema);

        devolver_facturas_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        devolver_facturas_sistema.setText("Devolución");
        facturas_sistema.add(devolver_facturas_sistema);

        menu_sistema.add(facturas_sistema);

        producto_sistema.setForeground(new java.awt.Color(255, 255, 255));
        producto_sistema.setText("PRODUCTOS");
        producto_sistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lista_producto_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        lista_producto_sistema.setText("Listas de Productos");
        producto_sistema.add(lista_producto_sistema);

        agregar_producto_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        agregar_producto_sistema.setText("Agregar Producto");
        producto_sistema.add(agregar_producto_sistema);

        modificar_producto_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        modificar_producto_sistema.setText("Modificar Producto");
        producto_sistema.add(modificar_producto_sistema);

        eliminar_producto_sistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eliminar_producto_sistema.setText("Eliminar Producto");
        producto_sistema.add(eliminar_producto_sistema);

        menu_sistema.add(producto_sistema);

        reporte_sistema.setForeground(new java.awt.Color(255, 255, 255));
        reporte_sistema.setText("REPORTES");
        reporte_sistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        accion_no_disponible.setText("No esta disponible");
        accion_no_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion_no_disponibleActionPerformed(evt);
            }
        });
        reporte_sistema.add(accion_no_disponible);

        menu_sistema.add(reporte_sistema);

        setJMenuBar(menu_sistema);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_archivo_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_archivo_sistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_archivo_sistemaActionPerformed

    private void accion_no_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accion_no_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accion_no_disponibleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem accion_no_disponible;
    private javax.swing.JMenuItem agregar_producto_sistema;
    private javax.swing.JMenu archivo_sistema;
    private javax.swing.JMenuItem devolver_facturas_sistema;
    private javax.swing.JMenuItem eliminar_producto_sistema;
    private javax.swing.JMenuItem facturar_facturas_sistema;
    private javax.swing.JMenu facturas_sistema;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuItem lista_producto_sistema;
    private javax.swing.JMenuBar menu_sistema;
    private javax.swing.JMenuItem modificar_producto_sistema;
    private javax.swing.JMenu producto_sistema;
    private javax.swing.JMenu reporte_sistema;
    private javax.swing.JMenuItem salir_archivo_sistema;
    // End of variables declaration//GEN-END:variables
}
