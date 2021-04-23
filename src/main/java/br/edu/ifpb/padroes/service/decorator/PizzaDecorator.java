
package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Float getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}