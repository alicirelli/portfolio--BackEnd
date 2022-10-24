package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Year;

@Getter @Setter
@Entity
public class Project {

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

    @NotNull
    private Year ano;

    public Project() {
    }

    public Project(Persona persona_id, String titulo, String descripcion, Year year) {
        this.persona_id = persona_id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ano = year;
    }
}
