package com.portfolio.ap.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Sobremi{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idsobremi;
    private String descripcion;
    private String foto;
    
    public Sobremi(){};

    public Sobremi(Long idsobremi, String descripcion, String foto) {
        this.idsobremi = idsobremi;
        this.descripcion = descripcion;
        this.foto = foto;
    }
    
    
}
