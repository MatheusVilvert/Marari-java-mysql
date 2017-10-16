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
    @ManyToMany
    @JoinColumn
    private List<Produto> produtoList;

    public Pedido(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Pedido() {
    }
}
