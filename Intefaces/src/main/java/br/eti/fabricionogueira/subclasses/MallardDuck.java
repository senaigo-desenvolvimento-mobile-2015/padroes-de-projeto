package br.eti.fabricionogueira.subclasses;

import br.eti.fabricionogueira.implemetacoes.FlyWithWings;
import br.eti.fabricionogueira.implemetacoes.Quack;
import br.eti.fabricionogueira.superclasses.Duck;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior   = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
