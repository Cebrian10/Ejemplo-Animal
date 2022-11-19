package wtf.ejemplo.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDb(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost1433;"
            + "databaseName=VeterinariaNelo;"
            + "user=Cebrian10;"
            + "password=Lizmariham507;"
            + "trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        }catch (SQLException E) {
            System.out.println("ERROR DE CONEXION xd");
            int x = 1;
        }
        catch(ClassNotFoundException cnfex){
            int x = 1;
        }
        return null;
    }
}
