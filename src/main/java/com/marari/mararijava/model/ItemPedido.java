package com.marari.mararijava.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ItemPedido {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Pedido pedido;
    private Double valor;
    private Integer qtd;

    public ItemPedido(Produto produto, Pedido pedido, Double valor, Integer qtd) {
        this.produto = produto;
        this.pedido = pedido;
        this.valor = valor;
        this.qtd = qtd;
    }

    public ItemPedido() {
    }
}
