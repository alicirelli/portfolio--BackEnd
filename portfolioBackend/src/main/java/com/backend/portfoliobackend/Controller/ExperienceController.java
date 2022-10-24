package com.backend.portfoliobackend.Controller;


import com.backend.portfoliobackend.Entity.Experience;
import com.backend.portfoliobackend.Interface.IExperienceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@RestController
public class ExperienceController {

    private final static Logger logger = LoggerFactory.getLogger(ExperienceController.class);

    @Autowired
    IExperienceService iexperienceService;

    @GetMapping("/traer/experience")
    public List<Experience> getExperience() {
        return iexperienceService.getExperience();
    }


    @PostMapping("/crear/experience")
    public Experience createExperience(@RequestBody Experience experience)  {
        iexperienceService.saveExperience(experience);
        return experience;
    }

    @DeleteMapping("/borrar/experience/{id}")
    public String deleteExperience(@PathVariable Long id) {
        logger.info("Deleting id: {}", id);
        iexperienceService.deleteExperience(id);

        return "{\"message\": \"El campo fue eliminado correctamente\"}";
    }

    @PutMapping("/editar/experience/{id}")
    public Experience editExperience(@PathVariable Long id,
                                @RequestParam ("puesto") Optional<String> nuevoPuesto,
                                @RequestParam ("empresa") Optional<String> nuevaEmpresa,
                                @RequestParam ("fecha_inicio") Optional<Integer> nuevafechaInicio,
                                @RequestParam ("fecha_fin") Optional<Integer> nuevaFechaFin,
                                @RequestParam ("descripcion") Optional<String> nuevaDescripcion
                                ) {

        Experience experience = iexperienceService.findExperience(id);


        if (nuevoPuesto.isPresent()){
            experience.setPuesto(nuevoPuesto.get());
        }
        if(nuevaEmpresa.isPresent()){
            experience.setEmpresa(nuevaEmpresa.get());
        }

        if (nuevafechaInicio.isPresent()){
            experience.setFecha_inicio(Year.of(nuevafechaInicio.get()));
        }
        if (nuevaFechaFin.isPresent()){
            experience.setFecha_fin(Year.of(nuevaFechaFin.get()));
        }
        if (nuevaDescripcion.isPresent()){
            experience.setDescripcion(nuevaDescripcion.get());
        }

        iexperienceService.saveExperience(experience);
        return experience;
    }
}
