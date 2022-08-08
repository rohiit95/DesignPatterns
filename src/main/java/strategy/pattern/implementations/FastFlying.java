package strategy.pattern.implementations;

import strategy.pattern.interfaces.FlyingFeature;

public class FastFlying implements FlyingFeature {
    @Override
    public void fly() {
        System.out.println("I am flying fast");
    }
}
