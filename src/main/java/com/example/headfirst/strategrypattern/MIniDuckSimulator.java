package com.example.headfirst.strategrypattern;

/**
 * create by Administrator : zhanghechun on 2020/3/22
 */
public class MIniDuckSimulator {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        duck.performFly();
        duck.performQuack();

        /***
         * 模型鸭
         */
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
