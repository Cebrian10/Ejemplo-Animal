package wtf.ejemplo.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import wtf.ejemplo.Models.Animal;

public class AnimalDb {
    Connection _cn;
    public AnimalDb(){
        _cn = new Conexion().openDb();
    }

    public List<Animal> ObtenerAnimales(){
        try{
            Statement stnt = _cn.createStatement();
            String query = "SELECT * FROM Animal";

            List<Animal> animales = new ArrayList<>();
            
            ResultSet result = stnt.executeQuery(query);

            while(result.next()){
                Animal animal = new Animal(
                    result.getString("con_anim"),
                    result.getString("nom_anim")
                );

                animales.add(animal);
            }
            result.close();
            stnt.close();
            return animales;
        }catch (Exception e) {
            int x = 1;
        }

        return null;
    }
}