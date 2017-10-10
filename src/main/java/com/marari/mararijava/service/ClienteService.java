package com.marari.mararijava.service;

import com.marari.mararijava.model.Cliente;
import com.marari.mararijava.model.Endereco;
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

    public Cliente salvar(Cliente cliente){
        if (cliente.getEndereco().getId() == null){
            enderecoRepository.save(cliente.getEndereco());
        }
        Endereco endereco = enderecoRepository.findOne(cliente.getEndereco().getId());
       cliente.setEndereco(endereco);
        return clienteRepository.save(cliente);

    }

    public List<Cliente> buscarTodos(){return clienteRepository.findAll();}

    public List<Cliente> buscarPorParametro(String parametro){return clienteRepository.buscarPorParametro('%'+parametro+'%');}

    public void excluir(Cliente cliente){clienteRepository.delete(cliente);}

    public void editar(Cliente cliente){
        Cliente clienteExistente = clienteRepository.findOne(cliente.getId());
        if (clienteExistente != null){
            clienteRepository.save(cliente);
        }
    }

}
