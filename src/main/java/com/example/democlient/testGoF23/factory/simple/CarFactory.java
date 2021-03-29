package com.example.democlient.testGoF23.factory.simple;

public class CarFactory {

    public static Car getCar( String carName){
        if("wuling".equals(carName)){

            return new WuLing();
        }
        else if("tesla".equals(carName)){

            return new Tesla();
        }
        else{
            return null;
        }
    }

}
