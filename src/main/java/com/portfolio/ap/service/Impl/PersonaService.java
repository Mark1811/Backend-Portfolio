package com.portfolio.ap.service.Impl;
import com.portfolio.ap.model.Personas;
import com.portfolio.ap.repository.PersonaRepository;
import java.util.List;

import com.portfolio.ap.service.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonasService {

    @Autowired
    PersonaRepository persoRepo;

    @Override
    public List<Personas> MostrarPer() {
        return persoRepo.findAll();
    }

    @Override
    public Object motrarxId(Long id) {
        return persoRepo.findById(id);
    }

    @Override
    public void editarPersona(Personas per) {
        persoRepo.save(per);
    }




   

    
    
}
