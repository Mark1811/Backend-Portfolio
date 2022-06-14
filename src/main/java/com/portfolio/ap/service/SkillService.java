
package com.portfolio.ap.service;

import com.portfolio.ap.model.Skill;
import com.portfolio.ap.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {

    @Autowired 
    SkillRepository skillrepo;
    
    @Override
    public List<Skill> MostrarSkill() {
       return skillrepo.findAll();
    }

    @Override
    public void editarSkill(Skill s) {
        skillrepo.save(s);
    }

    @Override
    public void eliminarSkill(Long id) {
        skillrepo.deleteById(id);
    }
    
}
