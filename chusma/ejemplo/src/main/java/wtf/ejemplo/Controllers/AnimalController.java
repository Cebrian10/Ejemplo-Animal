package wtf.ejemplo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wtf.ejemplo.Models.Animal;
import wtf.ejemplo.Services.AnimalDb;

@RestController
public class AnimalController {

    @GetMapping("animales/all")
    public List<Animal> ObtenerTodosAnimales(){
        return new AnimalDb().ObtenerAnimales();
    }
}
