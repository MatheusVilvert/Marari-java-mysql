package com.marari.mararijava.controller;

import com.marari.mararijava.model.Usuario;
import com.marari.mararijava.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/login")
    public void autenticar (@RequestParam("email")String email,@RequestParam("senha")String senha){
        try {
            Usuario usuario = usuarioService.buscarPorEmailSenha(email,senha);

            if (usuario != null){
                //logou
            }else {
                throw new IllegalArgumentException();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
