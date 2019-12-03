package com.company;

public interface IListable {

    public boolean addProduto(Produto produto);
    public void removeProduto(Produto produto);
    public String listarProdutos();
}
