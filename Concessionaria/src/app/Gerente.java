package app;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, int senha) {
        super(nome);
        this.setSenha(senha);
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double comissao() {
        return 0.6*super.salario;
    }
}
