package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter @Setter
@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Persona", referencedColumnName = "id")
    private Persona persona_id;

    @NotNull
    private String idioma;

    public Language() {
    }

    public Language(Persona persona_id, String idioma) {
        this.persona_id = persona_id;
        this.idioma = idioma;
    }
}
