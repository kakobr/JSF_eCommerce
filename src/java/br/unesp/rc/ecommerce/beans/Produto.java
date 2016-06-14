/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.ecommerce.beans;

/**
 *
 * @author Kaco
 */
public class Produto {

    private long idProduto;

    private String nome;

    private String descricao;

    private String codigo;

    private double avaliacaoMedia;

    private String palavrasChave;

    private Categoria categoria;

    public Produto() {

    }

    public Produto(long idProduto, String nome, String descricao, String codigo, double avaliacaoMedia, String palavrasChave, Categoria categoria) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.avaliacaoMedia = avaliacaoMedia;
        this.palavrasChave = palavrasChave;
        this.categoria = categoria;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(double avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public String getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
