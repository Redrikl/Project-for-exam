package com.example.projectteorver;

public class A8 extends Namber{
    double v;
    double vero2;
    double vero3;
    double p1;
    double p2;
    double p3;
    A8(int seed) {
        super(seed);
        vsego = rand(4,7);
        v=(double) rand(6,9)/10;
        vero2=(double) rand(3,5)/10;
        vero3=(double) rand(1,3)/10;
    }


    @Override
    public String get(){

        return ". Вероятность забить пенальти для хорошо подготов-\n" +
                "ленного футболиста равна "+v+". Какова вероятность того\n" +
                "что из десяти пенальти он забьет не менее восьми?";
    };
    public String aswer() {
        p1=Math.pow(v,10);
        p2=Math.pow(v,9)*(1-v);
        p3=Math.pow(v,8)*(1-v)*(1-v);
        return ". "+p1+p2+p3+"\n";
    }
}