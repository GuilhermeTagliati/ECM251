package app;

public class Engenheiro extends Funcionario{

    public Engenheiro(String nome){
        super(nome);
    }
    public double comissao(){
        return 0.7*super.salario;
    }
}
