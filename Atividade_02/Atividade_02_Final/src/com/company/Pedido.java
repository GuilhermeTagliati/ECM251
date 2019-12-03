package com.company;

public class Pedido {
    Cliente cliente;
    ListaProdutos carrinho;

    public Pedido(Cliente cliente, ListaProdutos carrinho){
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public void listarPedido(){

    }
    public String resumoPedido(){
        return carrinho.listarProdutos();
    }
}
