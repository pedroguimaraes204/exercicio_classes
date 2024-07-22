package com.pedro.classes;

public class Carteira {

    private static int dinheiro;

    private static int cartoes;

    /*
    metodo privado pois quero que apenas minha futura classe "DonoDaCarteira" desse mesmo pacote
    consiga herdar esse atributo
    */

    private void verDinheiro(int dinheiro) {
    }

    /*
    getter pois quero que minha futura classe "DonoDaCarteira" acesse esse metodo que é
    private.
    */

    public static int getDinheiro() {
        return dinheiro;
    }


    /*
    mesma coisa, quero que apenas a futura classe "DonoDaCarteira" possa ultilizar esse método
     */
    private void verCartoes(int cartoes){

    }

    /*
    getter do metodo verCartoes abaixo
     */

    public static int getCartoes() {
        return cartoes;
    }


    /*
    estou usando getters e setters pois quero restritar esses métodos ao DonoDaCarteira,
    e para manter o encapsulamento e um melhor controle futuramente da aplicação, e saber
    quais classes estão ultilizando esse método, estou deixando esse método private.
     */
}
