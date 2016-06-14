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
public class Pedido {

    private long idPedido;

    private Cliente cliente;

    private String condicaoPagamento;

    private List<ItemPedido> itemPedido;

    public Pedido() {
        this.itemPedido = new ArrayList<>();
    }

    public Pedido(long idPedido, Cliente cliente, String condicaoPagamento, List<ItemPedido> itemPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.condicaoPagamento = condicaoPagamento;
        this.itemPedido = itemPedido;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(String condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public List<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(List<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }

    public void setItemPedido(ItemPedido item) {
        this.itemPedido.add(item);
    }

}
