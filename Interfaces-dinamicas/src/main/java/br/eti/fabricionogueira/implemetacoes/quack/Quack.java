package br.eti.fabricionogueira.implemetacoes.quack;

import br.eti.fabricionogueira.interfaces.quack.QuackBehavior;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
