package Ventanas;
import Clases.Conexion;
import static Clases.Conexion.establecerConexion;
import Clases.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.boton_ingresar.setEnabled(false);
    }
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_ingresar = new javax.swing.JButton();
        boton_cerrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        titulo_usuario = new javax.swing.JLabel();
        titulo_clave = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_ingresar.setBackground(new java.awt.Color(30, 45, 59));
        boton_ingresar.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        boton_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        boton_ingresar.setText("Ingresar");
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 210, 50));

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
        getContentPane().add(boton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 110, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 200, 210));

        titulo_usuario.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        titulo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        titulo_usuario.setText("Usuario:");
        getContentPane().add(titulo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        titulo_clave.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        titulo_clave.setForeground(new java.awt.Color(255, 255, 255));
        titulo_clave.setText("Clave:");
        getContentPane().add(titulo_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        usuario.setBackground(new java.awt.Color(30, 45, 59));
        usuario.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 296, 270, 60));

        clave.setBackground(new java.awt.Color(30, 45, 59));
        clave.setForeground(new java.awt.Color(255, 255, 255));
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                claveKeyReleased(evt);
            }
        });
        getContentPane().add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 270, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 767, 568));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
            String usuario = this.usuario.getText();
            String clave = String.valueOf(this.clave.getPassword());
            Conexion entrando = new Conexion();
        try {
            entrando.conectar_usuario(("SELECT * FROM usuario WHERE usuario='"+usuario+"'and clave='"+clave+"'"), this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_boton_ingresarActionPerformed

    private void boton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_boton_cerrarActionPerformed

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        if(!this.usuario.getText().equals("") && !String.valueOf(this.clave.getPassword()).equals("")){
            this.boton_ingresar.setEnabled(true);
        }else{
            this.boton_ingresar.setEnabled(false);
        }
    }//GEN-LAST:event_usuarioKeyReleased

    private void claveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyReleased
        if(!this.usuario.getText().equals("") && !String.valueOf(this.clave.getPassword()).equals("")){
            this.boton_ingresar.setEnabled(true);
        }else{
            this.boton_ingresar.setEnabled(false);
        }
    }//GEN-LAST:event_claveKeyReleased

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed
    public void setVacios(String valor){
        this.usuario.setText(valor);
        this.clave.setText(valor);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Inicio ventanaPrincipal =  new Inicio();
               ventanaPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cerrar;
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JPasswordField clave;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo_clave;
    private javax.swing.JLabel titulo_usuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
