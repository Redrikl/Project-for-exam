package com.example.projectteorver;

public class A5 extends Namber{
    int n;
    int s=0;
    A5(int seed) {
        super(seed);
        vsego = rand(200,400);
        chast = rand(8,12);
        n = rand(3,5);
    }


    @Override
    public String get(){
        return ". Среди "+vsego+" лотерейных билетов — "+chast+" выигрышных.\n" +
                "Найти вероятность того, что 4 наудачу выбранных билета\n" +
                "окажутся выигрышными.\n";
    };
    public String aswer() {
        for(int i=0;i<n;i++)
            s+=(vsego-i)*(chast-i);
        return ". "+s+"\n";
    }
}