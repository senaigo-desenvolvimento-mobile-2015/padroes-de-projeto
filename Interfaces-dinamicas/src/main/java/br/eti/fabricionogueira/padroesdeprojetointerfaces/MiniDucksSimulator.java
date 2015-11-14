package br.eti.fabricionogueira.padroesdeprojetointerfaces;

import br.eti.fabricionogueira.implemetacoes.fly.FlyRocketPowered;
import br.eti.fabricionogueira.model.duck.ModelDuck;
import br.eti.fabricionogueira.superclasses.duck.Duck;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class MiniDucksSimulator {

    public static void main(String[] args) {
        System.out.println("--------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
