

package com.profilerosende.SpringBoot.repository;

import com.profilerosende.SpringBoot.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository <Formacion, Integer>{
    
}