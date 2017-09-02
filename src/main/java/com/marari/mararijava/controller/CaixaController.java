package com.marari.mararijava.controller;

import com.marari.mararijava.model.Caixa;
import com.marari.mararijava.service.CaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaixaController {

    @Autowired
    private CaixaService caixaService;

    @PostMapping("caixa/salvar")
    public Caixa cadastrar(@RequestBody Caixa caixa){
        return caixaService.salvar(caixa);
    }

    @PutMapping("caixa/alterar")
    public void editar(@RequestBody Caixa caixa){
        caixaService.editar(caixa);
    }

    @GetMapping("caixa/todos")
    public List<Caixa> buscarTodos(){return caixaService.buscarTodos();}

    @DeleteMapping("caixa/{id}")
    public void excluir(@PathVariable("id")Integer id){
        Caixa caixa = new Caixa();
        caixa.setId(id);
        caixaService.excluir(caixa);
    }
}
