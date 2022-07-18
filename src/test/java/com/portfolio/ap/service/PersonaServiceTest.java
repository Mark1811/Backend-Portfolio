package com.portfolio.ap.service;

import com.portfolio.ap.model.Personas;
import com.portfolio.ap.repository.PersonaRepository;
import com.portfolio.ap.service.Impl.PersonaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;


class PersonaServiceTest {

    @Mock
    private PersonaRepository persoRepo;

    @InjectMocks
    private PersonaService personaService;

    private Personas personas;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        personas = new Personas();
        personas.setId(2L);
        personas.setNombre("Rosana");
        personas.setApellido("Aguero");
        personas.setArea("Licenciada");

    }

    @Test
    void mostrarPer() {

        when(persoRepo.findAll()).thenReturn(Arrays.asList(personas));
        assertNotNull(personaService.MostrarPer());

    }


    @Test
    void testEditarPersona() {

    }
}