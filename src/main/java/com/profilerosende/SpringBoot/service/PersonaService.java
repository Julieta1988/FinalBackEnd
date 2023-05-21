package com.profilerosende.SpringBoot.service;

import com.profilerosende.SpringBoot.model.Persona;
import com.profilerosende.SpringBoot.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    
    public List<Persona> verPersonas(){
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }
  
    public void crearPersona(Persona perso){
        persoRepo.save (perso);
    }
    
    public void editarPersona(Persona perso){
        persoRepo.save (perso);
    }

    public void eliminarPersona(int id){
        persoRepo.deleteById(id);
    }
    
    public Persona buscarPersona(int id){
       Persona perso = persoRepo.findById(id).orElse(null);
       return perso;
    }
    
}
