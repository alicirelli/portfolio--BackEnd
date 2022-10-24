package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Year;


@Getter @Setter
@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Persona", referencedColumnName = "id")
    private Persona persona_id;

    @NotNull
    private String titulo;

    @NotNull
    private String institucion;

    @NotNull
    private Year fecha_inicio;

    @NotNull
    private Year fecha_fin;

    @NotNull
    private boolean certificacion;

    public Education() {
    }

    public Education(Persona persona_id, String titulo, String institucion, Year fecha_inicio, Year fecha_fin, boolean certificacion) {
        this.persona_id = persona_id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.certificacion = certificacion;
    }
}
