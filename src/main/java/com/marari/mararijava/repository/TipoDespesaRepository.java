package com.marari.mararijava.repository;

import com.marari.mararijava.model.TipoDespesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoDespesaRepository extends JpaRepository<TipoDespesa,Integer> {

    public List<TipoDespesa> findByDescricao(String descricao);

    public List<TipoDespesa> findById(Integer id);
}
