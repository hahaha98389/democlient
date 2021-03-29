package com.example.democlient.testGoF23.factory.simple;

//简单工厂模式   实现了创建者和调用者的分离
public class Consumer {

    public static void main(String[] args) {


        //使用工厂创建车
        Car car1 = CarFactory.getCar("wuling");
        Car car2 = CarFactory.getCar("tesla");

        car1.name();
        car2.name();


    }
}
