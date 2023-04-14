/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.*;
import vistas.*;

/**
 *
 * @author umg
 */
public class ConexionController implements ActionListener {
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    Conexion ModeloConexion;

    public ConexionController(frmLogin VistaLogin, frmPrincipal VistaPrincipal, Conexion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        
        //levantar formulario
        this.VistaPrincipal.setVisible(true);
        
        //poner a la escucha el boton principal
        
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        //levantar login
        this.VistaLogin.setResizable(true);
        this.VistaLogin.setVisible(true);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.VistaLogin.btnAceptar)
        {
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(), this.VistaLogin.txtPass.getText());
        }
    }
}
