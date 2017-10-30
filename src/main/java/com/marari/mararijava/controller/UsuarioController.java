package com.marari.mararijava.controller;

import com.marari.mararijava.model.Usuario;
import com.marari.mararijava.repository.UsuarioRepository;
import com.marari.mararijava.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UsuarioController
{
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario/salvar")
    public Usuario cadastrar(@RequestBody Usuario usuario){

        return usuarioService.salvar(usuario);

    }

    @PutMapping("/usuario/alterar")
    public Usuario alterar(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    @GetMapping("/usuario/todos")
    public List<Usuario> buscarTodos(){return usuarioService.buscarTodos();}

    @GetMapping("/usuario/nome")
    public List<Usuario> buscarPorNome(@RequestParam("nome")String nome){return usuarioService.buscarPorNome(nome);}

    @DeleteMapping("/usuario/{id}")
    public void excluir(@PathVariable("id")Integer id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuarioService.excluir(usuario);
    }
}
