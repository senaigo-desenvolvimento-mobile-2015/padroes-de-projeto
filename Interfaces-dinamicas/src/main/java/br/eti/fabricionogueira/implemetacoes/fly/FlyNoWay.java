package br.eti.fabricionogueira.implemetacoes.fly;

import br.eti.fabricionogueira.interfaces.fly.FlyBehavior;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class FlyNoWay implements FlyBehavior {
    /** 
     * A implementação do comportamento * devoarparapatosque NÃO voam 
     * (como * patosdeborracha e patos-isca). 
     */
    @Override
    public void fly() {
        System.out.println("I'm can't fly!!!");
    }
}
