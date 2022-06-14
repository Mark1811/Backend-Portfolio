
package com.portfolio.ap.controller;

import com.portfolio.ap.model.Sobremi;
import com.portfolio.ap.service.ISobremiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins= "http://localhost:4200/")
public class SobremiController {
    @Autowired
    private ISobremiService SoService;
    
    //Crear texto sobremi Portfolio
    @PostMapping("/sobremi/crear")
    public void CrearText(@RequestBody Sobremi per){
             SoService.crearText(per);
             
    }
    
    //Mostrar texto de sobremi Portfolio
    @GetMapping("/sobremi/mostrar")
    public List <Sobremi> MostrarText(){
        return SoService.MostrarText();
    }
    
     @GetMapping("/sobremi/{id}")
    public Object SobreMiId(@PathVariable Long id){
        return SoService.motrarxId(id);
    }
    
    //Editar texto de sobremi Portfolio
    @PutMapping("/sobremi/editar")
    public void EditarText(@RequestBody Sobremi per){
        SoService.editarText(per);
    }
    
  
    
}
