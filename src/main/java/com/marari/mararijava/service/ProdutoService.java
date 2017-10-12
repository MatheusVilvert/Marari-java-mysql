package com.marari.mararijava.service;

import com.marari.mararijava.model.Fornecedor;
import com.marari.mararijava.model.Produto;
import com.marari.mararijava.model.TipoProduto;
import com.marari.mararijava.model.Usuario;
import com.marari.mararijava.repository.FornecedorRepository;
import com.marari.mararijava.repository.ProdutoRepository;
import com.marari.mararijava.repository.TipoProdutoRepository;
import com.marari.mararijava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    FornecedorRepository fornecedorRepository;
    @Autowired
    TipoProdutoRepository tipoProdutoRepository;
    @Autowired
    UsuarioRepository usuarioRepository;

    public Produto salvar(Produto produto){
        //setando fornecedor
        if (produto.getFornecedor().getId() == null){
            fornecedorRepository.save(produto.getFornecedor());
        }
        Fornecedor fornecedor = fornecedorRepository.findOne(produto.getFornecedor().getId());
        produto.setFornecedor(fornecedor);
        //setando tipo do produto
        if (produto.getTipoProduto().getId() == null){
            tipoProdutoRepository.save(produto.getTipoProduto());
        }
        TipoProduto tipoProduto = tipoProdutoRepository.findOne(produto.getTipoProduto().getId());
        produto.setTipoProduto(tipoProduto);

        //setando usuario
        if (produto.getUsuario().getId() == null){
            usuarioRepository.save(produto.getUsuario());
        }
        Usuario usuario = usuarioRepository.findOne(produto.getUsuario().getId());
        produto.setUsuario(usuario);
        return produtoRepository.save(produto);

    }

    public List<Produto> buscarTodos(){return produtoRepository.findAll();}

    public List<Produto> listaDePrecos(String parametro){return produtoRepository.listaDePrecos('%'+parametro+'%');}

    public List<Produto> posicaoEstoque(String parametro){return produtoRepository.posicaoEstoque('%'+parametro+'%');}

    public void excluir(Produto produto){produtoRepository.delete(produto);}

    public void editar(Produto produto){
        Produto produtoExistente = produtoRepository.findOne(produto.getId());
        if (produtoExistente != null){
            produtoRepository.save(produto);
        }
    }
}
