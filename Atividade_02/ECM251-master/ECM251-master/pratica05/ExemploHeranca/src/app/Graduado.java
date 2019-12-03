package app;

public class Graduado extends MembroComunidade{
    private String curso;
    public Graduado(String nome,String cpf, String curso){
        super(nome, cpf);
        this.curso = curso;
    } 
    @Override
    public void getDados(){
        System.out.println("Nome: " + super.nome +" CPF: " + super.cpf + " Curso: " + this.curso ) ;
    }
}