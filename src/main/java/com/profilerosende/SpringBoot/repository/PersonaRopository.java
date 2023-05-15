package com.profilerosende.SpringBoot.repository;

import com.profilerosende.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRopository extends JpaRepository <Persona, Integer>{
    
}
