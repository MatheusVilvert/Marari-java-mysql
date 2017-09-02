package com.marari.mararijava.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class FormaPagamento {
    @Id
    @GeneratedValue
    private Integer id;
    private String descricao;

    public FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    public FormaPagamento() {
    }
}
