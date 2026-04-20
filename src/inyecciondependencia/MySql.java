package inyecciondependencia;

public class MySql extends Database{
    @Override
    public void conectar(String cadena) {
        System.out.println("Conectando a MySQL");
    }
}
