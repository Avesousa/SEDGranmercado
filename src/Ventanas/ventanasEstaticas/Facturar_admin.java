
package Ventanas.ventanasEstaticas;
import Ventanas.ventanasEstaticas.Buscador_cliente;
import java.awt.Color;

public class Facturar_admin extends javax.swing.JFrame {

    public Facturar_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar_facturar = new javax.swing.JButton();
        razonsocial_titulo_facturar = new javax.swing.JLabel();
        documento_facturar = new javax.swing.JTextField();
        razonsocial_titulo_facturar1 = new javax.swing.JLabel();
        razonsocial_facturar = new javax.swing.JTextField();
        telefono_facturar = new javax.swing.JTextField();
        telefono_titulo_facturar = new javax.swing.JLabel();
        direccion_facturar = new javax.swing.JTextField();
        direccion_titulo_facturar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturar - El Gran Mercado");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_facturar.setBackground(new java.awt.Color(153, 153, 153));
        buscar_facturar.setForeground(new java.awt.Color(240, 240, 240));
        buscar_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_facturar.setText(" Buscar cliente");
        buscar_facturar.setToolTipText("");
        buscar_facturar.setBorder(null);
        buscar_facturar.setBorderPainted(false);
        buscar_facturar.setPreferredSize(new java.awt.Dimension(210, 50));
        buscar_facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_facturarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_facturarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscar_facturarMousePressed(evt);
            }
        });
        buscar_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_facturarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 220, 40));

        razonsocial_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar.setText("DOCUMENTO");
        jPanel1.add(razonsocial_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        documento_facturar.setEditable(false);
        documento_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        documento_facturar.setFocusCycleRoot(true);
        jPanel1.add(documento_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 180, 40));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("RAZON SOCIAL");
        jPanel1.add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        razonsocial_facturar.setEditable(false);
        razonsocial_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(razonsocial_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 280, 40));

        telefono_facturar.setEditable(false);
        telefono_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(telefono_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 280, 40));

        telefono_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefono_titulo_facturar.setText("TELEFONO");
        jPanel1.add(telefono_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        direccion_facturar.setEditable(false);
        direccion_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(direccion_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 410, 40));

        direccion_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direccion_titulo_facturar.setText("DIRECCIÓN");
        jPanel1.add(direccion_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción del producto", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 860, 380));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 150));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_facturarActionPerformed
        Buscador_cliente buscador = new Buscador_cliente(this);
        buscador.setVisible(true);
    }//GEN-LAST:event_buscar_facturarActionPerformed

    private void buscar_facturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_facturarMouseEntered
        this.buscar_facturar.setBorderPainted(false);
    }//GEN-LAST:event_buscar_facturarMouseEntered

    private void buscar_facturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_facturarMouseClicked
        this.buscar_facturar.setBorderPainted(false);
    }//GEN-LAST:event_buscar_facturarMouseClicked

    private void buscar_facturarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_facturarMousePressed
        this.buscar_facturar.setBorderPainted(false);
        this.buscar_facturar.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_buscar_facturarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_facturar;
    public javax.swing.JTextField direccion_facturar;
    private javax.swing.JLabel direccion_titulo_facturar;
    public javax.swing.JTextField documento_facturar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField razonsocial_facturar;
    private javax.swing.JLabel razonsocial_titulo_facturar;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    public javax.swing.JTextField telefono_facturar;
    private javax.swing.JLabel telefono_titulo_facturar;
    // End of variables declaration//GEN-END:variables
}
