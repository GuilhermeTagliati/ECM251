package app;

public class MembroComunidade {
    protected String cpf;
    protected String nome;
    public MembroComunidade(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public void getDados(){
        System.out.println("Nome: " + this.nome +" CPF: " + this.cpf) ;
    }
}