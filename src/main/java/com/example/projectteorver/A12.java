package com.example.projectteorver;

public class A12 extends Namber{
    A12(int seed) {
        super(seed);
        vero=(double) rand(2,5)/100;
    }
    public String get(){
        return ". Вероятность содержания никеля в каждой пробе " +
                "руды равна "+vero+". Исследованию подлежат пять проб. Со" +
                "ставить ряд распределения числа проб с промышленным\n" +
                "содержанием никеля. Найти M(X) и D(X) этой случай" +
                "ной величины.\n";
    };
    public String aswer(){
        return ". "+"M(X)="+ 5*vsego+",  D(X)="+5*vsego*(1-vsego);
    }
}
