
package com.portfolio.ap.service;
import com.portfolio.ap.model.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> MostrarSkill();
    
    public void editarSkill(Skill s);
    
    public void eliminarSkill(Long id);
}
