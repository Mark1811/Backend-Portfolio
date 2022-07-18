
package com.portfolio.ap.service.Impl;

import com.portfolio.ap.model.Educacion;
import com.portfolio.ap.repository.EducacionRepository;
import java.util.List;

import com.portfolio.ap.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
     
     @Autowired
     EducacionRepository eduRepo;
    
    
    @Override
    public List<Educacion> MostrarEdu() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void eliminarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

  
    
}
