package com.profilerosende.SpringBoot.service;

import com.profilerosende.SpringBoot.model.Aptitudes;
import com.profilerosende.SpringBoot.repository.AptitudesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AptitudesService {
    
    @Autowired
    public AptitudesRepository aptiRepo;
    
    public List<Aptitudes> verAptitudes(){
        List<Aptitudes> listaAptitudes = aptiRepo.findAll();
        return listaAptitudes;
    }
  
    public void crearAptitudes(Aptitudes apti){
        aptiRepo.save (apti);
    }
    
    public void editarAptitudes(Aptitudes apti){
        aptiRepo.save (apti);
    }

    public void eliminarAptitudes(int id){
        aptiRepo.deleteById(id);
    }
    
    public Aptitudes buscarAptitudes(int id){
       Aptitudes apti = aptiRepo.findById(id).orElse(null);
       return apti;
    }
    
}
