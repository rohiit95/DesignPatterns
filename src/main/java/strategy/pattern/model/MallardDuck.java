package strategy.pattern.model;

import strategy.pattern.implementations.NoFlying;
import strategy.pattern.implementations.SqueakQuacking;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyingFeature = new NoFlying();
        quackingFeature = new SqueakQuacking();
    }

    @Override
    public void display() {
        System.out.println("I look like mallard duck");
    }
}
