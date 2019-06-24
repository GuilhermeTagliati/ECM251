package com.company;

public class usuario {
    private String nome;
    private String email;
    private String cpf;
    private String nasc;
    private carteira[] carteiras = new carteira[10];

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

//    Set String de Retorno pra Informações
    public String getInfoUser(){
        String s = "Nome: " + getNome() + " CPF: " + getCpf();

        return s;
    }
    //    Construtor
    public usuario(String nome, String cpf ){
        this.nome = nome;
        this.cpf = cpf;
    }
//    Metodo Pagar
    public void executarPagamento(carteira c, int senha, String tipo){
        if(carteiras[c.getIdCarteira()].getIdCarteira() != 0){
            if(carteiras[c.getIdCarteira()].getSenhaCarteira() == senha){
                System.out.println("Transação Aprovada");
            }
            else{
                System.out.println("Senha Inválida!!!");
            }
        }
        else{
            System.out.println("Maluko, vc nem tem carteira");
        }
    }

    public carteira[] getCarteira() {
        return carteiras;
    }

    public void setCarteira(carteira carteira) {
        this.carteiras[carteira.getIdCarteira()] = carteira;
    }

}
