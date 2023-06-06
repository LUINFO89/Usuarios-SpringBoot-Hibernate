package com.SpringBootJava.dao;

import com.SpringBootJava.models.Usuario;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Entity;

import java.util.List;


@Repository // se usara para poder tener el reporsitorio de la base de datos
@Transactional
public class UsuarioDaoImp implements UsuarioDao{


    @PersistenceContext
    EntityManager entityManager;

    //devuelve el contenido sql de la base de datos
    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }
}
