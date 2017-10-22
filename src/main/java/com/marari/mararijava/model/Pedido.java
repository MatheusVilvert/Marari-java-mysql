package com.marari.mararijava.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany
    private List<ItemPedido> itemPedidoList;

    public Pedido(List<ItemPedido> itemPedidoList) {
        this.itemPedidoList = itemPedidoList;
    }

    public Pedido() {
    }
}
