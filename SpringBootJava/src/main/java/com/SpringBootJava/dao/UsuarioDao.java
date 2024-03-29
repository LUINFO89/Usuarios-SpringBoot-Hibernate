package com.SpringBootJava.dao;
import com.SpringBootJava.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);
}
