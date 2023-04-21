
import controladores.ConexionController;
import modelos.Conexion;
import modelos.PersonaModel;
import vistas.*;



public class main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(VistaPrincipal, true);
        frmPersonas vistaPersonas = new frmPersonas(VistaPrincipal, true);
        Conexion nuevaConexion = new Conexion();
        PersonaModel ModeloPersona = new PersonaModel();
        
        ConexionController ControladorConexion = new ConexionController(VistaLogin,
                VistaPrincipal, nuevaConexion, vistaPersonas, ModeloPersona);
    }
    
}
