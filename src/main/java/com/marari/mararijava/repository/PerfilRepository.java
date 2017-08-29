package com.marari.mararijava.repository;

import com.marari.mararijava.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil,Integer> {

    Perfil findByDescricao(String descricao);

}
