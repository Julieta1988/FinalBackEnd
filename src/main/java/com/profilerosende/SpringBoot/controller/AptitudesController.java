package com.profilerosende.SpringBoot.controller;

import com.profilerosende.SpringBoot.model.Aptitudes;
import com.profilerosende.SpringBoot.service.AptitudesService;
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
@RequestMapping("aptitudes")//http://localhost:8080/aptitudes
@CrossOrigin(origins = "http://localhost:4200")
public class AptitudesController {
    @Autowired
    AptitudesService aptiServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Aptitudes> verAptitudes(){
        return aptiServ.verAptitudes();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Aptitudes verAptitudes(@PathVariable int id){
        return aptiServ.buscarAptitudes(id);
    }
    
    
    @PostMapping ("/crear")
    public String agregarAptitudes (@RequestBody Aptitudes apt){
        aptiServ.crearAptitudes(apt);
        return "La aptitud fue creada exitosamente";
        
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String eliminarAptitudes(@PathVariable int id){
        aptiServ.eliminarAptitudes(id);
        return "La aptitud fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarAptitudes(@RequestBody Aptitudes apt){
        aptiServ.editarAptitudes(apt);
        return "La aptitud fue editada";
    }   
}
