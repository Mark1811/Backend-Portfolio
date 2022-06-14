
package com.portfolio.ap.repository;

import com.portfolio.ap.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository <Personas, Long> {
    
}
