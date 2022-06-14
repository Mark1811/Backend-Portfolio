
package com.portfolio.ap.service;

import com.portfolio.ap.model.Educacion;
import java.util.List;


public interface IEducacionService {
     public List<Educacion> MostrarEdu ();
    
    public void  crearEducacion(Educacion edu);
    
    public void editarEducacion(Educacion edu);
    
    
    public void eliminarEducacion (Long id);
}
