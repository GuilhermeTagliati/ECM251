package com.company;

public class carteira {
    private static int idCarteiraGeral;
    private int idCarteira = 0;
    private int senhaCarteira;
    private String nomeCarteira;
    private cartao cartaoDebito;
    private cartao cartaoCredito;

//    Getters e Setters
    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public void setNomeCarteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    public cartao getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(cartao cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    public cartao getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(cartao cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    public int getIdCarteira() {
        return idCarteira;
    }
    public int getSenhaCarteira() {
        return senhaCarteira;
    }

    public String getInfoCarteira(){
        String s = "Nome: " + getNomeCarteira() + " ID: " + getIdCarteira() +"\n" + "Cartao de Debito" + getCartaoDebito()+"\n" + "Cartao de Credito" + getCartaoCredito();
        return s;
    }

//    Construtor
    public carteira(String nomeCarteira, int senhaCarteira, cartao cartaoCredito, cartao cartaoDebito ){
        idCarteiraGeral = idCarteira++;
        this.nomeCarteira = nomeCarteira;
        this.senhaCarteira = senhaCarteira;
        this.cartaoCredito = cartaoCredito;
        this.cartaoDebito = cartaoDebito;
    }



}
