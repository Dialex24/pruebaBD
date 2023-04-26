
package modelos;

import java.sql.*;
import javax.swing.JOptionPane;

public class PersonaModel {
    String apellidos;
    String nombre;
    int telefono;
    Connection miConexion;

    public PersonaModel(String apellidos, String nombre, int telefono) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public PersonaModel() {
    
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    public void GuardarPersona(String aoellidos, String nombre, int telefono)
    {
        try
        {
          Conexion nuevaConexion = new Conexion();
          this.miConexion = nuevaConexion.Conectar(nombre, nombre);
          Statement sentencia = miConexion.createStatement();
          sentencia.execute("insert into Personas values('"+this.getApellidos()+"', '"+this.getNombre()+"','"+this.getTelefono()+"')");
        }
        catch(SQLException e)
        {
         JOptionPane.showMessageDialog(null, "error al ingresar el registro..."+e.getMessage());   
        }
        
    }        
    
}