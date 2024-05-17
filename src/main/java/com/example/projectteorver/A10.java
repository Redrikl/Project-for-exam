package com.example.projectteorver;

public class A10 extends Namber{
    A10(int seed){
        super(seed);

    }
    public String get(){
        return ". По каналу связи передается 1000 знаков. Каждый\n" +
                "знак может быть искажен независимо от остальных с ве-\n" +
                "роятностью 0,005. Найти вероятность того, что будет ис-\n" +
                "кажено не более трех знаков.\n";
    };
}
