
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.*;
import vistas.*;


public class ConexionController implements ActionListener {
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersona;
    Conexion ModeloConexion;
    PersonaModel ModeloPersona;
   

    public ConexionController(frmLogin VistaLogin, frmPrincipal VistaPrincipal, Conexion ModeloConexion, frmPersonas VistaPersonas, PersonaModel ModeloPer) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaLogin = VistaLogin;
        this.ModeloConexion = ModeloConexion;
        this.VistaPersona = VistaPersonas;
        this.ModeloPersona = ModeloPer;
        
        //levantar formulario
        this.VistaPrincipal.setVisible(true);
       
        
        //poner a la escucha el boton principal
        
        this.VistaLogin.btnAceptar.addActionListener(this);
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        
        
        
        
        //levantar login
        this.VistaLogin.setResizable(true);
        this.VistaLogin.setVisible(true);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.VistaPrincipal.btnIngresar){
            this.VistaLogin.setLocationRelativeTo(null);
            this.VistaLogin.setVisible(true);
        }
        if(arg0.getSource()==this.VistaLogin.btnAceptar)
        {
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(), 
                    this.VistaLogin.txtPass.getText());
            
        if   (ModeloConexion !=null)
        {
            this.VistaLogin.dispose();
            this.VistaPersona.btnGuardar.addActionListener(this);
            this.VistaPersona.setLocationRelativeTo(null);
            this.VistaPersona.setVisible(true);
        }
        if(arg0.getSource()==this.VistaPersona.btnGuardar)
        {
          //mandar a guardar el registro
            this.ModeloPersona.GuardarPersona(this.VistaPersona.txtApellido.getText(), 
                    this.VistaPersona.txtNombre.getText(),
                    Integer.parseInt(this.VistaPersona.txtTelefono.getText()));
        }
        }
    }
}
