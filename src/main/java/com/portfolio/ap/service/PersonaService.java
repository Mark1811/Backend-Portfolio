package com.portfolio.ap.service;
import com.portfolio.ap.model.Personas;
import com.portfolio.ap.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonasService {

    @Autowired
    PersonaRepository persoRepo;
    
    @Override
    public void editarPersona(Personas per) {
        persoRepo.save(per);
    }

    @Override
    public void crearPersonas(Personas per) {
       persoRepo.save(per);
    }

    @Override
    public List<Personas> MostrarPer() {
       return persoRepo.findAll();
    }

    @Override
    public void eliminarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Object mostrarPerId(Long id) {
       return  persoRepo.findById(id);
    }

   

    
    
}
