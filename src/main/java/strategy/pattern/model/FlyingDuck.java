package strategy.pattern.model;

import strategy.pattern.implementations.NormalQuacking;
import strategy.pattern.implementations.SlowFlying;

public class FlyingDuck extends Duck {

    public FlyingDuck() {
        this.flyingFeature = new SlowFlying();
        this.quackingFeature = new NormalQuacking();
    }

    @Override
    public void display() {
        System.out.println("I look like flying duck");
    }
}
