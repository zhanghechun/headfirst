package com.example.headfirst.designpattern;

/**
 * create by Administrator : zhanghechun on 2020/4/10
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        simulator.simulate(countingDuckFactory);
    }

    void simulate(AbstractDuckFactory factory){
        Quackable duckCall = factory.createDuckCall();
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redHeadDuck = factory.createRedHeadDuck();
        Quackable rubberDuck = factory.createRubberDuck();

        System.out.println("---------duck simulate---flack");
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(duckCall);
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();

        Quackable duckCall2 = factory.createDuckCall();
        Quackable mallardDuck2 = factory.createMallardDuck();
        Quackable redHeadDuck2 = factory.createRedHeadDuck();
        Quackable rubberDuck2 = factory.createRubberDuck();

        flockOfMallards.add(duckCall2);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(redHeadDuck2);
        flockOfMallards.add(rubberDuck2);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck simulator : whole flock simulator");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator : mallard flock simulator");
        simulate(flockOfMallards);
        System.out.println("\nthe ducks quacked:"+QuackCounter.getQuacks());
    }

    void simulate() {
        QuackCounter mallardDuck = new QuackCounter(new MallardDuck());
        QuackCounter redheadDuck = new QuackCounter(new RedheadDuck());
        QuackCounter duckCall = new QuackCounter(new DuckCall());
        QuackCounter rubberDuck = new QuackCounter(new RubberDuck());
        QuackCounter gooseAdapter = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("---------duck simulate");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseAdapter);

        System.out.println("the ducks quacked:"+QuackCounter.getQuacks());
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }

}
