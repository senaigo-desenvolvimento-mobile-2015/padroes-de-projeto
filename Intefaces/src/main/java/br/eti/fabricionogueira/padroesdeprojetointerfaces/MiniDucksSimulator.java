package br.eti.fabricionogueira.padroesdeprojetointerfaces;

import br.eti.fabricionogueira.subclasses.MallardDuck;
import br.eti.fabricionogueira.superclasses.Duck;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class MiniDucksSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        /* 
         * Isso chama o método performQuack herdado de 
         * MallardDuck, que depois delega para QuackBehavior 
         * do objeto (por exemplo, chama quack() na referência quackBehavior 
         * herdada de pato); 
         */ 
        mallard.performFly();
        /* 
         * Depois, fazemos a mesma coisa com o método 
         * performFly() 
         * herdado de MallardDuck. 
         */ 
    }

}
