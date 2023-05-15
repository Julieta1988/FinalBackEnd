package com.profilerosende.SpringBoot.controller;

import com.profilerosende.SpringBoot.model.Experiencia;
import com.profilerosende.SpringBoot.service.ExperienciaService;
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
@RequestMapping("experiencia")//http://localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    ExperienciaService expeServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return expeServ.verExperiencias();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return expeServ.buscarExperiencia(id);
    }
    
    
    @PostMapping ("/crear")
    public String agregarExperiencia (@RequestBody Experiencia exp){
        expeServ.crearExperiencia(exp);
        return "La experiencia fue creada exitosamente";
        
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        expeServ.eliminarExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarExperiencia(@RequestBody Experiencia exp){
        expeServ.editarExperiencia(exp);
        return "La experiencia fue editada";
    }
    
}
