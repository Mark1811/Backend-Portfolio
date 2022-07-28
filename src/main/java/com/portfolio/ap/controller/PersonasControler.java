package com.portfolio.ap.controller;

import com.portfolio.ap.model.Personas;
import com.portfolio.ap.service.IPersonasService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfoliofront-423bb.web.app/")
public class PersonasControler {
    @Autowired
    private IPersonasService PerServi;


    // Mostrar Persona

    @GetMapping("/mostrar")
    @ResponseBody
    public List<Personas> mostrarPer() {

        return PerServi.MostrarPer();
    }

    //Edita un persona
    @PutMapping("/editar")
    public void editarPersona(@RequestBody Personas per) {

        PerServi.editarPersona(per);
    }

    @GetMapping("/personaId/{id}")
    public Object buscarPorId(@PathVariable Long id){
        return PerServi.motrarxId(id);
    }


}
