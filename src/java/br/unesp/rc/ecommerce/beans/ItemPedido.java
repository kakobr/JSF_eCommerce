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
public class ItemPedido {
    
    private long idItemPedido;
    
    private Pedido idPedido;
    
    private Produto produto;
    
    private double precoUnitario;
    
    private int quantidade;

    public ItemPedido() {
    }

    public ItemPedido(long idItemPedido, Pedido idPedido, Produto produto, double precoUnitario, int quantidade) {
        this.idItemPedido = idItemPedido;
        this.idPedido = idPedido;
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public long getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(long idItemPedido) {
        this.idItemPedido = idItemPedido;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
