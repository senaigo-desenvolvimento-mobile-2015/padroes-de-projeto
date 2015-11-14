package br.eti.fabricionogueira.superclasses;

import br.eti.fabricionogueira.interfaces.FlyBehavior;
import br.eti.fabricionogueira.interfaces.QuackBehavior;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 14, 2015
 */
public abstract class Duck {
    /**
     * Declarar duas variáveis de referência para os tipos de interface de
     * comportamento. Todas as subclasses (no mesmo pacote) as herdam.
     */
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
        // TODO Construtor da classe, implemente o necessário aqui 
    }

    public abstract void display();
    /**
     * Delegar para a classe de comportamento. 
     */
    public void performFly() {
        flyBehavior.fly(); 
    }
    /**
     * Delegar para a classe de comportamento. 
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swin() {
        System.out.println("All ducks float, even decoys!");
    }
}
