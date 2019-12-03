package app;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno A1 = new Aluno("Marcao", "493.607.168-47", "17.00815-8");
        A1.getDados();
        Graduado G1 = new Graduado("Rodrigo", "412.521.223-32", "Engenharia Quimica");
        G1.getDados();
        Funcionario F1 = new Funcionario("Molezao", "305.587.965-85");
        F1.getDados();
        Professor P1 = new Professor("Murilo", "456.307.586-89", "Linguagens II");
        P1.getDados();
        Empregado E1 = new Empregado("Carla", "478.569.321-84");
        E1.getDados();
    }

   
}