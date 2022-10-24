package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Persona", referencedColumnName = "id")
    private Persona persona_id;

    @NotNull
    private String nombre;

    @NotNull
    private Integer nivel;

    public Skill() {
    }

    public Skill(Persona persona_id, String nombre, Integer nivel) {
        this.persona_id = persona_id;
        this.nombre = nombre;
        this.nivel = nivel;
    }
}
