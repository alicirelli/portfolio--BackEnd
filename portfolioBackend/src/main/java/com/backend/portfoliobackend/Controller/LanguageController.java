package com.backend.portfoliobackend.Controller;


import com.backend.portfoliobackend.Entity.Language;
import com.backend.portfoliobackend.Interface.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LanguageController {

    @Autowired
    ILanguageService ilanguageService;

    @GetMapping("/traer/language")
    public List<Language> getLanguage() {
        return ilanguageService.getLanguage();
    }

    @PostMapping("/crear/language")
    public String createLanguage(@RequestBody Language language)  {
        ilanguageService.saveLanguage(language);
        return "{\"message\": \"El campo fue creado correctamente\"}";
    }

    @DeleteMapping("/borrar/language/{id}")
    public String deleteLanguage(@PathVariable Long id) {
        ilanguageService.deleteLanguage(id);
        return "{\"message\": \"El campo fue eliminado correctamente\"}";
    }

    @PutMapping("/editar/language/{id}")
    public Language editLanguage(@PathVariable Long id,
                                 @RequestParam ("idioma") Optional<String> nuevoIdioma) {

        Language language = ilanguageService.findLanguage(id);


        if (nuevoIdioma.isPresent()){
            language.setIdioma(nuevoIdioma.get());
        }

        ilanguageService.saveLanguage(language);
        return language;
    }
}
