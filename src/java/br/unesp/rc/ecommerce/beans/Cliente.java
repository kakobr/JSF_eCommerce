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
public class Cliente {

    private long idCliente;

    private String nome;

    private String email;

    public Cliente() {

    }

    public Cliente(long idCliente, String nome, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
