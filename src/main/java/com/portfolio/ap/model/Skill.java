
package com.portfolio.ap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String lenguaje;
    private String logo;

    
    public Skill(Long id, String lenguaje, String logo) {
        this.id = id;
        this.lenguaje = lenguaje;
        this.logo = logo;
    }

    public Skill() {
    }
    
    
}
