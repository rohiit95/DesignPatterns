package strategy.pattern;

import strategy.pattern.implementations.FastFlying;
import strategy.pattern.model.Duck;
import strategy.pattern.model.FlyingDuck;
import strategy.pattern.model.MallardDuck;
import strategy.pattern.model.RubberDuck;

public class SimDuckMain {
    public static void main(String[] args) {
        System.out.println("\nLets test mallard duck:");
        Duck mallardDuck = new MallardDuck();
        testDuckFeatures(mallardDuck);

        System.out.println("\nLets test flying duck:");
        Duck flyingDuck = new FlyingDuck();
        testDuckFeatures(flyingDuck);

        System.out.println("\nLets test rubber duck:");
        Duck rubberDuck = new RubberDuck();
        testDuckFeatures(rubberDuck);

        System.out.println("\nLets give rubber duck flying powers and test:");
        rubberDuck.setFlyingFeature(new FastFlying());
        testDuckFeatures(rubberDuck);

    }

    private static void testDuckFeatures(Duck duck) {
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }


}
