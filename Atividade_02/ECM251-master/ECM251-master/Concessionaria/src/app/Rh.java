package app;

/**
 * Rh
 */
public class Rh {

    private double totalComissao;

    public double getTotalComissao(){
        return this.totalComissao;
    }
    public void adcionaComissao(Funcionario f){
        this.totalComissao += f.comissao();
    }
}