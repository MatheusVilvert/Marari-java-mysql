package com.marari.mararijava.controller;

import com.marari.mararijava.model.Endereco;
import com.marari.mararijava.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class EnderecoController {
    @Autowired
    EnderecoService enderecoService;

    @GetMapping("clientes/endereco")
    public List<Endereco> buscarTodos(){return enderecoService.buscarTodos();}

}
