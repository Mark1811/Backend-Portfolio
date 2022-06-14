
package com.portfolio.ap.service;
import com.portfolio.ap.model.Sobremi;
import java.util.List;


public interface ISobremiService  {
    public List<Sobremi> MostrarText ();
    
    public Object motrarxId(Long id);
    
    public void  crearText(Sobremi per);
    
    public void editarText(Sobremi per);
    
}
