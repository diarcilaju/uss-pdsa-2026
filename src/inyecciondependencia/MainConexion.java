package inyecciondependencia;

public class MainConexion {
    public static void main(String [] args){
        Database con01=new MySql();
        Database con02=new PostgreSql();
        con02.conectar("localhost:3036/dbsistema");
    }
}
