
package Clases;

import Ventanas.Inicio;
import Ventanas.Sistema;
import Ventanas.Sistema_facturador;
import Ventanas.Sistema_usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/granmercado";
    private static final String USERNAME = "avesousa";
    private static final String PASSWORD = "26390042";
    public Connection conectador;
    public ResultSet resultado;
    public String nombreApellido;
    public String usuario;
    public int cargo;
    public Conexion() {
        System.out.println("comenzo en el constructor");
        this.conectador = establecerConexion();
    }
    
    public void conectar_usuario(String valor, Inicio v) throws SQLException{
        try {
            PreparedStatement ps = this.conectador.prepareStatement(valor);
            this.resultado = ps.executeQuery();
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
    
    public static Connection establecerConexion(){
        
       Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de dato " + e);
        }
        return conexion;
    }
}
