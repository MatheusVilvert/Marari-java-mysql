package com.marari.mararijava.repository;

import com.marari.mararijava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    List<Usuario> findByNome(String nome);

    Usuario findByEmail(String email);

    Usuario findBySenha(String senha);

    Usuario findByEmailAndSenha(String email, String senha);
}
