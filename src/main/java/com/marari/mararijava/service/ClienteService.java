package com.marari.mararijava.service;

import com.marari.mararijava.model.Cliente;
import com.marari.mararijava.repository.ClienteRepository;
import com.marari.mararijava.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Cliente salvar(Cliente cliente){return clienteRepository.save(cliente);}

    public List<Cliente> buscarTodos(){return clienteRepository.findAll();}

    public void excluir(Cliente cliente){clienteRepository.delete(cliente);}

    public void editar(Cliente cliente){
        Cliente clienteExistente = clienteRepository.findOne(cliente.getId());
        if (clienteExistente != null){
            clienteRepository.save(cliente);
        }
    }

}