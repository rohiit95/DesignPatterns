package strategy.pattern.implementations;

import strategy.pattern.interfaces.QuackingFeature;

public class NormalQuacking implements QuackingFeature {
    @Override
    public void quack() {
        System.out.println("I am quacking normally");
    }
}
