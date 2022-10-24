package com.backend.portfoliobackend.Controller;


import com.backend.portfoliobackend.Entity.About;
import com.backend.portfoliobackend.Interface.IAboutService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AboutController {

    @Autowired
    IAboutService iaboutService;

    @GetMapping("/traer/about")
    public List<About> getAbout() {
        return iaboutService.getAbout();
    }

    @PostMapping("/crear/about")
    public String createAbout(@RequestBody About about)  {
        iaboutService.saveAbout(about);
        return "El campo fue creado correctamente";
    }

    @DeleteMapping("/borrar/about/{id}")
    public String deleteAbout(@PathVariable Long id) {
        iaboutService.deleteAbout(id);
        return "El campo fue eliminado correctamente";
    }

    @PutMapping("/editar/about/{id}")
    public About editAbout(@PathVariable Long id,
                               @RequestParam ("titulo") Optional<String> nuevoTitulo,
                               @RequestParam ("descripcion") Optional<String> nuevaDescripcion) {

        About about = iaboutService.findAbout(id);


        if (nuevoTitulo.isPresent()){
            about.setTitulo(nuevoTitulo.get());
        }

        if (nuevaDescripcion.isPresent()){
            about.setDescripcion(nuevaDescripcion.get());
        }


        iaboutService.saveAbout(about);
        return about;
    }
}
