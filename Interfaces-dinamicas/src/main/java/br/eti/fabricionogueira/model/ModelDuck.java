package br.eti.fabricionogueira.model;

import br.eti.fabricionogueira.implemetacoes.FlyNoWay;
import br.eti.fabricionogueira.implemetacoes.Quack;
import br.eti.fabricionogueira.superclasses.Duck;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        /*
         * Nosso modelo de pato começa a vida no chão... 
         */
        flyBehavior = new FlyNoWay();
        /*
         * sem uma maneira de voar 
         */ 
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
