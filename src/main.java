
import controladores.ConexionController;
import modelos.Conexion;
import vistas.*;



public class main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(VistaPrincipal, true);
        Conexion nuevaConexion = new Conexion();
        ConexionController ControladorConexion = new ConexionController(VistaLogin,
                VistaPrincipal, nuevaConexion);
    }
    
}
