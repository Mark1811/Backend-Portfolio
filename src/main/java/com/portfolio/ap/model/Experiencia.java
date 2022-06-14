
package com.portfolio.ap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
           @Id 
           @GeneratedValue(strategy = GenerationType.SEQUENCE)
           private Long id;
           private String puesto;
           private String fecha_inicio;
           private String fecha_fin;
           private String descrip_Expe;
           private String logoEmpresa;

    
    
           
    public Experiencia() {}
           
    public Experiencia(Long id, String puesto, String fecha_inicio, String fecha_fin, String descrip_Expe, String logoEmpresa) {
        this.id = id;
        this.puesto = puesto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descrip_Expe = descrip_Expe;
        this.logoEmpresa = logoEmpresa;
    }
 
           
}
