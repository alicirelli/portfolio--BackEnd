package com.backend.portfoliobackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String profesion;

    @NotNull
    private String banner;

    @NotNull
    private String imagen;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String banner, String imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.banner = banner;
        this.imagen = imagen;
    }
}
