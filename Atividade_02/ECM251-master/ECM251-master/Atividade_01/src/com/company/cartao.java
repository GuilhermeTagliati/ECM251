package com.company;

public class cartao {
    private double tacaConvDol;
    private static int idCartaoGeral = 0;
    private int idCartao;
    private int numeroConta;
    private int numeroCartao;
    private int ccv;
    private int senha;
    private String label;
    private String emissorCartao;
    private String dataEmissao;
    private String tipo;
    private String validade;

    //Getters Setters
    public double getTacaConvDol() {
        return tacaConvDol;
    }

    public void setTacaConvDol(double tacaConvDol) {
        this.tacaConvDol = tacaConvDol;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEmissorCartao() {
        return emissorCartao;
    }

    public void setEmissorCartao(String emissorCartao) {
        this.emissorCartao = emissorCartao;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    public String getInfoCartao(){
        String s = "Numero da Conta " + getNumeroConta() + "\n Numero Cartao: " + getNumeroCartao() + "\n Numero CCV: " + getCcv()  + "\n Data de Emissao: " + getEmissorCartao() + "\n Instituicao Emissora: " + getEmissorCartao();
        return s;
    }
    // Contrurtor
    public cartao(int numeroCartao, int numeroConta, String tipo, int senha, String dataEmissao, int ccv, String emissorCartao, String label){
        this.idCartao = idCartaoGeral++;
        this.numeroConta = numeroConta;
        this.numeroCartao = numeroCartao;
        this.tipo = tipo;
        this.senha = senha;
        this.dataEmissao = dataEmissao;
        this.ccv = ccv;
        this.emissorCartao = emissorCartao;
        this.label = label;
    }

}
