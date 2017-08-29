package com.marari.mararijava.controller;

import com.marari.mararijava.model.Perfil;
import com.marari.mararijava.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PerfilController {

    @Autowired
    PerfilService perfilService;

    @GetMapping("/usuarios/perfil")
    public List<Perfil> buscarTodos(){return perfilService.buscarTodos();}
}
