package com.marari.mararijava.controller;

import com.marari.mararijava.model.Fornecedor;
import com.marari.mararijava.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping("fornecedor/salvar")
    public Fornecedor cadastrar(@RequestBody Fornecedor fornecedor){
        return fornecedorService.salvar(fornecedor);
    }

    @PutMapping("fornecedor/alterar")
    public void editar(@RequestBody Fornecedor fornecedor){
        fornecedorService.editar(fornecedor);
    }

    @GetMapping("fornecedor/todos")
    public List<Fornecedor> buscarTodos(){return fornecedorService.buscarTodos();}

    @DeleteMapping("fornecedor/{id}")
    public void excluir(@PathVariable("id")Integer id){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId(id);
        fornecedorService.excluir(fornecedor);
    }
}
