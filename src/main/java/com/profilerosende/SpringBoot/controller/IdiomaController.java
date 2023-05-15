package com.profilerosende.SpringBoot.controller;

import com.profilerosende.SpringBoot.model.Idioma;
import com.profilerosende.SpringBoot.service.IdiomaService;
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
@RequestMapping("idioma")//https://finalfrontend-c7624.web.app/idioma
@CrossOrigin(origins = "https://finalfrontend-c7624.web.app")
public class IdiomaController {
    @Autowired
    IdiomaService idioServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Idioma> verIdiomas(){
        return idioServ.verIdiomas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Idioma verIdioma(@PathVariable int id){
        return idioServ.buscarIdioma(id);
    }
    
    
    @PostMapping ("/crear")
    public String agregarIdioma (@RequestBody Idioma idi){
        idioServ.crearIdioma(idi);
        return "El idioma fue creado exitosamente";
        
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String eliminarIdioma(@PathVariable int id){
        idioServ.eliminarIdioma(id);
        return "El idioma fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public String editarIdioma(@RequestBody Idioma idi){
        idioServ.editarIdioma(idi);
        return "El idioma fue editado";
    }
    
}
