package com.portfolio.ap.service;
import com.portfolio.ap.model.Personas;
import java.util.List;

public interface IPersonasService {
  
    public List<Personas> MostrarPer ();
    
    public void  crearPersonas(Personas per);
    
    public void editarPersona(Personas per);
    
    public Object mostrarPerId(Long id);
    
    public void eliminarPersona (Long id);
}
