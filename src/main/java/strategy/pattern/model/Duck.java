package strategy.pattern.model;

import strategy.pattern.interfaces.FlyingFeature;
import strategy.pattern.interfaces.QuackingFeature;

public abstract class Duck {
    protected FlyingFeature flyingFeature;
    protected QuackingFeature quackingFeature;

    public void setFlyingFeature(FlyingFeature flyingFeature) {
        this.flyingFeature = flyingFeature;
    }

    public void setQuackingFeature(QuackingFeature quackingFeature) {
        this.quackingFeature = quackingFeature;
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public void performQuack() {
        quackingFeature.quack();
    }

    public void performFly() {
        flyingFeature.fly();
    }

    public abstract void display();
}
