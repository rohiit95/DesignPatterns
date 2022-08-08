package strategy.pattern.implementations;

import strategy.pattern.interfaces.FlyingFeature;

public class NoFlying implements FlyingFeature {
    @Override
    public void fly() {
        System.out.println("I am not flying");
    }
}
