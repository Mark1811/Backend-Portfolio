package com.portfolio.ap.controller;

import com.portfolio.ap.model.Personas;
import com.portfolio.ap.service.IPersonasService;
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
public class PersonasControler {
    @Autowired
    private IPersonasService PerServi;
    
    //Crear Personas
     @PostMapping("/crear")
     public void crearCliente (@RequestBody Personas per){
         PerServi.crearPersonas(per);
    }
     
     
    // Mostrar Persona
    @GetMapping("/mostrar")
    @ResponseBody
     public List<Personas> mostrarPer(){
         return PerServi.MostrarPer();
    }
     
     
    //Edita un persona
    @PutMapping("/editar")
    public void editarPersona (@RequestBody Personas per){
        PerServi.editarPersona(per);
    }
    
    //Buscar persona por id
    @GetMapping("/personaId/{id}")
    public Object personaId(@PathVariable Long id){
        return PerServi.mostrarPerId(id);
    }
    
    //Eliminar Persona
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPersona( @PathVariable Long id){
       PerServi.eliminarPersona(id);
    }
    
    
    
}
