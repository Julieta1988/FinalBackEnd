package com.profilerosende.SpringBoot.controller;

import com.profilerosende.SpringBoot.model.Formacion;
import com.profilerosende.SpringBoot.service.FormacionService;
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
@RequestMapping("formacion")//https://finalfrontend-c7624.web.app/formacion
@CrossOrigin(origins = "https://finalfrontend-c7624.web.app")
public class FormacionController {
    @Autowired
    FormacionService formaServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Formacion> verFormaciones(){
        return formaServ.verFormaciones();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Formacion verFormacion(@PathVariable int id){
        return formaServ.buscarFormacion(id);
    }
    
    
    @PostMapping ("/crear")
    public String agregarFormacion (@RequestBody Formacion form){
        formaServ.crearFormacion(form);
        return "La formacion fue creada exitosamente";
        
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String eliminarFormacion(@PathVariable int id){
        formaServ.eliminarFormacion(id);
        return "La formacion fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarFormacion(@RequestBody Formacion form){
        formaServ.editarFormacion(form);
        return "La formacion fue editada";
    }
}
