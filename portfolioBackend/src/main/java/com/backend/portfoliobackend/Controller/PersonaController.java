package com.backend.portfoliobackend.Controller;

import com.backend.portfoliobackend.Entity.Persona;
import com.backend.portfoliobackend.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/traer/persona")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PostMapping("/crear/persona")
    public String createPersona(@RequestBody Persona persona)  {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/borrar/persona/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/editar/persona/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam ("nombre") Optional<String> nuevoNombre,
                               @RequestParam ("apellido") Optional<String> nuevoApellido,
                               @RequestParam ("profesion") Optional<String> nuevaProfesion,
                               @RequestParam ("banner") Optional<String> nuevoBanner,
                               @RequestParam ("imagen") Optional<String> nuevaImagen) {
        Persona persona = ipersonaService.findPersona(id);

        if(nuevoNombre.isPresent()){
            persona.setNombre(nuevoNombre.get());
        }
        if(nuevoApellido.isPresent()){
            persona.setApellido(nuevoApellido.get());
        }
        if(nuevaProfesion.isPresent()){
            persona.setProfesion(nuevaProfesion.get());
        }
        if(nuevoBanner.isPresent()){
            persona.setBanner(nuevoBanner.get());
        }
        if(nuevaImagen.isPresent()){
            persona.setImagen(nuevaImagen.get());
        }

        ipersonaService.savePersona(persona);
        return persona;
    }
}
