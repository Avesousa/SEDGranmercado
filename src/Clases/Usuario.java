
package Clases;

import Ventanas.Inicio;
import Ventanas.Sistema;
import java.sql.SQLException;

public class Usuario {
    private String usuario;
    private int cargo;
    private String NombreApellido;
    
    public Usuario(String u, String na, int c){
        usuario = u;
        NombreApellido = na;
        cargo = c;
    }
    
    
}
