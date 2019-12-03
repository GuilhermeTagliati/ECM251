package com.company;

public class PedidoTestDrive {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("11","11","11","11","11",11);
        Carrinho car = new Carrinho(1);
        Produto[] produtos = new Produto[6];

        produtos[0] = new Produto(0,"Metal Gear", Produto.departamento.games, 125.0, 12.0, 3, "Jogo muito bom");
        produtos[1] = new Produto(1,"Cadeira reclinavel", Produto.departamento.moveis, 240, 23.0, 10, "Cadeirinha show de bola");
        produtos[2] = new Produto(2,"Mesa para PC - Tabajara", Produto.departamento.moveis, 890.0, 50.0, 8, "Mesa meia boca, mas pra quem é ta bom");
        produtos[3] = new Produto(3,"Memória Ram - 4GB 1666", Produto.departamento.informatica, 200.0, 0.0, 5, "Memória RAM supimpa.");
        produtos[4] = new Produto(4,"Borderlands 2", Produto.departamento.games, 65.0, 12.0, 3, "Jogo muito bom!");
        produtos[5] = new Produto(5,"Monitor Benq - 24'", Produto.departamento.informatica, 1825.0, 42.0, 12, "Monitor legal.");


        for(Produto p: produtos){
            car.addProduto(p);
        }
        car.listarProdutos();
    }
}
