package com.marari.mararijava.repository;

import com.marari.mararijava.model.TipoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoProdutoRepository extends JpaRepository<TipoProduto,Integer> {

    public List<TipoProduto> findByDescricao(String descricao);

}
