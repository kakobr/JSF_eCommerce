/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.ecommerce.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaco
 */
public class Categoria {

    private long idCategoria;

    private String nome;

    private String descricao;

    private List<Produto> produto;

    public Categoria() {
        this.produto = new ArrayList<>();
    }

    public Categoria(long idCategoria, String nome, String descricao, List<Produto> produto) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.produto = produto;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public void setProduto(Produto produto) {
        this.produto.add(produto);
    }

    @Override
    public String toString() {
        return this.idCategoria + ", " + this.nome + ", " + this.descricao;
    }

}
