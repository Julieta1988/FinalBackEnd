package com.profilerosende.SpringBoot.service;

import com.profilerosende.SpringBoot.model.Idioma;
import com.profilerosende.SpringBoot.repository.IdiomaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IdiomaService {
    @Autowired
    public IdiomaRepository idiRepo;
    
    public List<Idioma> verIdiomas(){
        List<Idioma> listaIdiomas = idiRepo.findAll();
        return listaIdiomas;
    }
  
    public void crearIdioma(Idioma idi){
        idiRepo.save (idi);
    }
    
    public void editarIdioma(Idioma idi){
        idiRepo.save (idi);
    }

    public void eliminarIdioma(int id){
        idiRepo.deleteById(id);
    }
    
    public Idioma buscarIdioma(int id){
       Idioma idi = idiRepo.findById(id).orElse(null);
       return idi;
    }
}
