package strategy.pattern.model;

import strategy.pattern.implementations.NoFlying;
import strategy.pattern.implementations.NoQuacking;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyingFeature = new NoFlying();
        quackingFeature = new NoQuacking();
    }

    @Override
    public void display() {
        System.out.println("I look like rubber duck");
    }
}
