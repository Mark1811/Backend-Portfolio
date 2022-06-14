
package com.portfolio.ap.controller;

import com.portfolio.ap.model.Skill;
import com.portfolio.ap.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins= "http://localhost:4200/")

public class SkillController {
    @Autowired
    private ISkillService skillService;
    
    //Mostrar Skill
    @GetMapping("/skill/mostrar")
    @ResponseBody
      public List<Skill> mostrarSkill(){
         return skillService.MostrarSkill();
    } 
    
    //Editar Skill
      @PutMapping("/skill/editar")
    public void editarSkill (@RequestBody Skill s){
        skillService.editarSkill(s);
    }
    
    //Eliminar Skill
    @DeleteMapping("/skill/eliminar/{id}")
    public void eliminarSkill( @PathVariable Long id){
       skillService.eliminarSkill(id);
    }
}
