
package com.portfolio.ap.controller;

import com.portfolio.ap.model.Experiencia;
import com.portfolio.ap.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @CrossOrigin(origins= "http://localhost:4200/")

 public class ExperienciaController {
    
     @Autowired
    private IExperienciaService ExpeService; 
    
     //Crear Experiencia
     @PostMapping("/expe/crear")
     public void crearExperiencia (@RequestBody Experiencia expe){
        ExpeService.crearExperiencia(expe);
    }
     
       // Mostrar Experiencia
    @GetMapping("/expe/mostrar")
    @ResponseBody
     public List<Experiencia> mostrarExperiencia(){
         return ExpeService.MostrarExpe();
    }
    
      
    //Edita Experiencia
    @PutMapping("/expe/editar")
    public void editarPersona (@RequestBody Experiencia expe){
        ExpeService.editarExperiencia(expe);
    }
    
     //Eliminar Experiencia
    @DeleteMapping("/expe/eliminar/{id}")
    public void eliminarPersona( @PathVariable Long id){
       ExpeService.eliminarExperiencia(id);
    }
}
