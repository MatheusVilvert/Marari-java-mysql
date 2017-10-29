package com.marari.mararijava.controller;

import com.marari.mararijava.model.Pedido;
import com.marari.mararijava.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("pedido/salvar")
    public Pedido cadastrar(@RequestBody Pedido pedido){return pedidoService.salvar(pedido);}

}
