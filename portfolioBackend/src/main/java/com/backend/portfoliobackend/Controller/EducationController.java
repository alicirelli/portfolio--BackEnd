package com.backend.portfoliobackend.Controller;


import com.backend.portfoliobackend.Entity.Education;
import com.backend.portfoliobackend.Interface.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {

    @Autowired
    IEducationService ieducationService;

    @GetMapping("/traer/education")
    public List<Education> getEducation() {
        return ieducationService.getEducation();
    }

    @PostMapping("/crear/education")
    public String createEducation(@RequestBody Education education)  {
        ieducationService.saveEducation(education);
        return "{\"message\": \"El campo fue creado correctamente\"}";
    }

    @DeleteMapping("/borrar/education/{id}")
    public String deleteEducation(@PathVariable Long id) {
        ieducationService.deleteEducation(id);
        return "{\"message\": \"El campo fue eliminado correctamente\"}";
    }

    @PutMapping("/editar/education/{id}")
    public Education editEducation(@PathVariable Long id,
                               @RequestParam ("titulo") Optional<String> nuevoTitulo,
                               @RequestParam ("institucion") Optional<String> nuevaInstitucion,
                               @RequestParam ("fecha_inicio") Optional<Year> nuevaFechaInicio,
                               @RequestParam ("fecha_fin") Optional<Year> nuevaFechaFin,
                               @RequestParam ("certificacion") Optional<Boolean> nuevaIsCertificacion) {

        Education education = ieducationService.findEducation(id);

        if (nuevoTitulo.isPresent()){
            education.setTitulo(nuevoTitulo.get());
        }
        if (nuevaInstitucion.isPresent()){
            education.setInstitucion(nuevaInstitucion.get());
        }
        if (nuevaFechaInicio.isPresent()){
            education.setFecha_inicio(nuevaFechaInicio.get());
        }
        if (nuevaFechaFin.isPresent()){
            education.setFecha_fin(nuevaFechaFin.get());
        }
        if (nuevaIsCertificacion.isPresent()){
            education.setCertificacion(nuevaIsCertificacion.get());
        }

        ieducationService.saveEducation(education);
        return education;
    }
}
