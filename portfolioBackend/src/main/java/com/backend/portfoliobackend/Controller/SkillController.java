package com.backend.portfoliobackend.Controller;


import com.backend.portfoliobackend.Entity.Skill;
import com.backend.portfoliobackend.Interface.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SkillController {

    @Autowired
    ISkillService iskillService;

    @GetMapping("/traer/skill")
    public List<Skill> getSkill() {
        return iskillService.getSkill();
    }

    @PostMapping("/crear/skill")
    public String createSkill(@RequestBody Skill skill)  {
        iskillService.saveSkill(skill);
        return "{\"message\": \"El campo fue creado correctamente\"}";
    }

    @DeleteMapping("/borrar/skill/{id}")
    public String deleteSkill(@PathVariable Long id) {
        iskillService.deleteSkill(id);
        return "{\"message\": \"El campo fue eliminado correctamente\"}";
    }

    @PutMapping("/editar/skill/{id}")
    public Skill editSkill(@PathVariable Long id,
                               @RequestParam ("nombre") Optional<String> nuevoNombre,
                               @RequestParam ("nivel") Optional<Integer> nuevaNivel) {

        Skill skill = iskillService.findSkill(id);


        if (nuevoNombre.isPresent()){
            skill.setNombre(nuevoNombre.get());
        }

        if (nuevaNivel.isPresent()){
            skill.setNivel(nuevaNivel.get());
        }
        
        iskillService.saveSkill(skill);
        return skill;
    }
}
