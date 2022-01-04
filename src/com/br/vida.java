package com.br;

import com.br.model.Gato;

public class vida {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setName("Godzila");
        gato.setCor("Preto");
        gato.setIdade(14);

        System.out.println(gato);

    }
}
