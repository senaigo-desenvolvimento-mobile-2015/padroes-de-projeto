package br.eti.fabricionogueira.implemetacoes;

import br.eti.fabricionogueira.interfaces.QuackBehavior;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public class MuteQuack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println(" <<<Silence>>>");
    }
}
