package com.SpringBootJava.controllers;

import com.SpringBootJava.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario( @PathVariable Long id){
        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Luis");
        usuario.setApellido("Soto");
        usuario.setEmail("luis@gmail.com");
        usuario.setTelefono("898989");
        return usuario;
    }

    //crear lista de usuarios para verlos por fetch

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){
        List<Usuario> usuarios  = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setId(123L);
        usuario.setNombre("Luis");
        usuario.setApellido("Soto");
        usuario.setEmail("luis@gmail.com");
        usuario.setTelefono("898989");


        Usuario usuario2 = new Usuario();

        usuario2.setId(456L);
        usuario2.setNombre("Victoria");
        usuario2.setApellido("Posada");
        usuario2.setEmail("victoria@gmail.com");
        usuario2.setTelefono("232111");

        Usuario usuario3 = new Usuario();

        usuario3.setId(789L);
        usuario3.setNombre("Juan");
        usuario3.setApellido("Cortes");
        usuario3.setEmail("juan@gmail.com");
        usuario3.setTelefono("222222");


        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);


        return usuarios;
    }

    //editar
    @RequestMapping(value = "usuario12")
    public Usuario editar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Luis");
        usuario.setApellido("Soto");
        usuario.setEmail("luis@gmail.com");
        usuario.setTelefono("898989");
        return usuario;
    }
    //eliminar
    @RequestMapping(value = "usuario34")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Luis");
        usuario.setApellido("Soto");
        usuario.setEmail("luis@gmail.com");
        usuario.setTelefono("898989");
        return usuario;
    }
    // buscar
    @RequestMapping(value = "usuario56")
    public Usuario buscar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Luis");
        usuario.setApellido("Soto");
        usuario.setEmail("luis@gmail.com");
        usuario.setTelefono("898989");
        return usuario;
    }


}
