
package com.portfolio.ap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
           @Id 
           @GeneratedValue(strategy = GenerationType.SEQUENCE)
           private Long id;
           private String nombreInstitu;
           private String nombreTitulo;
           private String fecha_inicio;
           private String fecha_fin;
           private String logoInstitu;

    public Educacion(Long id, String nombreInstitu, String nombreTitulo, String fecha_inicio, String fecha_fin, String logoInstitu) {
        this.id = id;
        this.nombreInstitu = nombreInstitu;
        this.nombreTitulo = nombreTitulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.logoInstitu = logoInstitu;
    }

    public Educacion() {
    }
}
