package app;

public class FuncionarioTestDrive {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("Gervasio", 123456);
	    g1.setSalario(10000.0);
	    Funcionario d1 = new Diretor("Rodrigo");
	    d1.setSalario(20000.);
	    Funcionario v1 = new Vendedor("Joao");
	    v1.setSalario(2000.);
	    Funcionario e1 = new Engenheiro("Maria");
	    e1.setSalario(5000.);
        System.out.println("Gerente:" + g1.comissao());
        System.out.println("Diretor:" + d1.comissao());
        System.out.println("Vendedor:" + v1.comissao());
        System.out.println("Engenheiro:" + e1.comissao());
        Rh rh = new Rh();
        rh.adcionaComissao(g1);
        rh.adcionaComissao(e1);
        rh.adcionaComissao(d1);
        rh.adcionaComissao(v1);
        System.out.println("Total:" + rh.getTotalComissao());
    }
}
