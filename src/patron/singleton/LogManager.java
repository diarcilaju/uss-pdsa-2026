package patron.singleton;

public class LogManager {
    private static LogManager instancia;
    private LogManager(){
        System.out.println("Configurando el sistema de Logs por única vez");
    }

    public static LogManager getInstancia(){
        if(instancia==null){
            instancia=new LogManager();
        }
        return instancia;
    }

    public void escribirLog(String mensaje){
        System.out.println("[LOG]: "+mensaje);
    }
}
