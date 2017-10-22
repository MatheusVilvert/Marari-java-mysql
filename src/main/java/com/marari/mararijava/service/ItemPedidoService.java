package com.marari.mararijava.service;

import com.marari.mararijava.model.ItemPedido;
import com.marari.mararijava.model.Produto;
import com.marari.mararijava.repository.ItemPedidoRepository;
import com.marari.mararijava.repository.PedidoRepository;
import com.marari.mararijava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    ItemPedidoRepository itemPedidoRepository;

    public ItemPedido salvar(ItemPedido itemPedido){
        Produto produto = produtoRepository.findOne(itemPedido.getProduto().getId());
        itemPedido.setProduto(produto);

        return itemPedidoRepository.save(itemPedido);
    }

    public List<ItemPedido> buscarTodos(){
        return itemPedidoRepository.findAll();
    }

    public void excluir(ItemPedido itemPedido){
        itemPedidoRepository.delete(itemPedido);
    }

    public void editar(ItemPedido itemPedido){
        ItemPedido itemPedidoExistente = itemPedidoRepository.findOne(itemPedido.getId());
        if (itemPedidoExistente != null){
            itemPedidoRepository.save(itemPedido);
        }
    }
}
