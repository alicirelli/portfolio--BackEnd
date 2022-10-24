package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter @Setter
@Entity
public class About {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

    @ManyToOne
    @JoinColumn(name = "Persona", referencedColumnName = "id")
    private Persona persona_id;

    @NotNull
    private String titulo;

    @NotNull
    private String descripcion;

    public About() {
    }

    public About(Persona persona_id, String titulo, String descripcion) {
        this.persona_id = persona_id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
