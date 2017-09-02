package com.marari.mararijava.service;

import com.marari.mararijava.model.FormaPagamento;
import com.marari.mararijava.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {

    @Autowired
    FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return formaPagamentoRepository.save(formaPagamento);
    }

    public List<FormaPagamento> buscarTodos(){
        return formaPagamentoRepository.findAll();
    }

    public List<FormaPagamento> buscarDescricao(String descricao){
        return formaPagamentoRepository.findByDescricao(descricao);
    }

    public void excluir(FormaPagamento formaPagamento){
        formaPagamentoRepository.delete(formaPagamento);
    }

    public void editar(FormaPagamento formaPagamento){
        FormaPagamento formaPagamentoExistente = formaPagamentoRepository.findOne(formaPagamento.getId());
        if (formaPagamentoExistente != null){
            formaPagamentoRepository.save(formaPagamento);
        }
    }
}
