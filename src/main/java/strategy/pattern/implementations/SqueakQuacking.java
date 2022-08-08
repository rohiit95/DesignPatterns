package strategy.pattern.implementations;

import strategy.pattern.interfaces.QuackingFeature;

public class SqueakQuacking implements QuackingFeature {
    @Override
    public void quack() {
        System.out.println("I am squeaking");
    }
}
