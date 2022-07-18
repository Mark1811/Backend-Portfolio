
package com.portfolio.ap.service.Impl;

import com.portfolio.ap.model.Experiencia;
import com.portfolio.ap.repository.ExperienciaRepository;
import java.util.List;

import com.portfolio.ap.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
       @Autowired
        ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> MostrarExpe() {
       return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void editarExperiencia(Experiencia expe) {
         expeRepo.save(expe);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }
    
}
