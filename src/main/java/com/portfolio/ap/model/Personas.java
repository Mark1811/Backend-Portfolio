
package com.portfolio.ap.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Personas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nombre;
   private String apellido;
   private String area;


    public Personas(){}

    public Personas(Long id, String nombre, String apellido, String area) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }
   
   
   
   
}
