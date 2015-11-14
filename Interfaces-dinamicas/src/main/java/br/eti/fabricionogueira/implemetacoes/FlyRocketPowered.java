package br.eti.fabricionogueira.implemetacoes;

import br.eti.fabricionogueira.interfaces.FlyBehavior;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class FlyRocketPowered implements FlyBehavior {
    /**
     * Ok, estamos criando um comportamento de vôo impulsionado por um foguete.
     */
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
