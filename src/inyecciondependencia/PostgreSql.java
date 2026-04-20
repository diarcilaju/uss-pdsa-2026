package inyecciondependencia;

public class PostgreSql extends Database {
    @Override
    public void conectar(String cadena) {
        System.out.println("Conectando a PostGresql");
    }
}
