package com.marari.mararijava.controller;

import com.marari.mararijava.model.Produto;
import com.marari.mararijava.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("produto/salvar")
    public Produto cadastrar(@RequestBody Produto produto){
        return produtoService.salvar(produto);
    }

    @PutMapping("produto/alterar")
    public void editar(@RequestBody Produto produto){
        produtoService.editar(produto);
    }

    @GetMapping("produto/todos")
    public List<Produto> buscarTodos(){return produtoService.buscarTodos();}

    @DeleteMapping("produto/{id}")
    public void excluir(@PathVariable("id")Integer id){
        Produto produto = new Produto();
        produto.setId(id);
        produtoService.excluir(produto);
    }
}
