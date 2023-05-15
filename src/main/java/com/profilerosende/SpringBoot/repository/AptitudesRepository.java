package com.profilerosende.SpringBoot.repository;

import com.profilerosende.SpringBoot.model.Aptitudes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AptitudesRepository  extends JpaRepository <Aptitudes, Integer>{
    
}
