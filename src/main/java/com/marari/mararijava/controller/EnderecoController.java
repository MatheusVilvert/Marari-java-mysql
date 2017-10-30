package com.marari.mararijava.controller;

import com.marari.mararijava.model.Endereco;
import com.marari.mararijava.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class EnderecoController {
    @Autowired
    EnderecoService enderecoService;

    @GetMapping("endereco/todos")
    public List<Endereco> buscarTodos(){return enderecoService.buscarTodos();}

    @PostMapping("endereco/salvar")
    public Endereco salvar(@RequestBody Endereco endereco){return enderecoService.salvar(endereco);}

    @DeleteMapping("endereco/{id}")
    public void excluir(@PathVariable("id")Integer id){
        Endereco endereco = new Endereco();
        endereco.setId(id);
        enderecoService.excluir(endereco);
    }

    @PutMapping("endereco/alterar")
    public void alterar(@RequestBody Endereco endereco){
        enderecoService.editar(endereco);
    }

}
