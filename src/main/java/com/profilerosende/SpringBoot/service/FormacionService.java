package com.profilerosende.SpringBoot.service;

import com.profilerosende.SpringBoot.model.Formacion;
import com.profilerosende.SpringBoot.repository.FormacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FormacionService {
    
    @Autowired
    public FormacionRepository formRepo;
    
    public List<Formacion> verFormaciones(){
        List<Formacion> listaFormaciones = formRepo.findAll();
        return listaFormaciones;
    }
  
    public void crearFormacion(Formacion form){
        formRepo.save (form);
    }
    
    public void editarFormacion(Formacion form){
        formRepo.save (form);
    }

    public void eliminarFormacion(int id){
        formRepo.deleteById(id);
    }
    
    public Formacion buscarFormacion(int id){
       Formacion form = formRepo.findById(id).orElse(null);
       return form;
    }
    
}
