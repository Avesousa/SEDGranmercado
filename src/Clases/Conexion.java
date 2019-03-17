
package Clases;

import Ventanas.Inicio;
import Ventanas.Sistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/granmercado";
    private static final String USERNAME = "avesousa";
    private static final String PASSWORD = "26390042";
    public Connection conectador;
    public ResultSet resultado;
    public String nombreApellido;
    public String usuario;
    public int cargo;
    private PreparedStatement ps;
    public Conexion() {
        System.out.println("comenzo en el constructor");
        this.conectador = establecerConexion();
    }
    
    public static Connection establecerConexion(){
        
       Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de dato ");
            System.out.println(e);
        }
        return conexion;
    }
    public void conectar_usuario(Inicio v) throws SQLException{
        try {
            this.ps = this.conectador.prepareStatement(("SELECT * FROM usuario WHERE usuario='"+v.usuarioR+"'and clave=('"+v.claveR+"')"));
            this.resultado = this.ps.executeQuery();
           if(this.resultado.next()){
               this.nombreApellido = (resultado.getString("nombre") + " " + resultado.getString("apellido"));
               this.cargo = resultado.getInt("id_cargo");
               this.usuario = resultado.getString("usuario");
               new Sistema(this.usuario,this.nombreApellido,this.cargo).setVisible(true);
               v.dispose();
               JOptionPane.showMessageDialog(null, "¡Bienvenid@! " + resultado.getString("nombre") + " " + resultado.getString("apellido"));
           }else{
               JOptionPane.showMessageDialog(null, "El usuario o contraseña ingresado, son INCORRECTOS");
               v.setVacios("");
           }
        } catch (Exception e) {
            System.out.println("Entro acá");
            System.out.println(e);
        }
        
        this.conectador.close();
    }
    public void traer_clientes(DefaultTableModel tabla){
        Object [] fila = null;
        try{
            this.ps = this.conectador.prepareStatement(("SELECT * FROM clientes"));
            this.resultado = this.ps.executeQuery();
            while(this.resultado.next()){
                 fila = new Object[4];
                for(int i = 0; i<4;i++){
                    fila[i] = this.resultado.getObject(i+2);
                }
                tabla.addRow(fila);
            }
            this.conectador.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void editar_clientes(){
       try{
           String sql = "UPDATE `granmercado`.`clientes` SET `documento_cliente` = '', `razonsocial` = '', `telefono_cliente` = '', `direccion_cliente` = '' WHERE (`documento_cliente` = '');";
           this.ps = this.conectador.prepareStatement((sql));
           this.resultado = this.ps.executeQuery();
       }
       catch(Exception e){
           System.out.println(e);
       } 
    }
}
