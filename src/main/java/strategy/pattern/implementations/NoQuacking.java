package strategy.pattern.implementations;

import strategy.pattern.interfaces.QuackingFeature;

public class NoQuacking implements QuackingFeature {
    @Override
    public void quack() {
        System.out.println("I am mute");
    }
}
