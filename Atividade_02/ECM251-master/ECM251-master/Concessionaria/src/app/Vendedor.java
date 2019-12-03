package app;

public class Vendedor extends Funcionario{

    public Vendedor(String nome){
        super(nome);
    }
    public double comissao(){
        return 0.1*super.salario;
    }
}
