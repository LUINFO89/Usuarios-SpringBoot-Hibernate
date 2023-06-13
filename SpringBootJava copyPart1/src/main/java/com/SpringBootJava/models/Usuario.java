package com.SpringBootJava.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString @EqualsAndHashCode
@Table(name = "usuarios")

public class Usuario {

    // se eliminan los getter y setter manueales y seagregan usando la anotacion de dependiencia de lombok
    @Id
    @Setter @lombok.Getter @Column(name = "id")//agregamos la anotacion para que hibernate detecte las columnas
    private Long id ;
    @Setter @lombok.Getter @Column(name = "nombre")//agregamos la anotacion para que hibernate detecte las columnas
    private String nombre;
    @Setter @lombok.Getter @Column(name = "apellido")//agregamos la anotacion para que hibernate detecte las columnas
    private String apellido;
    @Setter @lombok.Getter @Column(name = "email")//agregamos la anotacion para que hibernate detecte las columnas
    private String email;
    @Setter @lombok.Getter @Column(name = "telefono")//agregamos la anotacion para que hibernate detecte las columnas
    private String telefono;
    @Setter @lombok.Getter @Column(name = "password")//agregamos la anotacion para que hibernate detecte las columnas
    private String password;
}
