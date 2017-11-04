package com.marari.mararijava.service;

import com.marari.mararijava.model.Endereco;
import com.marari.mararijava.model.Fornecedor;
import com.marari.mararijava.repository.EnderecoRepository;
import com.marari.mararijava.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    EnderecoRepository enderecoRepository;


    public Fornecedor salvar(Fornecedor fornecedor){
        if (fornecedor.getEndereco().getId() == null){
            enderecoRepository.save(fornecedor.getEndereco());
        }else {
            Endereco endereco = enderecoRepository.findOne(fornecedor.getEndereco().getId());
            fornecedor.setEndereco(endereco);
        }
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> buscarTodos(){return fornecedorRepository.findAll();}

    public List<Fornecedor> listaPorParametro(String parametro){return fornecedorRepository.listaPorParametro('%'+parametro+'%');}

    public void excluir(Fornecedor fornecedor){fornecedorRepository.delete(fornecedor);}

    public void editar(Fornecedor fornecedor){
        Fornecedor fornecedorExistente = fornecedorRepository.findOne(fornecedor.getId());
        if (fornecedorExistente != null){
            fornecedorRepository.save(fornecedor);
        }
    }
}
