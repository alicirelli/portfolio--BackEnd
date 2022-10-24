package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Year;

@Getter @Setter
@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Persona", referencedColumnName = "id")
    private Persona persona_id;

    @NotNull
    private String puesto;

    @NotNull
    private String empresa;

    @NotNull
    private Year fecha_inicio;

    @NotNull
    private Year fecha_fin;

    @NotNull
    private String descripcion;

    public Experience() {
    }

    public Experience(Persona persona_id, String puesto, String empresa, Year fecha_inicio, Year fecha_fin, String descripcion) {
        this.persona_id = persona_id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }
}
