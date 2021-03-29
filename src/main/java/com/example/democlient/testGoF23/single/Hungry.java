package com.example.democlient.testGoF23.single;

//饿汉式单例
public class Hungry {

    private Hungry(){

    }


    private static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }




}
