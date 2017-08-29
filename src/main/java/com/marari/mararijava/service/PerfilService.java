package com.marari.mararijava.service;

import com.marari.mararijava.model.Perfil;
import com.marari.mararijava.model.Usuario;
import com.marari.mararijava.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    public List<Perfil> buscarTodos(){return perfilRepository.findAll();}

}
