package com.backend.portfoliobackend.Controller;


import com.backend.portfoliobackend.Entity.Project;
import com.backend.portfoliobackend.Interface.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    IProjectService iprojectService;

    @GetMapping("/traer/project")
    public List<Project> getProject() {
        return iprojectService.getProject();
    }

    @PostMapping("/crear/project")
    public String createProject(@RequestBody Project project)  {
        iprojectService.saveProject(project);
        return "{\"message\": \"El campo fue creado correctamente\"}";
    }

    @DeleteMapping("/borrar/project/{id}")
    public String deleteProject(@PathVariable Long id) {
        iprojectService.deleteProject(id);
        return "{\"message\": \"El campo fue eliminado correctamente\"}";
    }

    @PutMapping("/editar/project/{id}")
    public Project editProject(@PathVariable Long id,
                               @RequestParam ("titulo") Optional<String> nuevoTitulo,
                               @RequestParam ("ano") Optional<Year> nuevoAno,
                               @RequestParam ("descripcion") Optional<String> nuevaDescripcion) {

        Project project = iprojectService.findProject(id);


        if (nuevoTitulo.isPresent()){
            project.setTitulo(nuevoTitulo.get());
        }

        if (nuevaDescripcion.isPresent()){
            project.setDescripcion(nuevaDescripcion.get());
        }

        if (nuevoAno.isPresent()){
            project.setAno(nuevoAno.get());
        }

        iprojectService.saveProject(project);
        return project;
    }
}
