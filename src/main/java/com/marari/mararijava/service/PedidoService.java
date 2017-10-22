package com.marari.mararijava.service;

import com.marari.mararijava.model.Pedido;
import com.marari.mararijava.model.Produto;
import com.marari.mararijava.repository.PedidoRepository;
import com.marari.mararijava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido salvar(Pedido pedido){

        /*int qtdProduto = pedido.getProdutoList().size();
        for (int i =0 ; i<qtdProduto; i++){

        }*/

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> buscarTodos(){return pedidoRepository.findAll();}

    public void excluir(Pedido pedido){pedidoRepository.delete(pedido);}

    public void editar(Pedido pedido){
        Pedido pedidoExistente = pedidoRepository.findOne(pedido.getId());
        if (pedidoExistente != null ){
            pedidoRepository.save(pedido);
        }
    }
}
