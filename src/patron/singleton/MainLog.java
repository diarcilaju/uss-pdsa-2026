package patron.singleton;

public class MainLog {
    public static void main(String [] args){
        LogManager gestor1=LogManager.getInstancia();
        gestor1.escribirLog("Sesión inciciada por el usuario");

        LogManager gestor2=LogManager.getInstancia();
        gestor2.escribirLog("El usuario elimino un producto");
    }
}
