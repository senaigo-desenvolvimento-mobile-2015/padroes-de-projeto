package br.eti.fabricionogueira.subclasses.duck;

import br.eti.fabricionogueira.implemetacoes.fly.FlyWithWings;
import br.eti.fabricionogueira.implemetacoes.quack.Quack;
import br.eti.fabricionogueira.superclasses.duck.Duck;

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
