package com.company;

import java.util.LinkedList;

public abstract class ListaProdutos implements IListable{
    protected int codCarrinho;
    protected int tamanhoCarrinho;
    protected final int tamanhoMax;
    protected LinkedList<Produto> produtos;

    public ListaProdutos(int tamanhoMax){
        this.codCarrinho = codCarrinho;
        this.produtos = new LinkedList<Produto>();
        this.tamanhoCarrinho  = 0;
        this.tamanhoMax = tamanhoMax;
    }

    public boolean addProduto(Produto produto){
        if(getRestantes() > 0) {
            produtos.add(produto);
            tamanhoCarrinho++;
            return true;
        } else{
            return false;
        }
    }
    public void removeProduto(Produto produto){
        produtos.remove(produto);
        tamanhoCarrinho--;
    }

    public String listarProdutos(){
        String s = "";
        for(Produto p : produtos){
            s += p.exibirResumo() + '\n';
        }
        return s;
    }
    public void limparLista(){
        produtos.clear();
    }
    public boolean removerUltimoDaLista(){
        try {
            produtos.remove(tamanhoCarrinho - 1);
            return true;
        } catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    public int getRestantes() {
        return tamanhoMax - tamanhoCarrinho;
    }
}
