package com.marari.mararijava.controller;

import com.marari.mararijava.model.Cliente;
import com.marari.mararijava.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("cliente/salvar")
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return clienteService.salvar(cliente);
    }

    @PutMapping("cliente/alterar")
    public void editar(@RequestBody Cliente cliente){
        clienteService.editar(cliente);
    }

    @GetMapping("cliente/todos")
    public List<Cliente> buscarTodos(){return clienteService.buscarTodos();}

    @GetMapping("cliente/parametro")
    public List<Cliente> buscarPorParametro(@Param("parametro") String parametro){return clienteService.buscarPorParametro(parametro);}

    @DeleteMapping("cliente/{id}")
    public void excluir(@PathVariable("id")Integer id){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        clienteService.excluir(cliente);
    }
}
