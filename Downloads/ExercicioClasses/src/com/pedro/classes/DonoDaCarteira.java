package com.pedro.classes;

public class DonoDaCarteira {

    private Carteira carteira;

    // chamando o metodo "getDinheiro que retorna o valor da variavel dinheiro"

    private void queroVerMeuDinheiro() {
        int quantidadedeDinheiro = Carteira.getDinheiro();
        System.out.println("A quantidade de dinheiro é" + quantidadedeDinheiro);
    }


    //chamando o metodo "getCartoes" que retorna o numero de cartoes

    private void queroVerMeusCartoes(){
        int numeroDeCartoes = Carteira.getCartoes();
        System.out.println("A quantidade de cartôes é" + numeroDeCartoes);
    }


    /*
    Metodos private pois apenas o DonoDaCarteira pode acessar ela e ter esses metodos
    de olhar quanto dinheiro e cartoes ele tem.
     */
}