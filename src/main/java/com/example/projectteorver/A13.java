package com.example.projectteorver;

public class A13 extends Namber{
    double p0;
    double p1;
    double p2;
    double p3;
    A13(int seed) {
        super(seed);
        vero=(double) rand(5,8)/10;
        vsego = rand(4,6)*100;
        p0=Math.exp(-vero);
        p1=vero*Math.exp(-vero);
        p2=vero*vero*Math.exp(-vero)/2;
        p3=vero*vero*vero*Math.exp(-vero)/6;
    }
    public String get(){
        return ". Среди семян ржи содержится "+vero+"% семян сорняков.\n" +
                "Случайным образом взято "+vsego+" семян. Составить ряд рас-\n" +
                "пределения числа семян сорняков. Найти M(X) этой слу-\n" +
                "чайной величины.\n";
    }
    public String aswer(){
        double p01 = Math.round((p0 * 100.0) / 100.0);
        double p11 = Math.round((p1 * 100.0) / 100.0);
        double p21 = Math.round((p2 * 100.0) / 100.0);
        double p31 = Math.round((p3 * 100.0) / 100.0);
        return ". "+"M(X)="+vsego*vero/100+" Ряд распределения равен: "+p01+" "+p11+" "+p21+" "+p31+"...";
    }
}
