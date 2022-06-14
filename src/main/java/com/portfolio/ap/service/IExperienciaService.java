
package com.portfolio.ap.service;
import com.portfolio.ap.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
     public List<Experiencia> MostrarExpe ();
    
    public void  crearExperiencia(Experiencia expe);
    
    public void editarExperiencia(Experiencia expe);
    
    public void eliminarExperiencia (Long id);
}
