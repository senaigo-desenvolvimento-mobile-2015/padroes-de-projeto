package br.eti.fabricionogueira.implemetacoes.fly;

import br.eti.fabricionogueira.interfaces.fly.FlyBehavior;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class FlyWithWings implements FlyBehavior {
    /** 
     * Comportamento de voar para patos que Voam... 
     */
    @Override
    public void fly() {
        System.out.println("I'm flying!!!"); 
    }
}
