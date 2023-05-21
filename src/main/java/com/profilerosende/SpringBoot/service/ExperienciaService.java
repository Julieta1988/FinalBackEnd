package com.profilerosende.SpringBoot.service;

import com.profilerosende.SpringBoot.model.Experiencia;
import com.profilerosende.SpringBoot.repository.ExperienciaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    public List<Experiencia> verExperiencias(){
        List<Experiencia> listaExperiencias = expeRepo.findAll();
        return listaExperiencias;
    }
  
    public void crearExperiencia(Experiencia expe){
        expeRepo.save (expe);
    }
    
    public void editarExperiencia(Experiencia expe){
        expeRepo.save (expe);
    }

    public void eliminarExperiencia(int id){
        expeRepo.deleteById(id);
    }
    
    public Experiencia buscarExperiencia(int id){
       Experiencia expe = expeRepo.findById(id).orElse(null);
       return expe;
    }
    
}

