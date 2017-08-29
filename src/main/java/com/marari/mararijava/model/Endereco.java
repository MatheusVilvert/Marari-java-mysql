package com.marari.mararijava.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Endereco {
    @Id
    @GeneratedValue
    private Integer id;
    private String estado;
    private String cidade;
    private String cep;
    private String bairro;
    private String numero;

    public Endereco(String estado, String cidade, String cep, String bairro, String numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco() {
    }
}
