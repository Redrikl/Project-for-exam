package com.example.projectteorver;

public class A13 extends Namber{
    A13(int seed) {
        super(seed);
        vero=(double) rand(5,8)/10;
        vsego = rand(4,6)*100;
    }
    public String get(){
        return ". Среди семян ржи содержится "+vero+"% семян сорняков.\n" +
                "Случайным образом взято "+vsego+" семян. Составить ряд рас-\n" +
                "пределения числа семян сорняков. Найти M(X) этой слу-\n" +
                "чайной величины.\n";
    };
}
