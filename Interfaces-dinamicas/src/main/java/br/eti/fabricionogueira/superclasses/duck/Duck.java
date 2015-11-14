package br.eti.fabricionogueira.superclasses.duck;

import br.eti.fabricionogueira.interfaces.fly.FlyBehavior;
import br.eti.fabricionogueira.interfaces.quack.QuackBehavior;

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

    /**
     * Adicionado dois métodos novos à essa classe
     *
     * @param fb
     * @see Podemos chamar esses métodos sempre que quisermos alterar o
     * comportamento de um pato durante o vôo.
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
