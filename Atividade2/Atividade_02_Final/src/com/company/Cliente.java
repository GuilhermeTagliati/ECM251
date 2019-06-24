package com.company;
import java.util.List;
import java.util.LinkedList;

public class Cliente {

    private int codCliente;
    private String cpf, nome, endereco, cep, email ; //Informasções que só sao add quando finalizada a compra
    private List<Pedido> historico;

    public Cliente(String cpf,String nome,String endereco,String cep,String email, int codCliente ){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
        this.codCliente = codCliente;
        this.historico = new LinkedList<Pedido>();
    }


}
