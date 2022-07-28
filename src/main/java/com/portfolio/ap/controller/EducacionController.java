
package com.portfolio.ap.controller;

import com.portfolio.ap.model.Educacion;
import com.portfolio.ap.service.IEducacionService;

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
@CrossOrigin(origins ="https://portfoliofront-423bb.web.app/")

public class EducacionController {
    @Autowired
    private IEducacionService eduService;

    //Crear Educacion
    @PostMapping("/edu/crear")
    public void crearExperiencia(@RequestBody Educacion edu) {
        eduService.crearEducacion(edu);
    }

    // Mostrar Educacion
    @GetMapping("/edu/mostrar")
    @ResponseBody
    public List<Educacion> mostrarEducacion() {
        return eduService.MostrarEdu();
    }

    //Edita Educacion
    @PutMapping("/edu/editar")
    public void editarEducacion(@RequestBody Educacion edu) {
        eduService.editarEducacion(edu);
    }

    //Eliminar Educacion
    @DeleteMapping("/edu/eliminar/{id}")
    public void eliminarEducacion(@PathVariable Long id) {
        eduService.eliminarEducacion(id);
    }
}

