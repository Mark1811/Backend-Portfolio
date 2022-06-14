
package com.portfolio.ap.service;

import com.portfolio.ap.model.Sobremi;
import com.portfolio.ap.repository.SobremiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobremiService implements ISobremiService  {
     @Autowired 
     SobremiRepository soRepo;

    @Override
    public List<Sobremi> MostrarText() {
        return soRepo.findAll();
    }

    @Override
    public void crearText(Sobremi per) {
         soRepo.save(per);
    }

    @Override
    public void editarText(Sobremi per) {
        soRepo.save(per);
    }


    @Override
    public Object motrarxId(Long id) {
        return soRepo.findById(id);
    }

    

   

     
}
