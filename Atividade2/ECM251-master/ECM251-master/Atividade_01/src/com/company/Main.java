//Guilherme Tagliati da Silva       17.00375-0
//Breno Thomaz Savanini             17.00815-8

package com.company;

public class Main {

    public static void main(String[] args) {

        cartao Car1 = new cartao(123, 1254, "Credito", 1254, "08/04/2019", 123, "Satander", "VISA");
        cartao Car2 = new cartao(124, 1254, "Debito", 1254, "08/04/2019", 148, "ITAU", "MASTERCARD");
        cartao Car3 = new cartao(125, 1254, "Credito", 1254, "08/04/2019", 145, "ITAU", "MASTERCARD");

        carteira C1 = new carteira("Carteira de Pagamento", 12345, Car3, Car2);
        carteira C2 = new carteira("Carteira Top", 12345, null, Car1);

        usuario U1 = new usuario("Breno", "502.547.596-41");
        usuario U2 = new usuario("Guilherme", "402.493.478-30");

        U1.setCarteira(C2);
        U2.setCarteira(C1);

        U1.executarPagamento(C2, 12345, "Credito");
        U2.executarPagamento(C1, 12345, "Debito");

        System.out.println(U2.getInfoUser());
        System.out.println(U1.getInfoUser());


    }
}
