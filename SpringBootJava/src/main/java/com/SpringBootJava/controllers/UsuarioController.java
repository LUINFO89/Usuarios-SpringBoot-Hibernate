package com.SpringBootJava.controllers;

import com.SpringBootJava.dao.UsuarioDao;
import com.SpringBootJava.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}" , method = RequestMethod.GET)
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

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuario(){

        return usuarioDao.getUsuarios();

    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){


        usuarioDao.registrar(usuario);

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
    @RequestMapping(value = "api/usuarios/{id}" , method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
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
