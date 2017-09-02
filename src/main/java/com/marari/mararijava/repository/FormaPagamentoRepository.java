package com.marari.mararijava.repository;

import com.marari.mararijava.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento,Integer> {

    public List<FormaPagamento> findByDescricao(String descricao);

    public List<FormaPagamento> findById(Integer id);
}
