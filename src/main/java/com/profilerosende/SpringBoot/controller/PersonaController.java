package com.profilerosende.SpringBoot.controller;

import com.profilerosende.SpringBoot.model.Persona;
import com.profilerosende.SpringBoot.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")//http://localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200") //con qué se va a cruzar: con nuestro FrontEnd en Angular
public class PersonaController {
    @Autowired
    PersonaService persoServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    
    @PostMapping ("/crear")
    public String agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada exitosamente";
        
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.eliminarPersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
        return "La persona fue editada";
    }
}