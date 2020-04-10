package com.example.headfirst.singleton;



/**
 * create by Administrator : zhanghechun on 2020/3/29
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty=true;
        boiled=false;
    }
    public static synchronized ChocolateBoiler getInstance(){
        /*if (uniqueInstance==null){
            uniqueInstance=new ChocolateBoiler();
        }
        return uniqueInstance;*/
        //双重检锁
        if (uniqueInstance==null){
            synchronized(ChocolateBoiler.class){
                if (uniqueInstance==null){
                    uniqueInstance=new ChocolateBoiler();
                }
            }

        }
        return uniqueInstance;
    }
    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled=false;
            //在锅炉内填满巧克力和牛奶
        }
    }
    public void drain(){
        if (!isEmpty()&&isBoiled()){
            //排出牛奶巧克力
            empty=true;
        }
    }
    public void boil(){
        if (!isEmpty()&&!isBoiled()){
            //煮沸
            boiled=true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
