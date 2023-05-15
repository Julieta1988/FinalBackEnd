package com.profilerosende.SpringBoot.repository;

import com.profilerosende.SpringBoot.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository <Idioma, Integer>{
    
}
